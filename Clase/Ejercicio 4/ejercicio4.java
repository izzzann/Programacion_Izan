import javax.swing.*;

public class ejercicio4 {
    public static void main(String[] args) {

        Boolean salir = true;

        while (salir == true) {
            Integer introduceNumero = Integer.parseInt(JOptionPane
                    .showInputDialog("Opcion 1 - While \n Opcion 2 - Do While \n Opcion 3 - For \n Opcion 4 - Salir"));
            if (introduceNumero == 1) {
                int counter = 0;

                while (counter <= 30) {
                    if (counter % 2 != 0) {
                        System.out.println(counter);
                    }
                    counter++;
                }
            }

            if (introduceNumero == 2) {
                int counter1 = 0;

                do {
                    if (counter1 % 2 != 0) {
                        System.out.println(counter1);
                    }
                    counter1++;
                } while (counter1 <= 30);
            }

            if (introduceNumero == 3) {
                for (int counter2 = 0; counter2 <= 30; counter2++) {
                    if (counter2 % 2 != 0) {
                        System.out.println(counter2);
                    }
                }
            }

            if (introduceNumero == 4) {
                salir = false;
            }
        }
    }
}
