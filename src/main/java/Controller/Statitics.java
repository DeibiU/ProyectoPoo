package Controller;

import AccessData.AccessData;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Statitics {
    public static ArrayList<String> getUsersFromProjects() {
            ResultSet resultados = AccessData.getAllUsersFromProjects();
            ArrayList<String> usuarios = new ArrayList();
            try {
                while (resultados.next()) {

                    usuarios.add(resultados.getString("user"));
                }
                return usuarios;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
    }

    public static ArrayList<String> getUsersFromMedia() {
        ResultSet resultados = AccessData.getAllUsersFromMedia();
        ArrayList<String> usuarios = new ArrayList();
        try {
            while (resultados.next()) {

                usuarios.add(resultados.getString("authorName"));
            }
            return usuarios;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
