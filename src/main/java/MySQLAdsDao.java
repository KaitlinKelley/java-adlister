import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    public MySQLAdsDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error.", e);
        }
    }


    @Override
    public List<Ad> all(){
        List<Ad> adList = new ArrayList<>();
        String adsQuery = "SELECT * FROM ads";

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(adsQuery);

            while(rs.next()){
                adList.add(
                        new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                        )
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error.", e);
        }
        return adList;
    }


    @Override
    public Long insert(Ad ad){

        String insertQuery = String.format("INSERT INTO ads (user_id, title, description) VALUES ('%d','%s',%s)",
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription());
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            return rs.getLong("id");

        }catch (SQLException e) {
            throw new RuntimeException("Error.", e);
        }

    }







}
