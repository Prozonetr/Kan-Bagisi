package DBInteraction;

import Util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Main;

/**
 *
 * @author Baran Bursalı
 */
public class SearchDBI {
    public ArrayList<Main> SearchMain(String key) {
        Connection conn = DBUtil.getConnection();
        ArrayList<Main> list = new ArrayList();
        String sql = "SELECT * FROM KAN.User where kan LIKE ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%"+key+"%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String name_surname = rs.getString("name_surname");
                String mail = rs.getString("mail");
                String tel = rs.getString("tel");
                String address = rs.getString("address");
                String kan = rs.getString("kan");
                Main b = new Main(username,password,name_surname,mail,tel,address,kan);
                list.add(b);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
