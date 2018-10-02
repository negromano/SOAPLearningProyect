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

public class Delete extends JFrame {
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel1 = new JLabel();
    private JTextField jTextField7 = new JTextField();
    private JTextField jTextField6 = new JTextField();
    private JTextField jTextField5 = new JTextField();
    private JTextField jTextField4 = new JTextField();
    private JTextField jTextField3 = new JTextField();
    private JTextField jTextField2 = new JTextField();
    private JTextField jTextField1 = new JTextField();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    MainFrame mf;

    public Delete(MainFrame mf) {
        try {
            jbInit();
            this.mf = mf;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "Delete Footballer" );
        jLabel7.setText("Height");
        jLabel7.setBounds(new Rectangle(70, 185, 35, 15));
        jLabel6.setText("Number");
        jLabel6.setBounds(new Rectangle(70, 160, 55, 15));
        jLabel5.setText("Club");
        jLabel5.setBounds(new Rectangle(70, 135, 35, 15));
        jLabel4.setText("Position");
        jLabel4.setBounds(new Rectangle(70, 110, 55, 15));
        jLabel3.setText("Last Name");
        jLabel3.setBounds(new Rectangle(70, 85, 75, 15));
        jLabel2.setText("First Name");
        jLabel2.setBounds(new Rectangle(70, 60, 70, 15));
        jLabel1.setText("ID");
        jLabel1.setBounds(new Rectangle(75, 35, 35, 15));
        jTextField7.setBounds(new Rectangle(210, 180, 150, 20));
        jTextField6.setBounds(new Rectangle(210, 155, 150, 20));
        jTextField5.setBounds(new Rectangle(210, 130, 150, 20));
        jTextField4.setBounds(new Rectangle(210, 105, 150, 20));
        jTextField3.setBounds(new Rectangle(210, 80, 150, 20));
        jTextField2.setBounds(new Rectangle(210, 55, 150, 20));
        jTextField1.setBounds(new Rectangle(210, 30, 150, 20));
        jButton1.setText("Destroy");
        jButton1.setBounds(new Rectangle(260, 225, 100, 20));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        jButton2.setText("Seek");
        jButton2.setBounds(new Rectangle(145, 225, 100, 20));
        jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton2_actionPerformed(e);
                }
            });
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jTextField2, null);
        this.getContentPane().add(jTextField3, null);
        this.getContentPane().add(jTextField4, null);
        this.getContentPane().add(jTextField5, null);
        this.getContentPane().add(jTextField6, null);
        this.getContentPane().add(jTextField7, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(jLabel5, null);
        this.getContentPane().add(jLabel6, null);
        this.getContentPane().add(jLabel7, null);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        String id =jTextField1.getText();
         mf.delete(id);
    }

    private void jButton2_actionPerformed(ActionEvent e) {
        try{
            String id = jTextField1.getText();
            Footballer f = mf.read(id);
            jTextField2.setText(f.getForename());
            jTextField3.setText(f.getSurname());
            jTextField4.setText(f.getPosition());
            jTextField5.setText(f.getClub());
            jTextField6.setText(String.valueOf(f.getNumber()));
            jTextField7.setText(String.valueOf(f.getHeight()));
        }catch(Exception exc){
            JOptionPane.showMessageDialog(this, "Eye with it handy");
        }
    }
}
