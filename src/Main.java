public class Main {
    public static void main(String[] args) {
        // Se genera el cine
        Cine cine = new Cine(3, "Terror en el instituto", 10);

        // Se llena el cine
        while (cine.butacasLibre() > 0){
            cine.venderEntrada();
            System.out.printf("Se vendió entrada. Cine lleno al: %s%n", cine.porcentajeOcupado());
        }
        cine.venderEntrada(); // Comprobar que no supera el aforo
        cine.vaciarSala(); // Vaciar sala
        cine.devolverEntrada(); // Comprobar que no baja de 0

        // Se compran las entradas
        cine.venderEntrada();
        cine.venderEntrada();

        System.out.printf("Dinero obtenido: %.2f$%n",cine.ingresosSala());
    }
}