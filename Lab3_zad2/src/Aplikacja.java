import com.sun.jdi.IntegerValue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplikacja extends JFrame implements ActionListener{
    private JButton obliczButton;
    private JButton wyjscieButton;
    private JPanel Main;
    private JTextField textLiczba1;
    private JTextField textWynik;
    private JTextField textLiczba2;
    private JTextField textOperator;

    public Aplikacja() {
        super("Przykładowe menu");
        this.setContentPane(this.Main);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setSize(400, 200);
        setVisible(true);
        setLayout(null);

        textWynik.setEnabled(false);

        obliczButton.addActionListener(this);
        wyjscieButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object wybor = e.getSource();
        if (wybor == obliczButton) {
            if (textOperator.getText().equals("*")) {
                textWynik.setText(String.valueOf(Double.parseDouble(textLiczba1.getText()) * Double.parseDouble(textLiczba2.getText())));
            }
            else if(textOperator.getText().equals(";")) {
                textWynik.setText(String.valueOf(Double.parseDouble(textLiczba1.getText()) / Double.parseDouble(textLiczba2.getText())));
            }
            else{
                JOptionPane.showMessageDialog(null, "Podaj znak ; lub *");
            }
        } else if (wybor == wyjscieButton){
            int odp = JOptionPane.showConfirmDialog(null, "Czy napewno chcesz wyjść?", "Wyjście", JOptionPane.YES_NO_OPTION);
            if (odp == JOptionPane.YES_OPTION) {
                dispose();
            } else if (odp == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Zostajesz z nami :)");
            }
        }
    }

    public static void main(String[] args){
        Aplikacja aplikacja = new Aplikacja();
    }
}
