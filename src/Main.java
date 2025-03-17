public class Main {
    public static void main(String[] args) {
        Cine cine = new Cine(6, "Terror en el instituto", 10);
        System.out.println(cine.butacasLibre());
        System.out.println(cine.porcentajeOcupado());
    }
}