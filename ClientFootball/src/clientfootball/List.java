package clientfootball;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;

import javax.swing.table.DefaultTableModel;

import org.tempuri.Footballer;

public class List extends JFrame {
    private JButton jButton1 = new JButton();
    private MainFrame mf;
    private ScrollPane scrollPane1 = new ScrollPane();
    private JTable jTable1 = new JTable();

    public List(MainFrame mf) {
        try {
            jbInit();
            this.mf = mf;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void listData(java.util.List<Footballer> fList){
        DefaultTableModel model = new DefaultTableModel();
        String header[] = {"id","Forename","Surname","Position","Club","Number","Height"};
        String data[][] = new String[fList.size()+1][7];
        data[0][0] = "id";
        data[0][1] = "Forename";
        data[0][2] = "Surname";
        data[0][3] = "Position";
        data[0][4] = "Club";
        data[0][5] = "Number";
        data[0][6] = "Height";
        for(int i = 0;i<fList.size();i++){
            Footballer f = fList.get(i);
            data[i+1][0] = f.getId();
            data[i+1][1] = f.getForename();
            data[i+1][2] = f.getSurname();
            data[i+1][3] = f.getPosition();
            data[i+1][4] = f.getClub();
            data[i+1][5] = String.valueOf(f.getNumber());
            data[i+1][6] = String.valueOf(f.getHeight());
        }
        model.setDataVector(data, header);
        jTable1.setModel(model);
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "List Footballer" );
        jButton1.setText("List");
        jButton1.setBounds(new Rectangle(155, 245, 75, 21));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        scrollPane1.setBounds(new Rectangle(15, 15, 350, 170));
        jTable1.setAutoCreateRowSorter(true);
        scrollPane1.add(jTable1, null);
        this.getContentPane().add(scrollPane1, null);
        this.getContentPane().add(jButton1, null);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        listData(mf.listF());
    }
}
