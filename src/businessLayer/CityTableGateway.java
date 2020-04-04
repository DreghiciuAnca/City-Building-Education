package businessLayer;
import databaseLayer.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;

public class CityTableGateway {

    public ArrayList<City> findall()
    {
        ArrayList<City> citylist = new ArrayList<City>();
        Connection con = ConnectionFactory.getConnection();
        String stringSel = "SELECT * FROM City;";

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
            System.out.println("EROARE LA SELECTARE");
            e.printStackTrace();
        }
        finally {
            ConnectionFactory.close(findStatement);
            ConnectionFactory.close(con);
        }
        return null;
    }

    private City createCity(ResultSet rs)
    {
        City e = new City();
        try{
            e.setCityId(rs.getInt("cityId"));
            e.setScore(rs.getInt("score"));
            e.setPollution(rs.getInt("pollution"));
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
