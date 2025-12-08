import javax.swing.*;

public class SumaE {
    private JTextField textField1;
    private JButton calcularButton;
    private JPanel pan;
    private JLabel sumaDeElementosLabel;
    private JLabel promedioDeElementosLabel;
    private JLabel elementoMayorLabel;
    private JLabel elementoMenorLabel;

    public JPanel getPanelPrincipal() {
        return pan;
    }
    public SumaE(){
        calcularButton.addActionListener(e -> {
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
                int resultado = Workshop.sumaElementos(numeros);
                double resultado2= Workshop.promedioElementos(numeros);
                int resultado3= Workshop.encontrarElementoMayor(numeros);
                int resultado4= Workshop.encontrarElementoMenor(numeros);
                sumaDeElementosLabel.setText("Suma de elementos: " + resultado);
                promedioDeElementosLabel.setText("Promedio de elementos: "+ resultado2);
                elementoMayorLabel.setText("Elemento mayor: "+ resultado3);
                elementoMenorLabel.setText("Elemento menor: "+ resultado4);

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
