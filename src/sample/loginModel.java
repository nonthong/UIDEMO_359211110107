package sample;

import java.sql.Connection;
import java.sql.SQLException;

public class loginModel {
    Connection Connection;

    public loginModel () {
        try {
            this.Connection = dbConnection.getConnection ();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (this.Connection ==null) {
            System.exit(1);
        }
    }//loginModel

    public boolean isDatabaseConnection() {
        return this.connection != null;
    }//isDatabaseConnection

    public boolean isLogin(String user, String pass) throws SQLException {
        PreparedStatement pr = null;
        ResultSet rs = null;

        String sql = "select * from user where username = ? and password = ?";
        try {
            pr = this.connection.prepareStatement(sql);
            pr.setString(1,user);
            pr.setString(2,pass);
            rs = pr.executeQuery();

            if (rs.next()) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally {
            pr.close();
            rs.close();
        }

    }//isLogin
}//class
