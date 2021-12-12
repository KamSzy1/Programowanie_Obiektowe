import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuLista extends JFrame implements ActionListener {

    private JPanel Main;
    private JMenuBar menuBar;
    private JMenu menuFile, menuEdit, subMenu;
    private JMenuItem mNewProject, mNewFile;
    private JCheckBoxMenuItem chJeden, chDwa;
    private JRadioButtonMenuItem radio1, radio2;

    public MenuLista() {
        super("Przykładowe menu");
        this.setContentPane(this.Main);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setSize(500, 300);
        setVisible(true);
        setLayout(null);

    //Utworzenie Menu
        menuBar = new JMenuBar();
        menuFile = new JMenu("File");
    //Menu File
        mNewFile = new JMenuItem("New File...");
        menuFile.add(mNewFile);

        mNewProject = new JMenuItem("New Project...");
        menuFile.add(mNewProject);
        menuFile.addSeparator();
    //Checkbox
        chJeden = new JCheckBoxMenuItem("A check box menu item");
        chJeden.addActionListener(this);
        menuFile.add(chJeden);
        chDwa = new JCheckBoxMenuItem("Another one...");
        chDwa.addActionListener(this);
        menuFile.add(chDwa);
        menuFile.addSeparator();
    //Radio Buttony
        radio1 = new JRadioButtonMenuItem("Radio button menu item");
        radio1.addActionListener(this);
        radio2 = new JRadioButtonMenuItem("Another radio button");
        radio2.addActionListener(this);
        ButtonGroup grupaRadio = new ButtonGroup();
        grupaRadio.add(radio1);
        grupaRadio.add(radio2);
        menuFile.add(radio1);
        menuFile.add(radio2);
        menuFile.addSeparator();
    //Submenu
        subMenu = new JMenu("A submenu");
        menuFile.add(subMenu);

    //Menu Edit
        menuEdit = new JMenu("Edit");

    //Dodanie do menu File i Edit
        menuBar.add(menuFile);
        menuBar.add(menuEdit);

    //Wyświetlenie menu
        setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args){
        MenuLista aplikacja = new MenuLista();
    }
}
