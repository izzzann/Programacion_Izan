public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println(obtenerSaludoDeDonPepito("pepito"));
    }

    public static String obtenerSaludoDeDonPepito(String nombre){
        String saludo;
        saludo = "Hola Don " + nombre;
        return saludo;
    }
}
