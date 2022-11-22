package Model;

import javax.security.auth.login.AccountExpiredException;
import java.util.ArrayList;

public class media {
    private String fechaCreacion;
    private ArrayList<String> nombreAutor = new ArrayList<>();

    /**
     * constructor para "media"
     *
     * @param fechaCreacion
     * @param nombreAutor
     * @author David Huertas
     * @since 8/11/2022
     */


    public media(String fechaCreacion, ArrayList<String> nombreAutor, ArrayList<String> archivos) {
        this.fechaCreacion = fechaCreacion;
        this.nombreAutor = nombreAutor;
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
     * @since 8/11/2022
     */
    public String getnombreAutor() {
        return nombreAutor;
    }

    /**
     * setter para nombreAutor
     * @author David Huertas
     * @since 8/11/2022
     */
    public void setnombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }


    @Override
    public String toString() {
        return "media{" +
                "fechaCreacion='" + fechaCreacion + '\'' +
                ", nombreAutor='" + nombreAutor + '\'' +
                '}';
    }
}
