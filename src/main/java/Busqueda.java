import javax.swing.*;
public class Busqueda {
    private JPanel pan;
    private JTextArea textArea1;
    private JTextField textField1;
    private JLabel laPalabraEstaEnLabel;
    private JButton button1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel sad;
    public JPanel getPanelPrincipal() {
        return pan;
    }
    public Busqueda() {
        button1.addActionListener(e -> {
            try {
                String numero1 = textArea1.getText();
                String numero2 = textField1.getText();
                String numero3 = textField2.getText();
                String numero4 = textField3.getText();
                int resultado = Workshop.buscarSubcadena(numero1, numero2);
                String resultado2= Workshop.reemplazarSubcadena(numero1,numero3,numero4);
                laPalabraEstaEnLabel.setText("La palabra esta en la posicion: " + resultado);
                sad.setText(resultado2);
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
