package clientfootball;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

import org.tempuri.Footballer;
import org.tempuri.Services;
import org.tempuri.ServicesService;

public class MainFrame extends JFrame {
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem menuFileExit = new JMenuItem();
    private JMenu menuHelp = new JMenu();
    private JMenuItem menuHelpAbout = new JMenuItem();
    private Services service;
    private JMenu jMenu1 = new JMenu();
    private JMenuItem jMenuItem1 = new JMenuItem();
    private JMenuItem jMenuItem2 = new JMenuItem();
    private JMenuItem jMenuItem3 = new JMenuItem();
    private JMenuItem jMenuItem4 = new JMenuItem();
    private JMenuItem jMenuItem5 = new JMenuItem();

    public MainFrame(Services service) {
        try {
            jbInit();
            this.service = service;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setJMenuBar( menuBar );
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "Football!" );
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        menuFile.setText( "File" );
        menuFileExit.setText( "Exit" );
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        menuHelp.setText( "Help" );
        menuHelpAbout.setText( "About" );
        menuHelpAbout.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { helpAbout_ActionPerformed( ae ); } } );
        jMenu1.setText("Actions");
        jMenuItem1.setText("Create");
        jMenuItem1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    create(e);
                }
            });
        jMenuItem2.setText("Read");
        jMenuItem2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    read(e);
                }
            });
        jMenuItem3.setText("Update");
        jMenuItem3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    update(e);
                }
            });
        jMenuItem4.setText("Delete");
        jMenuItem4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    delete(e);
                }
            });
        jMenuItem5.setText("List");
        jMenuItem5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    list(e);
                }
            });
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        menuHelp.add( menuHelpAbout );
        menuBar.add( menuHelp );
        jMenu1.add(jMenuItem1);
        jMenu1.add(jMenuItem2);
        jMenu1.add(jMenuItem3);
        jMenu1.add(jMenuItem4);
        jMenu1.add(jMenuItem5);
        menuBar.add(jMenu1);
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    void helpAbout_ActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, new MainFrame_AboutBoxPanel1(), "About", JOptionPane.PLAIN_MESSAGE);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
    }

    private void create(ActionEvent e) {
        Create c = new Create();
        c.setVisible(true);
    }

    private void read(ActionEvent e) {
        Read r = new Read();
        r.setVisible(true);
    }

    private void update(ActionEvent e) {
        Update u = new Update();
        u.setVisible(true);
    }

    private void delete(ActionEvent e) {
        Delete d = new Delete();
        d.setVisible(true);
    }

    private void list(ActionEvent e) {
        List l = new List();
        l.setVisible(true);
    }
}
