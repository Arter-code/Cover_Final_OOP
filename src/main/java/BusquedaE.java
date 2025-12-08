import javax.swing.*;

public class BusquedaE {
    private JTextField textField2;
    private JButton buscarButton;
    private JTextField textField1;
    private JPanel pan;
    private JLabel entraEnLaPosicionLabel;
    public JPanel getPanelPrincipal() {
        return pan;
    }
    public BusquedaE(){
        buscarButton.addActionListener(e -> {
            try {
                int numero = Integer.parseInt(textField1.getText());
                String texto = String.valueOf(numero);
                int[] numero1 = new int[texto.length()];
                for (int i = 0; i < texto.length(); i++) {
                    numero1[i] = Character.getNumericValue(texto.charAt(i));
                }
                int numero2 = Integer.parseInt(textField2.getText());
                boolean resultado = Workshop.buscarElemento(numero1,numero2);
                if (resultado){
                    entraEnLaPosicionLabel.setText("El elemento se encuentra en el arreglo");
                } else {
                    entraEnLaPosicionLabel.setText("El elemento no se encuentra en el arreglo");
                }

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
