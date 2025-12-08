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
                String texto = textField1.getText();
                String[] arreglo = texto.split(",");

                for (int i = 0; i < arreglo.length; i++) {
                    arreglo[i] = arreglo[i].trim();
                }
                int[] numeros = new int[arreglo.length];
                for (int i = 0; i < arreglo.length; i++) {
                    numeros[i] = Integer.parseInt(arreglo[i]);
                }


                int numero2 = Integer.parseInt(textField2.getText());
                boolean resultado = Workshop.buscarElemento(numeros,numero2);
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
