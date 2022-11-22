package Model;

import javax.security.auth.login.AccountExpiredException;
import java.util.ArrayList;
import java.util.Objects;

public class media {
    private String fechaCreacion;
    private ArrayList<String> nombreAutor = new ArrayList<>();

    /**
     * constructor para "media"
     *
     * @param fechaCreacion
     * @author David Huertas
     * @since 8/11/2022
     */


    public media(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
        ArrayList<String> nombreAutor = new ArrayList<>();
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

    @Override
    public String toString() {
        return "media{" +
                "fechaCreacion='" + fechaCreacion + '\'' +
                ", nombreAutor='" + nombreAutor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof media media)) return false;
        return Objects.equals(getFechaCreacion(), media.getFechaCreacion()) && Objects.equals(nombreAutor, media.nombreAutor);
    }
}