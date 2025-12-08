import javax.swing.*;

public class Invertir {
    private JTextField textField1;
    private JPanel pan;
    private JLabel dfssd;
    private JButton Calcular;

    public JPanel getPanelPrincipal() {
        return pan;
    }
    public Invertir(){
        Calcular.addActionListener(e -> {
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
                int[] resultado = Workshop.invertirArreglo(numeros);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < resultado.length; i++) {
                    sb.append(resultado[i]);
                    if (i < resultado.length - 1) {
                        sb.append(","); // separador opcional
                    }
                }
                String resultadoi = sb.toString();
                dfssd.setText(" "+resultadoi);

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
