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
@Entity @Table(name="t_kelas")
public class Kelas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name="kode_kelas", unique=true, length=10)
    private String kodeKelas;

    @Column(name="nama_kelas", length=50)
    private String namaKelas;
    
    @Column(name="keterangan")
    private String keterangan;
    
    @OneToMany(mappedBy="kelas")
    private List<Siswa> dataSiswa = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the kodeKelas
     */
    public String getKodeKelas() {
        return kodeKelas;
    }

    /**
     * @param kodeKelas the kodeKelas to set
     */
    public void setKodeKelas(String kodeKelas) {
        this.kodeKelas = kodeKelas;
    }

    /**
     * @return the namaKelas
     */
    public String getNamaKelas() {
        return namaKelas;
    }

    /**
     * @param namaKelas the namaKelas to set
     */
    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
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
    
    /*
    public List<Siswa> getDataSiswa() {
        return dataSiswa;
    }
    */

    /**
     * @param dataSiswa the dataSiswa to set
     */
    public void setDataSiswa(List<Siswa> dataSiswa) {
        this.dataSiswa = dataSiswa;
    }
    
}
