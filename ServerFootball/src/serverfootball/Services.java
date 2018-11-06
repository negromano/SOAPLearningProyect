package serverfootball;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;


@WebService(targetNamespace = "http://tempuri.org/")
public class Services {
    
    ConexionBD conexion;
    
    /**
     * Lists all Footballers from the map
     * @return List containing Footballers
     */
    public List<Footballer> list(){
        ArrayList<Footballer> list = new ArrayList<>();
        String query = "SELECT * FROM FOOTBALLER WHERE ID";
        ResultSet rs = conexion.executeQueryStatement(query);
        try {
                while(rs.next()){
                    list.add( new Footballer(rs.getString("ID"),rs.getString("FORENAME"),rs.getString("SURNAME"),
                        rs.getString("POSITION"),rs.getString("CLUB"),rs.getInt("PLAYER_NUM"),
                                 rs.getDouble("HEIGHT")) );
               }
        } catch (SQLException ex) {
               System.out.println(ex.getMessage());
        }
        return list;
    }
    
    public Services(){
        conexion = new ConexionBD("SOA","SOA");
    }
    
    /**
     * Adds a Footballer to the map
     * @param f containing the Footballer
     * @return true if the Footballer was added
     *         false if another Footballer already existed with the same id
     */
    public boolean create(Footballer f){
        String query = "INSERT INTO FOOTBALLER VALUES ( '"+
            f.getId()+"', '"+f.getForename()+"', '"+f.getSurname()+"', '"+
            f.getClub()+"', '"+f.getPosition()+"', "+f.getNumber()+", "+f.getHeight()+")";
        conexion.executeUpdateStatement(query);
        return true;
    }
    
    /**
     * Reads a Footballer from the map
     * @param id of the Footballer to find
     * @return Footballer containing the object to find
     *         nulll if the key is not present
     */
    public Footballer read(String id){
        String query = "SELECT * FROM FOOTBALLER WHERE ID ='"+id+"'";
        ResultSet rs = conexion.executeQueryStatement(query);
        try {
                while(rs.next()){
                    return new Footballer(id,rs.getString("FORENAME"),rs.getString("SURNAME"),
                        rs.getString("POSITION"),rs.getString("CLUB"),rs.getInt("PLAYER_NUM"),
                                 rs.getDouble("HEIGHT"));
               }
        } catch (SQLException ex) {
               System.out.println(ex.getMessage());
        }
        return null;
    }
    
    /**
     * Updates a Footballer, first removes it an then creates the new updated one
     * @param f Footballer to add
     * @return true if succesfully updated
     *         false if the Footballer didn't exist
     */
    public boolean update(Footballer f){
        String query = "UPDATE FOOTBALLER SET FORENAME ='"+f.getForename()+"', SURNAME='"+f.getSurname()+
                       "',CLUB='"+f.getClub()+"', POSITION='"
                       +f.getPosition()+"', HEIGHT="+f.getHeight()+",PLAYER_NUM="+f.getNumber();
        return true;
    }
    
    /**
     * Deletes a Footballer identified with given id
     * @param id to be removed
     * @return true if succesfully deleted
     *         false if key was not found
     */
    public boolean delete(String id){
        String query = "DELETE FROM FOOTBALLER WHERE ID ='"+id+"'";
        conexion.executeUpdateStatement(query);
        return true;
    }
    
}
