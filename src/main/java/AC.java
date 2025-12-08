import javax.swing.*;

public class AC {
    private JPanel pan;
    public JPanel getPanelPrincipal() {
        return pan;
    }
    private JTextField textField1;
    private JLabel areaLabel;
    private JButton calcularButton;

    public AC(){
        calcularButton.addActionListener(e -> {
            try {
                double numero1 = Double.parseDouble(textField1.getText());
                double resultado = Workshop.areaCirculo(numero1);
                areaLabel.setText("Resultado: " + resultado);
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
