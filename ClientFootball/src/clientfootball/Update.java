package clientfootball;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Update extends JFrame {
    public Update() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "Update Footballer" );
    }
}
