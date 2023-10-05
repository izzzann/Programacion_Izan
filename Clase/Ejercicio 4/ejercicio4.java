import javax.swing.*;

public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Elige la opcion 1, 2 o 3");
        Integer introduceNumero = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
        switch (introduceNumero) {
            
            case 1:
                int counter = 0;

                while (counter <= 30) {
                    if (counter % 2 != 0) {
                        System.out.println(counter);
                    }
                    counter++;
                }

            case 2:
                int counter1 = 0;

                do {
                    if (counter1 % 2 != 0) {
                        System.out.println(counter1);
                    }
                    counter1++;
                } while (counter1 <= 30);

            case 3:
                for (int counter2 = 0; counter2 <= 30; counter2++) {
                    if (counter2 % 2 != 0) {
                        System.out.println(counter2);
                    }
                }
        }
    }
}
