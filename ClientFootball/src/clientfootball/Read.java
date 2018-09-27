package clientfootball;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Read extends JFrame {
    public Read() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "Read Footballer" );
    }
}
