import javax.swing.*;

class calculadora{
public static void main(String[] args) {
    suma();
    resta();
    multiplicacion();
    division();
}

public static void suma(){
    
    Double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Dime el primer numero", "SUMA", 3));
    Double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Dime el segundo numero", "SUMA", 3));
    System.out.println("El resultado de la suma es " + (num1 + num2));
}

public static void resta(){
    
    Double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Dime el primer numero", "RESTA", 3));
    Double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Dime el primer numero", "RESTA", 3));
    System.out.println("El resultado de la resta es " + (num1 - num2));
}

public static void multiplicacion(){
    
    Double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Dime el primer numero", "MULTIPLICACION", 3));
    Double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Dime el primer numero", "MULTIPLICACION", 3));
    System.out.println("El resultado de la multiplicacion es " + (num1 * num2));
}

public static void division(){
    
    Double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Dime el primer numero", "DIVISION", 3));
    Double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Dime el primer numero", "DIVISON", 3));
    System.out.println("El resultado de la division es " + (num1 / num2));
}

}