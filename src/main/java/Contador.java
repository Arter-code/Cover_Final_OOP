import javax.swing.*;

public class Contador {
    private JTextField textField1;
    private JPanel pan;
    private JButton button1;
    private JLabel cantidadDeCaracteresLabel;

    public JPanel getPanelPrincipal() {
        return pan;
    }
    public Contador(){
        button1.addActionListener(e -> {
            try {
                String numero1 = textField1.getText();
                int resultado = Workshop.contarCaracteres(numero1);
                cantidadDeCaracteresLabel.setText("Cantidad de caracteres: " + resultado);

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
