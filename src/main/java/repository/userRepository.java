
package repository;

import entity.Entity;
import entity.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.Conn;

public class userRepository implements Repository<user>{
    private String tableName = user.tableName;
    
    @Override
    public List<user> get() {
        String sql = "Select * from "+ tableName;
        List<user> user = new ArrayList<>();
        try {
            Connection koneksi = (Connection)Conn.configDB();
            Statement stm = koneksi.createStatement();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                user.add(mapToEntity(res));
            }
        } catch (Exception e) {
        e.printStackTrace();
        }
        return user;
    }

    
    @Override
    public user get(Integer id) {
        String sql = "select * from "+tableName+" where id = ?";
        user us = new user();
        
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                return mapToEntity(res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return us;
    }

    @Override
    public boolean add(user us)  {
        String sql = "Insert into "+tableName+" values (?,?,?,?,?)";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(1, us.getId());
            pst.setString(2, us.getUsername());
            pst.setString(3, us.getPassword());
            pst.setString(4, us.getEmail());
            pst.setInt(5, us.getLevel());
            pst.execute();
            return  true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(user us) {
        String sql = "update "+tableName+" set username = ?, password = ?, email = ?, level = ? where id = ?";
        try {
            Connection koneksi =(Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setString(1, us.getUsername());
            pst.setString(2, us.getPassword());
            pst.setString(3, us.getEmail());
            pst.setInt(4, us.getLevel());
            pst.setInt(5, us.getId());
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(user us) {
        String sql = "delete from "+tableName+" where id = ?";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(1, us.getId());
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    

    private user mapToEntity(ResultSet res) throws SQLException{
        user us = new user(
        res.getString("username"),
        res.getString("password"),
        res.getString("email"),
        res.getInt("level")
        );
        us.setId(res.getInt("id"));
        
        return us;
    }
    
}
