import javax.swing.JOptionPane;

public class Calculadora {
    public static void main (String... args) {
        // vou começar a soma
        int op = Integer.parseInt(JOptionPane.showInputDialog("1-soma 2-Subtracao"));
        int a = Integer.parseInt(
            JOptionPane.showInputDialog("Primeiro Operando")
        
        );
        int b = Integer.parseInt(
            JOptionPane.showInputDialog("Segundo Operando")
        );
        //soma implementada...
        int res;
        if (op == 1) {
            res = a + b;
        }
        else {
            res = a - b;
        }
        // Exibindo o Resultado...
        JOptionPane.showMessageDialog(null, res);
    }
}