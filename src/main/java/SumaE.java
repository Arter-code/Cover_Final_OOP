import javax.swing.*;

public class SumaE {
    private JTextField textField1;
    private JButton calcularButton;
    private JPanel pan;
    private JLabel sumaDeElementosLabel;

    public JPanel getPanelPrincipal() {
        return pan;
    }
    public SumaE(){
        calcularButton.addActionListener(e -> {
            try {
                int numero = Integer.parseInt(textField1.getText());
                String texto = String.valueOf(numero);
                int[] numero1 = new int[texto.length()];
                for (int i = 0; i < texto.length(); i++) {
                    numero1[i] = Character.getNumericValue(texto.charAt(i));
                }
                int resultado = Workshop.sumaElementos(numero1);
                sumaDeElementosLabel.setText("Suma de elementos: " + resultado);
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
