import javax.swing.*;
import java.util.*;

public class calculadoraDefinitiva {
    public static void main(String[] args) {
        Double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Dime el primer número", "CALCULADORA", 3));
        Double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Dime el segundo número", "CALCULADORA", 3));

        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qué operacion quieres hacer?");
        System.out.println("1.SUMA");
        System.out.println("2.RESTA");
        System.out.println("3.MULTIPLICACION");
        System.out.println("4.DIVISION");
        Double operacion = entrada.nextDouble();
        if (operacion == 1){
            System.out.println(num1 + num2);
            }
        if (operacion == 2){
                System.out.println(num1 - num2);
            }
        if (operacion == 3){
                System.out.println(num1 * num2);
            }
         if (operacion == 4){
                System.out.println(num1 / num2);
            }
    }
}
