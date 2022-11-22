package Model;

import java.util.ArrayList;

public class proyecto {

    private String direccion;
    private String nombre;
    private String categoria;
    private String fechaCreacion;
    private String ultimaModificacion;
    private String repositorio;



    public proyecto (String direccion, String nombre, String categoria, String fechaCreacion, String ultimaModificacion, String repositorio) {

        this.direccion = direccion;
        this.nombre = nombre;
        this.categoria = categoria;
        this.fechaCreacion = fechaCreacion;
        this.ultimaModificacion = ultimaModificacion;
        this.repositorio = repositorio;
        this.investigaciones = investigaciones;
        this.medias = medias;
    }

    /**
     * getter para direccion
     * @author David Huertas
     * @since 8/11/2022
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * setter para direccion
     * @author David Huertas
     * @since 8/11/2022
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * getter para nombre
     * @author David Huertas
     * @since 8/11/2022
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter para nombre
     * @author David Huertas
     * @since 8/11/2022
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter para categoria
     * @author David Huertas
     * @since 8/11/2022
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * setter para categoria
     * @author David Huertas
     * @since 8/11/2022
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * getter para fechaCreacion
     * @author David Huertas
     * @since 8/11/2022
     */
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * setter para fechaCreacion
     * @author David Huertas
     * @since 8/11/2022
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * getter para ultimaModificacion
     * @author David Huertas
     * @since 8/11/2022
     */
    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    /**
     * setter para ultimaModificacion
     * @author David Huertas
     * @since 8/11/2022
     */
    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    /**
     * getter para repositorio
     * @author David Huertas
     * @since 8/11/2022
     */
    public String getRepositorio() {
        return repositorio;
    }

    /**
     * setter para repositorio
     * @author David Huertas
     * @since 8/11/2022
     */
    public void setRepositorio(String repositorio) {
        this.repositorio = repositorio;
    }

    /**
     * getter para investigaciones
     * @author David Huertas
     * @since 8/11/2022
     */
    public ArrayList<investigacion> getInvestigaciones() {
        return investigaciones;
    }

    /**
     * setter para investigaciones
     * @author David Huertas
     * @since 8/11/2022
     */
    public void setInvestigaciones(ArrayList<investigacion> investigaciones) {
        this.investigaciones = investigaciones;
    }

    /**
     * getter para medias
     * @author David Huertas
     * @since 8/11/2022
     */
    public ArrayList<media> getMedias() {
        return medias;
    }

    /**
     * setter para medias
     * @author David Huertas
     * @since 8/11/2022
     */
    public void setMedias(ArrayList<media> medias) {
        this.medias = medias;
    }

}
