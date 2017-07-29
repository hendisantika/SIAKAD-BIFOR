/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author server02
 */
@Entity @Table(name="t_mapel")
public class Mapel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name="kode_mapel", unique=true, length=10)
    @NotEmpty(message = "Kode mapel tidak boleh kosong")
    private String kodeMapel;
    
    @Column(name="nama_mapel", length=50)
    @NotEmpty(message = "Nama mapel tidak boleh kosong")
    private String namaMapel;
    
    @Column(name="jumlah_jam", length=10)
    @NotEmpty(message = "Jumlah tidak boleh kosong")
    private String jumlahJam;
    
    @Column (name="keterangan")
    private String keterangan;
    
    @ManyToMany(mappedBy="mapel", cascade = CascadeType.ALL)
    private Set<Guru> guru;
   

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
     * @param guru the guru to set
     */
    public void setGuru(Set<Guru> guru) {
        this.guru = guru;
    }

    /**
     * @return the guru
     */
    public Set<Guru> getGuru() {
        return guru;
    }
        
}
