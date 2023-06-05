public class Videojuego {

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String companyia;

    private int HORAS_ESTIMADAS_PREDEF = 10;
    private boolean ENTREGADO_PREDEF = false;

    public Videojuego() {
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, boolean entregado, String genero, String companyia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregado;
        this.genero = genero;
        this.companyia = companyia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompanyia() {
        return companyia;
    }

    public void setCompanyia(String companyia) {
        this.companyia = companyia;
    }

    public int getHORAS_ESTIMADAS_PREDEF() {
        return HORAS_ESTIMADAS_PREDEF;
    }

    public void setHORAS_ESTIMADAS_PREDEF(int HORAS_ESTIMADAS_PREDEF) {
        this.HORAS_ESTIMADAS_PREDEF = HORAS_ESTIMADAS_PREDEF;
    }

    public boolean isENTREGADO_PREDEF() {
        return ENTREGADO_PREDEF;
    }

    public void setENTREGADO_PREDEF(boolean ENTREGADO_PREDEF) {
        this.ENTREGADO_PREDEF = ENTREGADO_PREDEF;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", companyia='" + companyia + '\'' +
                ", HORAS_ESTIMADAS_PREDEF=" + HORAS_ESTIMADAS_PREDEF +
                ", ENTREGADO_PREDEF=" + ENTREGADO_PREDEF +
                '}';
    }

}
