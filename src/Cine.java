public class Cine {
    private int aforo;
    private int butacasOcupadas;
    private String tituloPelicula;
    private double precioEntrada;

    /**
     * Constructor con valores predeterminados
     * Aforo: 100 | Ocupadas: 0 | Titulo: Sin determinar | Precio: 5
     */
    public Cine() {
        this(100);
    }

    /**
     * Constructor con valores predeterminados
     * Ocupadas: 0 | Titulo: Sin determinar | Precio: 5
     * @param aforo El aforo máximo del cine
     */
    public Cine(int aforo) {
        this(aforo, "Sin determinar", 5);
    }

    /**
     * Constructor personalizado. Se inicia con 0 asientos ocupados
     * @param aforo Aforo máximo
     * @param tituloPelicula Titulo
     * @param precioEntrada Precio con decimales
     */
    public Cine(int aforo, String tituloPelicula, double precioEntrada) {
        this.aforo = aforo;
        this.butacasOcupadas = 0;
        this.tituloPelicula = tituloPelicula;
        this.precioEntrada = precioEntrada;
    }

    public int getAforo() { return aforo; }
    public void setAforo(int aforo) { this.aforo = aforo; }

    public int getButacasOcupadas() { return butacasOcupadas; }
    public void setButacasOcupadas(int butacasOcupadas) {
        this.butacasOcupadas = butacasOcupadas; }

    public String getTituloPelicula() { return tituloPelicula; }
    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula; }

    public double getPrecioEntrada() { return precioEntrada; }
    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada; }
}
