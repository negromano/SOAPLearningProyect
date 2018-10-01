package clientfootball;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.tempuri.Footballer;

public class Create extends JFrame {
    private JButton jButton1 = new JButton();
    private JTextField jTextField1 = new JTextField();
    private JTextField jTextField2 = new JTextField();
    private JTextField jTextField3 = new JTextField();
    private JTextField jTextField4 = new JTextField();
    private JTextField jTextField5 = new JTextField();
    private JTextField jTextField6 = new JTextField();
    private JTextField jTextField7 = new JTextField();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JLabel jLabel7 = new JLabel();
    private MainFrame mainFrame;

    public Create(MainFrame mainFrame) {
        try {
            jbInit();
            this.mainFrame = mainFrame;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "Create Futboller" );
        jButton1.setText("Create");
        jButton1.setBounds(new Rectangle(155, 225, 75, 21));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        jTextField1.setBounds(new Rectangle(210, 30, 150, 20));
        jTextField2.setBounds(new Rectangle(210, 55, 150, 20));
        jTextField3.setBounds(new Rectangle(210, 80, 150, 20));
        jTextField4.setBounds(new Rectangle(210, 105, 150, 20));
        jTextField5.setBounds(new Rectangle(210, 130, 150, 20));
        jTextField6.setBounds(new Rectangle(210, 155, 150, 20));
        jTextField7.setBounds(new Rectangle(210, 180, 150, 20));
        jLabel1.setText("ID");
        jLabel1.setBounds(new Rectangle(75, 35, 34, 14));
        jLabel2.setText("First Name");
        jLabel2.setBounds(new Rectangle(70, 60, 70, 15));
        jLabel3.setText("Last Name");
        jLabel3.setBounds(new Rectangle(70, 85, 75, 15));
        jLabel4.setText("Position");
        jLabel4.setBounds(new Rectangle(70, 110, 55, 15));
        jLabel5.setText("Club");
        jLabel5.setBounds(new Rectangle(70, 135, 35, 15));
        jLabel6.setText("Number");
        jLabel6.setBounds(new Rectangle(70, 160, 55, 15));
        jLabel7.setText("Height");
        jLabel7.setBounds(new Rectangle(70, 185, 35, 15));
        this.getContentPane().add(jLabel7, null);
        this.getContentPane().add(jLabel6, null);
        this.getContentPane().add(jLabel5, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jTextField7, null);
        this.getContentPane().add(jTextField6, null);
        this.getContentPane().add(jTextField5, null);
        this.getContentPane().add(jTextField4, null);
        this.getContentPane().add(jTextField3, null);
        this.getContentPane().add(jTextField2, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jButton1, null);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        try{
        String id = jTextField1.getText();
        String forename = jTextField2.getText();
        String surname = jTextField3.getText();
        String position = jTextField4.getText();
        String club = jTextField5.getText();
        int number = Integer.parseInt(jTextField6.getText());
        double height = Double.parseDouble(jTextField7.getText());
        Footballer f = new Footballer(id, forename, surname, position, club, number, height);
        mainFrame.create(f);
        }catch (Exception exc){
            JOptionPane.showMessageDialog(this, "Eye with it handy");
            exc.printStackTrace();
        }
    }
}
