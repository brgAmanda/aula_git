import javax.swing.JOptionPane;

public class Calculadora {
    public static void main (String... args) {
        // vou começar a soma
        int a = Integer.parseInt(
            JOptionPane.showInputDialog("Primeiro Operando")
        
        );
        int b = Integer.parseInt(
            JOptionPane.showInputDialog("Segundo Operando")
        );
        int res = a + b;
        JOptionPane.showMessageDialog(null, res);
    }
}