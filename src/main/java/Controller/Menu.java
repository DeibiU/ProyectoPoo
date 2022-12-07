package Controller;

import AccessData.AccessData;
import Model.Proyecto;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Menu {

    public static ArrayList getProject() {
        ResultSet resultados = AccessData.getAllProjects();
        ArrayList<Proyecto> proyectos = new ArrayList();
        try {
            while (resultados.next()) {
                Proyecto proyecto = new Proyecto();
                proyecto.setDireccion(resultados.getString("direccion"));
                proyecto.setNombre(resultados.getString("nombre"));
                proyecto.setCategoria(resultados.getString("categoria"));
                proyecto.setFechaCreacion(resultados.getString("fecha"));

                proyectos.add(proyecto);
            }
            return proyectos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
