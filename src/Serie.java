public class Serie {


    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    private int NUMERO_TEMPORADAS_PREDEF = 3;
    private boolean ENTREGADO_PREDEF = false;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, boolean entregado, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = entregado;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getNUMERO_TEMPORADAS_PREDEF() {
        return NUMERO_TEMPORADAS_PREDEF;
    }

    public void setNUMERO_TEMPORADAS_PREDEF(int NUMERO_TEMPORADAS_PREDEF) {
        this.NUMERO_TEMPORADAS_PREDEF = NUMERO_TEMPORADAS_PREDEF;
    }

    public boolean isENTREGADO_PREDEF() {
        return ENTREGADO_PREDEF;
    }

    public void setENTREGADO_PREDEF(boolean ENTREGADO_PREDEF) {
        this.ENTREGADO_PREDEF = ENTREGADO_PREDEF;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", NUMERO_TEMPORADAS_PREDEF=" + NUMERO_TEMPORADAS_PREDEF +
                ", ENTREGADO_PREDEF=" + ENTREGADO_PREDEF +
                '}';
    }
}
