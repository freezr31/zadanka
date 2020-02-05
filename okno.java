package pakycz;

import javax.swing.*;

public class okno extends JFrame {
    public okno ()
    {

        super("Moja ramka");

        this.setBounds(300, 300, 500, 500);

        this.setDefaultCloseOperation(3);
    }
    public static void main (String[] args)
    {
        new okno().setVisible(true);
    }
}
