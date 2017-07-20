/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author server02
 */
@Entity @Table(name="t_mapel")
public class Mapel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name="kode_mapel", length=10)
    private String kodeMapel;
    
    @Column(name="nama_mapel", length=50)
    private String namaMapel;
    
    @Column(name="jumlah_jam", length=10)
    private String jumlahJam;
    
    @Column (name="keterangan")
    private String keterangan;
    
    @OneToMany(mappedBy="mapel")
    private List<Guru> dataGuru = new ArrayList<>();

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the kodeMapel
     */
    public String getKodeMapel() {
        return kodeMapel;
    }

    /**
     * @param kodeMapel the kodeMapel to set
     */
    public void setKodeMapel(String kodeMapel) {
        this.kodeMapel = kodeMapel;
    }

    /**
     * @return the namaMapel
     */
    public String getNamaMapel() {
        return namaMapel;
    }

    /**
     * @param namaMapel the namaMapel to set
     */
    public void setNamaMapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }

    /**
     * @return the jumlahJam
     */
    public String getJumlahJam() {
        return jumlahJam;
    }

    /**
     * @param jumlahJam the jumlahJam to set
     */
    public void setJumlahJam(String jumlahJam) {
        this.jumlahJam = jumlahJam;
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
     * @param dataGuru the dataGuru to set
     */
    public void setDataGuru(List<Guru> dataGuru) {
        this.dataGuru = dataGuru;
    }
    
}
