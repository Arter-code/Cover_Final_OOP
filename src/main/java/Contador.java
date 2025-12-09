import javax.swing.*;

public class Contador {
    private JTextField textField1;
    private JPanel pan;
    private JButton button1;
    private JLabel cantidadDeCaracteresLabel;
    private JLabel cantidadDePalabrasLabel;
    private JTextPane textPane1;

    public JPanel getPanelPrincipal() {
        return pan;
    }
    public Contador(){
        button1.addActionListener(e -> {
            try {
                String numero1 = textPane1.getText();
                int resultado = Workshop.contarCaracteres(numero1);
                int resultado2 = Workshop.contarPalabras(numero1);
                cantidadDeCaracteresLabel.setText("Cantidad de caracteres: " + resultado);
                cantidadDePalabrasLabel.setText("Cantidad de palabras: " + resultado2);

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
