package Model;

import javax.security.auth.login.AccountExpiredException;
import java.util.ArrayList;
import java.util.Objects;

public class media {
    private String fechaCreacion;
    private ArrayList<String> nombreAutor = new ArrayList<>();
    private String direccion;

    /**
     * constructor para "media"
     *
     * @param fechaCreacion
     * @author David Huertas
     * @since 8/11/2022
     */


    public media(String fechaCreacion, String direccion) {
        this.fechaCreacion = fechaCreacion;
        ArrayList<String> nombreAutor = new ArrayList<>();
        this.direccion = direccion;
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
     * getter para nombreAutor
     * @author David Huertas
     */
    public ArrayList<String> getnombreAutor() {
        return nombreAutor;
    }

    /**
     * setter para nombreAutor
     * @author David Huertas
     */
    public void setnombreAutor(ArrayList<String> nombreAutor) {this.nombreAutor = nombreAutor;}

    /**
     * getter para direccion
     * @author David Huertas
     * @since 8/11/2022
     */
    public String getdireccion() {
        return direccion;
    }

    /**
     * setter para direccion
     * @author David Huertas
     * @since 8/11/2022
     */
    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "media{" +
                "fechaCreacion='" + fechaCreacion + '\'' +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        media media = (media) o;
        return Objects.equals(fechaCreacion, media.fechaCreacion) && Objects.equals(nombreAutor, media.nombreAutor) && Objects.equals(direccion, media.direccion);
    }
}