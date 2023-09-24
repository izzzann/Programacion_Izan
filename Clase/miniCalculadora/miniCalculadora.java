import java.util.*;

public class miniCalculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el primer número");
        Double num1 = entrada.nextDouble();
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Dime el segundo número");
        Double num2 = entrada2.nextDouble();


        System.out.println("La suma de " + num1 + " + "  + num2 + ". Es igual a " + (num1+num2));
        System.out.println("La resta de " + num1 + " - "  + num2 + ". Es igual a " + (num1-num2));
        System.out.println("La multiplicacion de " + num1 + " + "  + num2 + ". Es igual a " + (num1*num2));
        System.out.println("La division de " + num1 + " + "  + num2 + ". Es igual a " + (num1/num2));        
    }
}
