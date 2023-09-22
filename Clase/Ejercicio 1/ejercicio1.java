class ejercicio1 {
    public static void main(String[] args) {

        String jose = "Jose";
        hola2(jose);
        System.out.println(hola1("Pepito"));
        
    }

    public static String hola1(String pepito) {
        return "Hola Don " + pepito;
    }

    public static void hola2(String jose) {
        System.out.println("Hola Don " + jose);
    }   
}