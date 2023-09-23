import java.util.*;

public class miniCalculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el primer número");
        Integer num1 = entrada.nextInt();
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Dime el segundo número");
        Integer num2 = entrada2.nextInt();


        System.out.println("La suma de " + num1 + " + "  + num2 + ". Es igual a " + (num1+num2));
        System.out.println("La resta de " + num1 + " - "  + num2 + ". Es igual a " + (num1-num2));
        System.out.println("La multiplicacion de " + num1 + " + "  + num2 + ". Es igual a " + (num1*num2));
        System.out.println("La division de " + num1 + " + "  + num2 + ". Es igual a " + (num1/num2));        
    }
}
