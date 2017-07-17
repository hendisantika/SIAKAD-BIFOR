/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author dekikurnia
 */
@Entity @Table(name="t_jurusan")
public class Jurusan implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name="kode_jurusan", unique=true, length=10)
    private String kodeJurusan;

    @Column(name="nama_jurusan", length=50)
    private String namaJurusan;
    
    @Column(name="keterangan")
    private String keterangan;
    
    @OneToMany(mappedBy="jurusan")
    private List<Siswa> dataSiswa = new ArrayList<>();
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the kodeJurusan
     */
    public String getKodeJurusan() {
        return kodeJurusan;
    }

    /**
     * @param kodeJurusan the kodeJurusan to set
     */
    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }

    /**
     * @return the namaJurusan
     */
    public String getNamaJurusan() {
        return namaJurusan;
    }

    /**
     * @param namaJurusan the namaJurusan to set
     */
    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    /**
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    /**
     * @return the dataSiswa
     */
    public List<Siswa> getDataSiswa() {
        return dataSiswa;
    }

    /**
     * @param dataSiswa the dataSiswa to set
     */
    public void setDataSiswa(List<Siswa> dataSiswa) {
        this.dataSiswa = dataSiswa;
    }
    
  
}
