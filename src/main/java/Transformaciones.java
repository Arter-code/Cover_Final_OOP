import javax.swing.*;

public class Transformaciones {
    private JTextField textField1;
    private JLabel textoEnMayusculasLabel;
    private JLabel textoEnMinusculasLabel;
    private JButton button1;
    private JPanel pan;
    private JLabel textoInvertidoLabel;

    public JPanel getPanelPrincipal() {
        return pan;
    }
    public Transformaciones(){
        button1.addActionListener(e -> {
            try {
                String numero1 = textField1.getText();
                String resultado = Workshop.convertirAMayusculas(numero1);
                String resultado2 = Workshop.convertirAMinusculas(numero1);
                String resultado3 = Workshop.invertirCadena(numero1);
                textoEnMayusculasLabel.setText("Texto en mayusculas: " + resultado);
                textoEnMinusculasLabel.setText("Texto en minusculas: " + resultado2);
                textoInvertidoLabel.setText("Texto invertido: "+resultado3);

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
