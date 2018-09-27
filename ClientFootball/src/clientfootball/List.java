package clientfootball;

import java.awt.Dimension;

import javax.swing.JFrame;

public class List extends JFrame {
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
    }
}
