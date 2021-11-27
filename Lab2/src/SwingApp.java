import javax.swing.*;
import java.awt.event.*;

public class SwingApp extends JFrame{
    private JLabel Wybierz;
    private JRadioButton Kwadrat;
    private JRadioButton Trojkat;
    private JRadioButton Trapez;
    private JRadioButton Szescian;
    private JRadioButton Prostopadloscian;
    private JRadioButton Walec;
    private JRadioButton Kula;
    private JLabel Bok_A;
    private JLabel Bok_B;
    private JLabel Wysokosc;
    private JLabel Promien;
    private JTextField b_t;
    private JTextField h_t;
    private JTextField r_t;
    private JTextField a_t;
    private JTextField pole_t;
    private JLabel Pole;
    private JLabel Obwod;
    private JTextField objetosc_t;
    private JLabel Objetosc;
    private JTextField obwod_t;
    private JRadioButton Prostokat;
    private JButton Oblicz;
    private JButton Wyczysc;
    private JPanel Main;
    private JTextField d_t;
    private JLabel Bok_D;

    private double a,b,h,r,pole,obwod,objetosc,c,d;

    public SwingApp(){
        super("Figury geometryczne - kalkulator");
        this.setContentPane(this.Main);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLayout(null);

        //Wyłączenie pól tekstowych/ich widoczności
        a_t.setEnabled(false);
        b_t.setEnabled(false);
        h_t.setEnabled(false);
        r_t.setEnabled(false);
        pole_t.setEnabled(false);
        objetosc_t.setEnabled(false);
        obwod_t.setEnabled(false);
        Bok_D.setVisible(false);
        d_t.setVisible(false);

        //Sprawdzenie buttona i ustawienie odpowiednich pól
        Kwadrat.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    a_t.setEnabled(true);
                }
                else{
                    a_t.setEnabled(false);
                    a_t.setText(" ");
                    pole_t.setText(" ");
                    obwod_t.setText(" ");
                }
            }
        });

        Prostokat.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    a_t.setEnabled(true);
                    b_t.setEnabled(true);
                }
                else{
                    a_t.setEnabled(false);
                    b_t.setEnabled(false);
                    a_t.setText(" ");
                    b_t.setText(" ");
                    pole_t.setText(" ");
                    obwod_t.setText(" ");
                }
            }
        });

        Trojkat.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    a_t.setEnabled(true);
                    b_t.setEnabled(true);
                    r_t.setEnabled(true);
                    h_t.setEnabled(true);
                    Promien.setText("Podaj bok c");
                }
                else{
                    a_t.setEnabled(false);
                    b_t.setEnabled(false);
                    r_t.setEnabled(false);
                    h_t.setEnabled(false);
                    Promien.setText("Podaj promień");

                    a_t.setText(" ");
                    b_t.setText(" ");
                    h_t.setText(" ");
                    r_t.setText(" ");
                    pole_t.setText(" ");
                    obwod_t.setText(" ");
                }
            }
        });

        Trapez.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    a_t.setEnabled(true);
                    b_t.setEnabled(true);
                    h_t.setEnabled(true);
                    r_t.setEnabled(true);
                    Promien.setText("Podaj bok c:");
                    Bok_D.setVisible(true);
                    d_t.setVisible(true);
                }
                else{
                    a_t.setEnabled(false);
                    b_t.setEnabled(false);
                    h_t.setEnabled(false);
                    r_t.setEnabled(false);
                    Bok_D.setVisible(false);
                    d_t.setVisible(false);
                    Promien.setText("Podaj promień");
                    r_t.setText(" ");
                    a_t.setText(" ");
                    b_t.setText(" ");
                    h_t.setText(" ");
                    pole_t.setText(" ");
                    obwod_t.setText(" ");
                    d_t.setText(" ");
                }
            }
        });

        Szescian.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    a_t.setEnabled(true);
                }
                else{
                    a_t.setEnabled(false);
                    a_t.setText(" ");
                    pole_t.setText(" ");
                    objetosc_t.setText(" ");
                }
            }
        });

        Prostopadloscian.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    a_t.setEnabled(true);
                    b_t.setEnabled(true);
                    h_t.setEnabled(true);
                }
                else{
                    a_t.setEnabled(false);
                    b_t.setEnabled(false);
                    h_t.setEnabled(false);
                    a_t.setText(" ");
                    b_t.setText(" ");
                    h_t.setText(" ");
                    pole_t.setText(" ");
                    objetosc_t.setText(" ");
                }
            }
        });

        Walec.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {

                    r_t.setEnabled(true);
                    h_t.setEnabled(true);
                }
                else{
                    r_t.setEnabled(false);
                    h_t.setEnabled(false);
                    h_t.setText(" ");
                    r_t.setText(" ");
                    pole_t.setText(" ");
                    objetosc_t.setText(" ");
                }
            }
        });

        Kula.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    r_t.setEnabled(true);
                }
                else{
                    r_t.setEnabled(false);
                    r_t.setText(" ");
                    pole_t.setText(" ");
                    objetosc_t.setText(" ");
                }
            }
        });

        //Kalkulator
        Oblicz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Kwadrat.isSelected())
                {
                    a = Double.parseDouble(a_t.getText());
                    pole = a*a;
                    pole_t.setText(String.valueOf(pole));
                    obwod = 4*a;
                    obwod_t.setText(String.valueOf(obwod));
                }

                if(Prostokat.isSelected())
                {
                    a = Double.parseDouble(a_t.getText());
                    b = Double.parseDouble(b_t.getText());
                    pole = a*b;
                    pole_t.setText(String.valueOf(pole));
                    obwod = 2*a+2*b;
                    obwod_t.setText(String.valueOf(obwod));
                }

                if(Trojkat.isSelected())
                {
                    a = Double.parseDouble(a_t.getText());
                    b = Double.parseDouble(b_t.getText());
                    r = Double.parseDouble(r_t.getText());
                    h = Double.parseDouble(h_t.getText());
                    pole = (a*h/2);
                    pole_t.setText(String.valueOf(pole));
                    obwod = a+2*b;
                    obwod_t.setText(String.valueOf(obwod));
                }

                if(Trapez.isSelected())
                {
                    a = Double.parseDouble(a_t.getText());
                    b = Double.parseDouble(b_t.getText());
                    h = Double.parseDouble(h_t.getText());
                    c = Double.parseDouble(r_t.getText());
                    d = Double.parseDouble(d_t.getText());
                    pole = ((a+b)*h)/2;
                    pole_t.setText(String.valueOf(pole));
                    obwod = a+b+c+d; //dodać jeszcze coś o ramionach tego trapezu, bo lipa ;x
                    obwod_t.setText(String.valueOf(obwod));
                }

                if(Szescian.isSelected())
                {
                    a = Double.parseDouble(a_t.getText());
                    pole = 6*a*a;
                    pole_t.setText(String.valueOf(pole));
                    objetosc = a*a*a;
                    objetosc_t.setText(String.valueOf(objetosc));
                }

                if(Prostopadloscian.isSelected())
                {
                    a = Double.parseDouble(a_t.getText());
                    b = Double.parseDouble(b_t.getText());
                    h = Double.parseDouble(h_t.getText());
                    pole = 2*a*h+2*b*h+2*a*b;
                    pole_t.setText(String.valueOf(pole));
                    objetosc = a*b*h;
                    objetosc_t.setText(String.valueOf(objetosc));
                }

                if(Walec.isSelected())
                {
                    r = Double.parseDouble(r_t.getText());
                    h = Double.parseDouble(h_t.getText());
                    pole = 2*Math.PI*r*r+2*Math.PI*r*h;
                    pole_t.setText(String.valueOf(pole));
                    objetosc = Math.PI*r*r*h;
                    objetosc_t.setText(String.valueOf(objetosc));
                }

                if(Kula.isSelected())
                {
                    r = Double.parseDouble(r_t.getText());
                    pole = 4*Math.PI*r*r;
                    pole_t.setText(String.valueOf(pole));
                    objetosc = (4/3)*Math.PI*r*r*r;
                    objetosc_t.setText(String.valueOf(objetosc));
                }
            }
        });

        //Czyszczenie
        Wyczysc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a_t.setText(" ");
                b_t.setText(" ");
                h_t.setText(" ");
                r_t.setText(" ");
                d_t.setText(" ");
                pole_t.setText(" ");
                obwod_t.setText(" ");
                objetosc_t.setText(" ");
            }
        });
    }

    public static void main(String[] args){
        SwingApp aplikacja = new SwingApp();
        aplikacja.setVisible(true);
    }
}
