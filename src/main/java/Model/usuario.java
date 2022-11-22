package Model;

public class usuario {

    private String nombreyApellido;
    private String edad;
    private String correo;
    private String username;
    private String password;
    private String foto;
    private String rol;

    /**
     * constructor para "usuario"
     *
     * @param nombreyApellido
     * @param edad
     * @param correo
     * @param username
     * @author David Huertas
     * @since 25/10/2022
     */

    public usuario(String nombreyApellido, String edad, String correo, String username) {
        this.nombreyApellido = nombreyApellido;
        this.edad = edad;
        this.correo = correo;
        this.username = username;
        this.password = password;
        this.foto = foto;
        this.rol = rol;
    }

    /**
     * setter para nombreyApellido
     * @author David Huertas
     * @since 25/10/2022
     */
    public void setnombreyApellido(String nombreyApellido) {
        this.nombreyApellido = nombreyApellido;
    }

    /**
     * getter para nombreyApellido
     * @author David Huertas
     * @since 25/10/2022
     */
    public String getnombreyApellido() {
        return nombreyApellido;
    }

    /**
     * setter para edad
     * @author David Huertas
     * @since 06/10/2022
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * getter para edad
     * @author David Huertas
     * @since 25/10/2022
     */
    public String getEdad() {
        return edad;
    }

    /**
     * setter para correo
     * @author David Huertas
     * @since 25/10/2022
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * getter para correo
     * @author David Huertas
     * @since 25/10/2022
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * setter para username
     * @author David Huertas
     * @since 25/10/2022
     */
    public void setUsername(String password) {
        this.username = username;
    }

    /**
     * getter para username
     * @author David Huertas
     * @since 25/10/2022
     */
    public String getUsername() {
        return username;
    }

    /**
     * setter para password
     * @author David Huertas
     * @since 25/10/2022
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * getter para password
     * @author David Huertas
     * @since 25/10/2022
     */
    public String getPassword() {
        return password;
    }

    /**
     * setter para foto
     * @author David Huertas
     * @since 25/10/2022
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * getter para foto
     * @author David Huertas
     * @since 25/10/2022
     */
    public String getFoto() {
        return foto;
    }

    /**
     * setter para rol
     * @author David Huertas
     * @since 25/10/2022
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * getter para rol
     * @author David Huertas
     * @since 25/10/2022
     */
    public String getRol() {
        return rol;
    }
}
