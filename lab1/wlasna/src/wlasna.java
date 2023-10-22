import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wlasna extends JFrame
{
    private JPanel zad2;
    private JTextField polePierwszej;
    private JButton dodajButton;
    private JButton odejmijButton;
    private JButton pomnozButton;
    private JButton podzielButton;
    private JButton zakonczButton;
    private JTextField poleDrugiej;
    private JTextField poleWyniku;
    private JLabel pierwsza;
    private JLabel druga;
    private JLabel wynik;

    double valueA, valueB, policzone;

    public static void main(String[] args)
    {
        wlasna wlasna = new wlasna();
        wlasna.setVisible(true);
    }
    public wlasna()
    {
        super("Kalkulator");
        this.setContentPane(this.zad2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 340, height = 300;
        this.setSize(width, height);

        dodajButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                valueA = Double.parseDouble(polePierwszej.getText());
                valueB = Double.parseDouble(poleDrugiej.getText());
                policzone = valueA + valueB;
                poleWyniku.setText(String.valueOf(policzone));
            }
        });
        odejmijButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                valueA = Double.parseDouble(polePierwszej.getText());
                valueB = Double.parseDouble(poleDrugiej.getText());
                policzone = valueA - valueB;
                poleWyniku.setText(String.valueOf(policzone));
            }
        });
        pomnozButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                valueA = Double.parseDouble(polePierwszej.getText());
                valueB = Double.parseDouble(poleDrugiej.getText());
                policzone = valueA * valueB;
                poleWyniku.setText(String.valueOf(policzone));
            }
        });
        podzielButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                valueA = Double.parseDouble(polePierwszej.getText());
                valueB = Double.parseDouble(poleDrugiej.getText());
                if(valueB==0)
                {
                   JOptionPane.showMessageDialog(null,"Nie można dzielić przez 0","Uwaga!",JOptionPane.WARNING_MESSAGE);
                }
                else
                    policzone = valueA / valueB;
                poleWyniku.setText(String.valueOf(policzone));
            }
        });
        zakonczButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });
    }
}
