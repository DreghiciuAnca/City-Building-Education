package businessLayer;

import databaseLayer.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;

public class PlaceTableGateway {

    public PlaceTableGateway()
    {

    }
    public ArrayList<Place> findall()
    {
        ArrayList<Place> placetlist = new ArrayList<Place>();
        Connection con = ConnectionFactory.getConnection();
        String stringSel = "SELECT * FROM place;";

        ResultSet rs = null;
        Statement findStatement = null;
        try {
            findStatement = con.createStatement();
            rs = findStatement.executeQuery(stringSel);

            if(rs.next()) {
                Place e = createPlace(rs);
                placetlist.add(e);

            }
        }
        catch(Exception e){
            System.out.println("EROARE LA SELECTARE PLACE");
            e.printStackTrace();
        }
        finally {
            ConnectionFactory.close(findStatement);
            ConnectionFactory.close(con);
            return placetlist;
        }

    }

    public Place findById(Integer id)
    {
        Connection con = ConnectionFactory.getConnection();
        String stringSel = "SELECT * FROM place WHERE placeId = ?";
        ResultSet rs = null;
        PreparedStatement findStatement = null;
        Place d = null;
        try{
            findStatement = con.prepareStatement(stringSel);
            findStatement.setInt(1,id);
            rs= findStatement.executeQuery();

            if(rs.next()) {
                d = createPlace(rs);
            }
        }
        catch (Exception e)
        {
            System.out.println("EROARE LA SELECTARE Place dupa id");
            e.printStackTrace();
        }
        finally {
            ConnectionFactory.close(findStatement);
            ConnectionFactory.close(con);
            return d;
        }
    }

    public void insertPlace(Place e)
    {
        Connection con = ConnectionFactory.getConnection();
        String stringIns = "INSERT INTO place VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement insertStmt = null;
        try{
            insertStmt = con.prepareStatement(stringIns);
            insertStmt.setInt(1, e.getPlaceId());
            insertStmt.setString(2,e.getTip());
            insertStmt.setString(3,e.getGeometry());
            insertStmt.setString(4,e.getProximity());
            insertStmt.setString(5,e.getAddress());
            insertStmt.setString(6,e.getPicture());
            insertStmt.setInt(7,e.getCapacity());
            insertStmt.setInt(8,e.getDisponibility());
            insertStmt.setString(9,e.getIcon());
            insertStmt.setString(10,e.getContact());
            insertStmt.setInt(11,e.getDistrict_id());
            insertStmt.execute();
        }
        catch(Exception exp){
            System.out.println("EROARE LA INSERARE Place");
            exp.printStackTrace();
        }
        finally {
            ConnectionFactory.close(insertStmt);
            ConnectionFactory.close(con);
        }
    }


    public void deleteDistrict(Integer id)
    {
        Connection con = ConnectionFactory.getConnection();
        String stringDel = "DELETE FROM place WHERE placeId = ?";

        PreparedStatement deleteStmt = null;
        try{
            deleteStmt = con.prepareStatement(stringDel, Statement.RETURN_GENERATED_KEYS);
            deleteStmt.setInt(1,id);
            deleteStmt.execute();
            System.out.println("sters");
        }
        catch(Exception e){
            System.out.println("EROARE LA DELETE Place");
            e.printStackTrace();
        }
        finally {
            ConnectionFactory.close(deleteStmt);
            ConnectionFactory.close(con);
        }
    }
    private Place createPlace(ResultSet rs)
    {
        Place e = new Place();
        try{
            e.setPlaceId(rs.getInt("placeId"));
            e.setTip(rs.getString("type"));
            e.setGeometry(rs.getString("geometry"));
            e.setProximity(rs.getString("proximity"));
            e.setAddress(rs.getString("address"));
            e.setPicture(rs.getString("picture"));
            e.setCapacity(rs.getInt("capacity"));
            e.setIcon(rs.getString("icon"));
            e.setContact(rs.getString("contact"));
            e.setDistrict_id(rs.getInt("district_id"));
            e.setDisponibility(rs.getInt("disponibility"));
        }
        catch (SQLException exeption)
        {
            e =null;
        }
        finally {
            return e;
        }
    }
}
