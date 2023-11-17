
package repository;

import entity.data_dokter;
import entity.rekap_harian;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import util.Conn;

public class rekap_harianRepository implements Repository<rekap_harian>{
    private static String tableName = rekap_harian.tableName;
    @Override
    public List<rekap_harian> get() {
        String sql = "select * from";
        List<rekap_harian> rekap_harian = new ArrayList<>();
            try {
                Connection koneksi =(Connection)Conn.configDB();
                Statement stm = koneksi.createStatement();
                ResultSet res = stm.executeQuery(sql);
                while (res.next()) {
                    rekap_harian.add(mapToEntity(res));
                }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
            return rekap_harian;
    }

    @Override
    public rekap_harian get(Integer id) {
    String sql = "Select * from "+tableName+ " where id = ?";
    rekap_harian rekap = new rekap_harian();
    try {
            Connection koneksi = Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(1, rekap.getId());
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    return rekap;
    }

    @Override
    public boolean add(rekap_harian rekap) {
        String sql = "insert into "+tableName+ " values (?,?,?,?,?)";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(1, rekap.getId());
            pst.setTime(2, new Time(rekap.getJam().getTime()));
            pst.setDate(3, new Date(rekap.getTanggal().getTime()));
            pst.setInt(4, rekap.getData_dokter().getId());
            pst.setInt(5, rekap.getData_master().getId());
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(rekap_harian rekap) {
    String sql = "update "+tableName+" set jam = ?, tanggal = ?, id_dokter = ? , id_master = ? where id = ?";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setTime(1, new Time(rekap.getJam().getTime()));
            pst.setDate(2, new Date(rekap.getTanggal().getTime()));
            pst.setInt(3, rekap.getData_dokter().getId());
            pst.setInt(4, rekap.getData_master().getId());
            pst.setInt(5, rekap.getId());
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
    String sql = " delete from "+tableName+ " where id = ?";
        try {
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private rekap_harian mapToEntity(ResultSet res) throws SQLException{
        rekap_harian hari = new rekap_harian(
        res.getTimestamp("jam"),
        res.getDate("tanggal"),
        new data_dokterRepository().get(res.getInt("id")),
        new data_masterRepository().get(res.getInt("id"))
        );
        hari.setId(res.getInt("id"));
        
        return hari;
    }
    
}
