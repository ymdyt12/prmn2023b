package jp.ac.chitose.db_prac;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreExamDAO {

    private static final String URL = "jdbc:h2:~/h2db/db_prac;Mode=PostgreSQL;AUTO_SERVER=TRUE";
    private  static final String USER_NAME = "b2222480";
    private  static final String USER_PASS = "b2222480";

    public List<PreExam> selectPreExams(int lessThan) throws SQLException{
        List<PreExam> returning = new ArrayList<>();
        String SQL = "select * from 学生情報 where 得点 < ?";

        try(Connection conn = DriverManager.getConnection(URL,USER_NAME,USER_PASS);
            PreparedStatement stmt = conn.prepareStatement(SQL)){
            stmt.setInt(1,lessThan);
            ResultSet result = stmt.executeQuery();
            while(result.next()){
                String col1 = result.getString("学生コード");
                String col2 = "null";
                String col3 = "null";
                int cor4 = result.getInt("得点");
                PreExam preExam = new PreExam(col1,col2,col3,cor4);
                returning.add(preExam);
            }
        }
        return returning;
    }

    public int deletePreExam(String gakusekiCode) throws SQLException{
        String sql = "delete from 学生情報 where 学生コード = ?";
        int n = 0;
        try(Connection conn = DriverManager.getConnection(URL,USER_NAME,USER_PASS);
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1,gakusekiCode);
            n = stmt.executeUpdate();
        }
        return n;

    }
    public int insertPreExam(String gakusekiCode,String familyName,String firstName,int point) throws SQLException{
        String sql = "insert into 学生情報 values (?,?,?,?)";
        int n = 0;
        try(Connection conn = DriverManager.getConnection(URL,USER_NAME,USER_PASS);
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1,gakusekiCode);
            stmt.setString(2,familyName);
            stmt.setString(3,firstName);
            stmt.setInt(4,point);
            n = stmt.executeUpdate();
        }

        return n;
    }
}
