public class ejercicio3 {
    public static void main(String[] args) {
        
        String Skain = "Skain: ";

        System.out.println(hola4(Skain));

        System.out.println(hola3());

    }
    
    /*Defino el string en el mismo metodo y hago el print en el main*/
    public static String hola3(){
        String yow = "yow";
        return yow;
    }

    /*Defino el string en el main y hago el print en el main*/
    public static String hola4(String Skain){
        return  Skain;
    }
}
