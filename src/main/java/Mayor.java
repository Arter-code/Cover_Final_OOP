import javax.swing.*;

public class Mayor {
    private JPanel pan;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton revisarButton;
    private JLabel elNumeroMayorEsLabel;

    public JPanel getPanelPrincipal() {
        return pan;
    }


    public Mayor(){
        revisarButton.addActionListener(e -> {
            try {
                int numero1 = Integer.parseInt(textField1.getText());
                int numero2 = Integer.parseInt(textField2.getText());
                int numero3 = Integer.parseInt(textField2.getText());
                int resultado = Workshop.mayorDeTresNumeros(numero1,numero2,numero3);
                elNumeroMayorEsLabel.setText("El numero mayor es: " + resultado);
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
