package Model;

import java.util.ArrayList;

public class investigacion {
    private String titulo;
    private String subtitulo;
    private String categoria;
    private String tema;
    private ArrayList<String> nombreAutor = new ArrayList<>();
    private String repositorio;
    private ArrayList<String> idMedia = new ArrayList<>();

    /**
     * constructor para "investigacion"
     *
     * @param titulo
     * @param subtitulos
     * @param categoria
     * @param tema
     * @param nombreAutor
     * @param repositorio
     * @author David Huertas
     * @since 8/11/2022
     */

    public investigacion(String titulo, String subtitulos, String categoria, String tema, ArrayList nombreAutor, String repositorio) {
        this.titulo = titulo;
        this.subtitulo = subtitulos;
        this.categoria = categoria;
        this.tema = tema;
        this.nombreAutor = nombreAutor;
        this.repositorio = repositorio;
        ArrayList<String> idMedia = new ArrayList<>();
    }

    /**
     * getter para titulo
     * @author David Huertas
     * @since 8/11/2022
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * setter para titulo
     * @author David Huertas
     * @since 8/11/2022
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * getter para subtitulos
     * @author David Huertas
     * @since 8/11/2022
     */
    public String getSubtitulos() {
        return subtitulo;
    }

    /**
     * setter para subtitulos
     * @author David Huertas
     * @since 8/11/2022
     */
    public void setSubtitulos(String subtitulos) {
        this.subtitulo = subtitulo;
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
     * getter para tema
     * @author David Huertas
     * @since 8/11/2022
     */
    public String getTema() {
        return tema;
    }

    /**
     * setter para tema
     * @author David Huertas
     * @since 8/11/2022
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * getter para nombreAutor
     * @author David Huertas
     * @since 8/11/2022
     */
    public ArrayList getNombreAutor() {
        return nombreAutor;
    }

    /**
     * setter para nombreAutor
     * @author David Huertas
     * @since 8/11/2022
     */
    public void setNombreAutor(ArrayList nombreAutor) {
        this.nombreAutor = nombreAutor;
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
     * getter para idMedia
     * @author David Huertas
     */
    public ArrayList<String> getidMedia() {
        return idMedia;
    }

    /**
     * setter para idMedia
     * @author David Huertas
     */
    public void setidMedia(ArrayList<String> idMedia) {this.idMedia = idMedia;}

    @Override
    public String toString() {
        return "investigacion{" +
                "titulo='" + titulo + '\'' +
                ", subtitulo='" + subtitulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", tema='" + tema + '\'' +
                ", nombreAutor=" + nombreAutor +
                ", repositorio='" + repositorio + '\'' +
                ", idMedia='" + idMedia + '\'' +
                '}';
    }
}
