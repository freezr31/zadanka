package pakycz;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main()
    {
        super("Układ Graficzny (Layout)");
        this.setBounds(300,300,600,600);

        initComponents();
        this.setDefaultCloseOperation(3);
    }

    public void initComponents()
    {
        centrum = new JButton("Anuluj");
        gora = new JButton("Jestem na górze");
        dol = new JButton("Jestem na dole");
        prawa = new JButton("Jestem po prawej stronie");
        lewa = new JButton("Jestem po lewej stronie");

        Container kontener = this.getContentPane();

        centrum.setLocation(250, 250);
        centrum.setSize(centrum.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(centrum);

        gora.setLocation(250, 0);
        gora.setSize(gora.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(gora);

        dol.setLocation(250, 535);
        dol.setSize(dol.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(dol);

        prawa.setLocation(405, 250);
        prawa.setSize(prawa.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(prawa);

        lewa.setLocation(0, 250);
        lewa.setSize(lewa.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(lewa);


    }

    JButton centrum;
    JButton gora;
    JButton dol;
    JButton prawa;
    JButton lewa;

    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
}
