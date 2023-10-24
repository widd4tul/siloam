
package entity;

import java.sql.Timestamp;
import java.util.Date;

public class rekap_harian implements Entity{
    public static String tableName = "rekap_harian";
    private int id;
    private Timestamp jam;
    private Date tanggal;
    private data_dokter id_dokter;
    private data_master id_master;
    
    public rekap_harian(){
        
    }
    
    public rekap_harian(int id, Timestamp jam, Date tanggal, data_dokter id_dokter,data_master data_master ){
        this.id = id;
        this.jam = jam;
        this.tanggal = tanggal;
        this.id_dokter = id_dokter;
        this.id_master = id_master;
    }
    
    public rekap_harian( Timestamp jam, Date tanggal, data_dokter data_dokter,data_master data_master ){
        this.id = id;
        this.jam = jam;
        this.tanggal = tanggal;
        this.id_dokter = data_dokter;
        this.id_master = data_master;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Date getTanggal() {
        return tanggal;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setData_dokter(data_dokter data_dokter) {
        this.id_dokter = data_dokter;
    }

    public data_dokter getData_dokter() {
        return id_dokter;
    }

    public void setData_master(data_master data_master) {
        this.id_master = data_master;
    }

    public data_master getData_master() {
        return id_master;
    }

    public void setJam(Timestamp jam) {
        this.jam = jam;
    }

    public Timestamp getJam() {
        return jam;
    }

    

    

    
    
    
}
