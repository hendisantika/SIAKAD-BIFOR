/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author server02
 */
@Entity @Table(name="t_guru")
public class Guru implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name="kode_guru", length=3)
    private String kodeGuru;
    
    @Column(name="nuptk", length=20)
    private String nuptk;
    
    @Column(name="nama_guru", length=100)
    private String namaGuru;
    
    @Column(name="jenis_kelamin", length=20)
    private String jenisKelamin;
    
    @Column(name="tempat_lahir", length=30)
    private String tempatLahir;
    
    @Column(name="tanggal_lahir")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggalLahir;
    
    @Column(name="agama", length=15)
    private String agama;
    
    @Column(name="pendidikan", length=30)
    private String pendidikan;
    
    @Column(name="keterangan")
    private String keterangan;
    
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "t_guru_mapel", joinColumns = { @JoinColumn(name = "kode_guru") }, inverseJoinColumns = { @JoinColumn(name = "kode_mapel") })
    private Set<Mapel> mapel = new HashSet<Mapel>(0);

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
     * @return the kodeGuru
     */
    public String getKodeGuru() {
        return kodeGuru;
    }

    /**
     * @param kodeGuru the kodeGuru to set
     */
    public void setKodeGuru(String kodeGuru) {
        this.kodeGuru = kodeGuru;
    }

    /**
     * @return the nuptk
     */
    public String getNuptk() {
        return nuptk;
    }

    /**
     * @param nuptk the nuptk to set
     */
    public void setNuptk(String nuptk) {
        this.nuptk = nuptk;
    }

    /**
     * @return the namaGuru
     */
    public String getNamaGuru() {
        return namaGuru;
    }

    /**
     * @param namaGuru the namaGuru to set
     */
    public void setNamaGuru(String namaGuru) {
        this.namaGuru = namaGuru;
    }

    /**
     * @return the jenisKelamin
     */
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * @param jenisKelamin the jenisKelamin to set
     */
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    /**
     * @return the tempatLahir
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**
     * @param tempatLahir the tempatLahir to set
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    /**
     * @return the tanggalLahir
     */
    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    /**
     * @return the agama
     */
    public String getAgama() {
        return agama;
    }

    /**
     * @param agama the agama to set
     */
    public void setAgama(String agama) {
        this.agama = agama;
    }

    /**
     * @return the pendidikan
     */
    public String getPendidikan() {
        return pendidikan;
    }

    /**
     * @param pendidikan the pendidikan to set
     */
    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
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
     * @param mapel the mapel to set
     */
    public void setMapel(Set<Mapel> mapel) {
        this.mapel = mapel;
    }
    
}
