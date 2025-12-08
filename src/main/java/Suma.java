import javax.swing.*;

public class Suma {
    private JPanel pan;
    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel resultadoLabel;
    private JLabel sumar2NumerosLabel;
    public static int result;
    public int a;
    public int b;

    public JPanel getPanelPrincipal() {
        return pan;
    }
public Suma(){
    button1.addActionListener(e -> {
        try {
            int numero1 = Integer.parseInt(textField1.getText());
            int numero2 = Integer.parseInt(textField2.getText());
            int resultado = Workshop.sumarDosNumeros(numero1,numero2);
            result=resultado;
            resultadoLabel.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ingrese números válidos",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    });
}
}