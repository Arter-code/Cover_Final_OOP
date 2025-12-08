import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuM {
    private JPanel pan;
    private JButton entradaDeArreglosMedianteButton;
    private JButton visualizaciónDelArregloOriginalButton;
    private JButton operacionesDisponiblesOrdenarInvertirButton;
    private JButton búsquedaDeElementosButton;
    private JButton cálculoDeMayorMenorButton;
    private JButton cálculoDeMayorMenorButton2;

    public JPanel getPanelPrincipal() {
        return pan;
    }
    public MenuM(){
        cálculoDeMayorMenorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    JFrame frame = new JFrame("Calculo de numero mayor");
                    frame.setContentPane(new Mayor().getPanelPrincipal());
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                });

            }
        });
        cálculoDeMayorMenorButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    JFrame frame = new JFrame("Calculo de numero mayor");
                    frame.setContentPane(new SumaE().getPanelPrincipal());
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                });

            }
        });
    }
}
