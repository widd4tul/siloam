
package entity;

import java.util.Date;

public class data_dokter implements Entity{
    public static String tableName = "data_dokter";
    private int id, no_hp, no_antrian;
    private String nama, jenis_poli, jadwal;
    private Date tanggal;
    
    public data_dokter(String nama, int no_hp, String jenis_poli, String jadwal, int no_antrian, Date tanggal){
        this.nama = nama;
        this.no_hp = no_hp;
        this.jenis_poli = jenis_poli;
        this.jadwal = jadwal;
        this.no_antrian = no_antrian;
        this.tanggal = tanggal;
    }
    
    public data_dokter(int id, String nama, int no_hp, String jenis_poli, String jadwal, int no_antrian, Date tanggal){
        this.id = id;
        this.nama = nama;
        this.no_hp = no_hp;
        this.jenis_poli = jenis_poli;
        this.jadwal = jadwal;
        this.no_antrian = no_antrian;
        this.tanggal = tanggal;
    }
    
    public data_dokter(){
        
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJenis_poli(String jenis_poli) {
        this.jenis_poli = jenis_poli;
    }

    public String getJenis_poli() {
        return jenis_poli;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNo_antrian(int no_antrian) {
        this.no_antrian = no_antrian;
    }

    public int getNo_antrian() {
        return no_antrian;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }

    public int getNo_hp() {
        return no_hp;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Date getTanggal() {
        return tanggal;
    }

    
    
}
