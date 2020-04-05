package businessLayer;

import databaseLayer.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;


public class DistrictTableGateway {
    public DistrictTableGateway()
    {

    }

    public ArrayList<District> findall()
    {
        ArrayList<District> districtlist = new ArrayList<District>();
        Connection con = ConnectionFactory.getConnection();
        String stringSel = "SELECT * FROM district;";

        ResultSet rs = null;
        Statement findStatement = null;
        try {
            findStatement = con.createStatement();
            rs = findStatement.executeQuery(stringSel);

            if(rs.next()) {
                District e = createDistrict(rs);
                districtlist.add(e);

            }
        }
        catch(Exception e){
            System.out.println("EROARE LA SELECTARE District");
            e.printStackTrace();
        }
        finally {
            ConnectionFactory.close(findStatement);
            ConnectionFactory.close(con);
            return districtlist;
        }

    }

    public District findById(Integer id)
    {
        Connection con = ConnectionFactory.getConnection();
        String stringSel = "SELECT * FROM district WHERE districtId = ?";
        ResultSet rs = null;
        PreparedStatement findStatement = null;
        District d = null;
        try{
            findStatement = con.prepareStatement(stringSel);
            findStatement.setInt(1,id);
            rs= findStatement.executeQuery();

            if(rs.next()) {
                d = createDistrict(rs);
            }
        }
        catch (Exception e)
        {
            System.out.println("EROARE LA SELECTARE Disttrict dupa id");
            e.printStackTrace();
        }
        finally {
            ConnectionFactory.close(findStatement);
            ConnectionFactory.close(con);
            return d;
        }
    }


    public void insertDistrict(District e)
    {
        Connection con = ConnectionFactory.getConnection();
        String stringIns = "INSERT INTO district VALUES (?,?,?)";

        PreparedStatement insertStmt = null;
        try{
            insertStmt = con.prepareStatement(stringIns);
            insertStmt.setInt(1, e.getDistrictId());
            insertStmt.setInt(2,e.getRating());
            insertStmt.setInt(3,e.getCity_id());
            insertStmt.execute();
        }
        catch(Exception exp){
            System.out.println("EROARE LA INSERARE District");
            exp.printStackTrace();
        }
        finally {
            ConnectionFactory.close(insertStmt);
            ConnectionFactory.close(con);
        }
    }

    public void updateRatingDistrict(District e)
    {
        Connection con = ConnectionFactory.getConnection();
        String stringUpd = "UPDATE district SET rating = ? WHERE districtId = ?";

        PreparedStatement updateStmt = null;
        try{
            updateStmt = con.prepareStatement(stringUpd, Statement.RETURN_GENERATED_KEYS);
            updateStmt.setInt(1, e.getRating());
            updateStmt.setInt(2,e.getDistrictId());

            updateStmt.execute();
        }
        catch(Exception exc){
            System.out.println("EROARE LA UPDATE Rating District");
            exc.printStackTrace();
        }
        finally {
            ConnectionFactory.close(updateStmt);
            ConnectionFactory.close(con);
        }

    }
    public void deleteDistrict(Integer id)
    {
        Connection con = ConnectionFactory.getConnection();
        String stringDel = "DELETE FROM district WHERE districtId = ?";

        PreparedStatement deleteStmt = null;
        try{
            deleteStmt = con.prepareStatement(stringDel, Statement.RETURN_GENERATED_KEYS);
            deleteStmt.setInt(1,id);
            deleteStmt.execute();
            System.out.println("sters");
        }
        catch(Exception e){
            System.out.println("EROARE LA DELETE District");
            e.printStackTrace();
        }
        finally {
            ConnectionFactory.close(deleteStmt);
            ConnectionFactory.close(con);
        }
    }
    private District createDistrict(ResultSet rs)
    {
        District e = new District();
        try{
            e.setDistrictId(rs.getInt("districtId"));
            e.setCity_id(rs.getInt("city_id"));
            e.setRating(rs.getInt("rating"));
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
