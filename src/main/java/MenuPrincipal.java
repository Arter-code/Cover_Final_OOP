import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MenuPrincipal extends JFrame {
    private JPanel Menuprincipal;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    public static void main(String[] args) {
        JFrame frame = new JFrame("MenuPrin");
        frame.setContentPane(new MenuPrincipal().Menuprincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public JPanel getPanelPrincipal(){return Menuprincipal;}
    public MenuPrincipal(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    JFrame frame = new JFrame("Mi Ventana Swing");
                    frame.setContentPane(new MenuO().getPanelPrincipal());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setLocationRelativeTo(null); // Centra la ventana
                    frame.setVisible(true);
                });

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    JFrame frame = new JFrame("Mi Ventana Swing");
                    frame.setContentPane(new MenuM().getPanelPrincipal());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setLocationRelativeTo(null); // Centra la ventana
                    frame.setVisible(true);
                });

            }
        });
    }
}



