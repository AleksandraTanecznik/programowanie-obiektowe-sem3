import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class konwersja extends JFrame
{
    private JPanel Konwerter;
    private JButton konwertuj;
    private JTextField wpisywanie;
    private JTextField wynik;
    private JLabel Celsjusze;
    private JLabel Farenheit;

    public static void main(String[] args)
    {
        konwersja konwersja = new konwersja();
        konwersja.setVisible(true);
    }


    public konwersja()
    {
        super("Konwerter stopni");
        this.setContentPane(this.Konwerter);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);


        konwertuj.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String c = wpisywanie.getText();
                Double a = Double.parseDouble(c);
                Double f = (a * 1.8) + 32;
                String s = String.valueOf(f);
                wynik.setText(s);

            }
        });
    }
}
