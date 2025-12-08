import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuP {
    private JButton campoDeTextoMultilineaButton;
    private JButton transformacionesMayúsculasMinúsculasInvertirButton;
    private JButton verificaciónDePalíndromosButton;
    private JButton contadorDeCaracteresYButton;
    private JButton búsquedaYReemplazoDeButton;
    private JButton validadorDeCorreosElectrónicosButton;
    private JPanel pan;
    public JPanel getPanelPrincipal() {
        return pan;
    }
    public MenuP(){
        contadorDeCaracteresYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    JFrame frame = new JFrame("Contador");
                    frame.setContentPane(new Contador().getPanelPrincipal());
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                });

            }
        });
        transformacionesMayúsculasMinúsculasInvertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    JFrame frame = new JFrame("Transformaciones");
                    frame.setContentPane(new Transformaciones().getPanelPrincipal());
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                });

            }
        });
    }
}
