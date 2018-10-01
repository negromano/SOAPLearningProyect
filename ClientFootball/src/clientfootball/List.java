package clientfootball;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

public class List extends JFrame {
    private JTable jTable1 = new JTable();
    private JButton jButton1 = new JButton();

    public List() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "List Footballer" );
        jTable1.setBounds(new Rectangle(10, 10, 370, 225));
        jButton1.setText("List");
        jButton1.setBounds(new Rectangle(155, 245, 75, 21));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jTable1, null);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
    }
}
