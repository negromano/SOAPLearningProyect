package serverfootball;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;


@WebService(targetNamespace = "http://tempuri.org/")
public class Services {
    
    ConexionBD conexion;
    Map<String, Footballer> footballers;
    
    /**
     * Lists all Footballers from the map
     * @return List containing Footballers
     */
    public List<Footballer> list(){
        return new ArrayList<Footballer>(footballers.values());
    }
    
    public Services(){
        conexion = new ConexionBD("SOA","SOA");
        footballers = new HashMap<String, Footballer>();
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
        if(footballers.containsKey(f.getId())) return false;
        footballers.put(f.getId(), f);
        return true;
    }
    
    /**
     * Reads a Footballer from the map
     * @param id of the Footballer to find
     * @return Footballer containing the object to find
     *         nulll if the key is not present
     */
    public Footballer read(String id){
        return footballers.get(id);
    }
    
    /**
     * Updates a Footballer, first removes it an then creates the new updated one
     * @param f Footballer to add
     * @return true if succesfully updated
     *         false if the Footballer didn't exist
     */
    public boolean update(Footballer f){
        if(!footballers.containsKey(f.getId())) return false;
        footballers.remove(f.getId());
        footballers.put(f.getId(), f);
        return true;
    }
    
    /**
     * Deletes a Footballer identified with given id
     * @param id to be removed
     * @return true if succesfully deleted
     *         false if key was not found
     */
    public boolean delete(String id){
        if(!footballers.containsKey(id)) return false;
        footballers.remove(id);
        return true;
    }
    
}
