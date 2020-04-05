package businessLayer;
import databaseLayer.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;

public class CityTableGateway {
    public CityTableGateway()
    {

    }

    public ArrayList<City> findall()
    {
        ArrayList<City> citylist = new ArrayList<City>();
        Connection con = ConnectionFactory.getConnection();
        String stringSel = "SELECT * FROM city;";

        ResultSet rs = null;
        Statement findStatement = null;
        try {
            findStatement = con.createStatement();
            rs = findStatement.executeQuery(stringSel);

            if(rs.next()) {
                City e = createCity(rs);
                citylist.add(e);

            }
        }
        catch(Exception e){
            System.out.println("EROARE LA SELECTARE City");
            e.printStackTrace();
        }
        finally {
            ConnectionFactory.close(findStatement);
            ConnectionFactory.close(con);
            return citylist;
        }

    }

    public City findById(Integer id)
    {
        Connection con = ConnectionFactory.getConnection();
        String stringSel = "SELECT * FROM city WHERE cityId = ?";
        ResultSet rs = null;
        PreparedStatement findStatement = null;
        City d = null;
        try{
            findStatement = con.prepareStatement(stringSel);
            findStatement.setInt(1,id);
            rs= findStatement.executeQuery();

            if(rs.next()) {
               d = createCity(rs);
            }
        }
        catch (Exception e)
        {
            System.out.println("EROARE LA SELECTARE City dupa id");
            e.printStackTrace();
        }
        finally {
            ConnectionFactory.close(findStatement);
            ConnectionFactory.close(con);
            return d;
        }
    }

    public void insertCity(City e)
    {
        Connection con = ConnectionFactory.getConnection();
        String stringIns = "INSERT INTO city VALUES (?,?,?,?)";

        PreparedStatement insertStmt = null;
        try{
            insertStmt = con.prepareStatement(stringIns);
            insertStmt.setInt(1,e.getCityId());
            insertStmt.setInt(2,e.getScore());
            insertStmt.setInt(3,e.getPollution());
            insertStmt.setString(4,e.getName());
            insertStmt.execute();
        }
        catch(Exception exp){
            System.out.println("EROARE LA INSERARE City");
            exp.printStackTrace();
        }
        finally {
            ConnectionFactory.close(insertStmt);
            ConnectionFactory.close(con);
        }
    }

    public void updateScoreCity(City e)
    {
        Connection con = ConnectionFactory.getConnection();
        String stringUpd = "UPDATE city SET score = ? WHERE cityId = ?";

        PreparedStatement updateStmt = null;
        try{
            updateStmt = con.prepareStatement(stringUpd, Statement.RETURN_GENERATED_KEYS);
            updateStmt.setInt(1, e.getScore());
            updateStmt.setInt(2,e.getCityId());

            updateStmt.execute();
        }
        catch(Exception exc){
            System.out.println("EROARE LA UPDATE Score");
            exc.printStackTrace();
        }
        finally {
            ConnectionFactory.close(updateStmt);
            ConnectionFactory.close(con);
        }

    }

    public void updatePollutionCity(City e)
    {
        Connection con = ConnectionFactory.getConnection();
        String stringUpd = "UPDATE city SET pollution = ? WHERE cityId = ?";

        PreparedStatement updateStmt = null;
        try{
            updateStmt = con.prepareStatement(stringUpd, Statement.RETURN_GENERATED_KEYS);
            updateStmt.setInt(1, e.getPollution());
            updateStmt.setInt(2,e.getCityId());

            updateStmt.execute();
        }
        catch(Exception exc){
            System.out.println("EROARE LA UPDATE Pollution");
            exc.printStackTrace();
        }
        finally {
            ConnectionFactory.close(updateStmt);
            ConnectionFactory.close(con);
        }

    }
    public void deleteCity(Integer id)
    {
        Connection con = ConnectionFactory.getConnection();
        String stringDel = "DELETE FROM city WHERE cityId = ?";

        PreparedStatement deleteStmt = null;
        try{
            deleteStmt = con.prepareStatement(stringDel, Statement.RETURN_GENERATED_KEYS);
            deleteStmt.setInt(1,id);
            deleteStmt.execute();
            System.out.println("sters");
        }
        catch(Exception e){
            System.out.println("EROARE LA DELETE city");
            e.printStackTrace();
        }
        finally {
            ConnectionFactory.close(deleteStmt);
            ConnectionFactory.close(con);
        }
    }

    private City createCity(ResultSet rs)
    {
        City e = new City();
        try{
            e.setCityId(rs.getInt("cityId"));
            e.setScore(rs.getInt("score"));
            e.setPollution(rs.getInt("pollution"));
            e.setName(rs.getString("name"));
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
