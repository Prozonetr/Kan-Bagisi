package DBInteraction;

import Util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Main;

/**
 *
 * @author Baran Bursalı
 */

public class InsertDBI {
    public boolean insertMain(Main b) throws SQLException{
        Connection conn = DBUtil.getConnection();
        String sql ="INSERT INTO `KAN`.`User` (`username`,`password`,`name_surname`,`mail`,`tel`,`address`,`kan`) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, b.getusername());
        stmt.setString(2, b.getpassword());
        stmt.setString(3, b.getname_surname());
        stmt.setString(4, b.getmail());
        stmt.setString(5, b.gettel());
        stmt.setString(6, b.getaddress());
        stmt.setString(7, b.getkan());
        if (stmt == null) {
            throw new SQLException();
        } else {
            return stmt.executeUpdate() > 0;
        }
    }
}
