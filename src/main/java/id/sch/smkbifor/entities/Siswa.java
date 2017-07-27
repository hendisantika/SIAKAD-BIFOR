/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author dekikurnia
 */
@Entity @Table(name="t_siswa")
public class Siswa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(unique=true, name="nisn", length=30)
    @NotEmpty(message = "NISN tidak boleh kosong")
    private String nisn;
    
    @Column(unique=true, name="nis", length=30)
    @NotEmpty(message = "NIS tidak boleh kosong")
    private String nis;
    
    @Column(name="nama_siswa", length=100)
    @NotEmpty(message = "Nama siswa tidak boleh kosong")
    private String namaSiswa;
    
    @Column(name="jenis_kelamin", length=20)
    private String jenisKelamin;
    
    @Column(name="tempat_lahir", length=30)
    @NotEmpty(message = "Tempat lahir tidak boleh kosong")
    private String tempatLahir;
    
    @Column(name="tanggal_lahir")
    @Temporal(javax.persistence.TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tanggalLahir;
    
    @ManyToOne
    @JoinColumn(name="kode_jurusan", nullable=false)
    private Jurusan jurusan;
    
    @ManyToOne
    @JoinColumn(name="kode_kelas", nullable=false)
    private Kelas kelas;
    
    @Column(name="agama", length=15)
    @NotEmpty(message = "Agama tidak boleh kosong")
    private String agama;
    
    @Column(name="anak_ke", length=50)
    @NotEmpty(message = "Anak ke- tidak boleh kosong")
    private String anakKe;
    
    @Column(name="nama_orangtua", length=100)
    @NotEmpty(message = "Nama orang tua tidak boleh kosong")
    private String namaOrangTua;
    
    @Column(name="tahun_diterima", length=4)
    @NotEmpty(message = "Tahun diterima tidak boleh kosong")
    private String tahunDiterima;
    
    @Column(name="tahun_lulus", length=4)
    private String tahunLulus;
    
    @Column(name="status")
    private String status;

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
     * @return the nisn
     */
    public String getNisn() {
        return nisn;
    }

    /**
     * @param nisn the nisn to set
     */
    public void setNisn(String nisn) {
        this.nisn = nisn;
    }

    /**
     * @return the nis
     */
    public String getNis() {
        return nis;
    }

    /**
     * @param nis the nis to set
     */
    public void setNis(String nis) {
        this.nis = nis;
    }

    /**
     * @return the namaSiswa
     */
    public String getNamaSiswa() {
        return namaSiswa;
    }

    /**
     * @param namaSiswa the namaSiswa to set
     */
    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
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
     * @return the jurusan
     */
    public Jurusan getJurusan() {
        return jurusan;
    }

    /**
     * @param jurusan the jurusan to set
     */
    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    /**
     * @return the kelas
     */
    public Kelas getKelas() {
        return kelas;
    }

    /**
     * @param kelas the kelas to set
     */
    public void setKelas(Kelas kelas) {
        this.kelas = kelas;
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
     * @return the anakKe
     */
    public String getAnakKe() {
        return anakKe;
    }

    /**
     * @param anakKe the anakKe to set
     */
    public void setAnakKe(String anakKe) {
        this.anakKe = anakKe;
    }

    /**
     * @return the namaOrangTua
     */
    public String getNamaOrangTua() {
        return namaOrangTua;
    }

    /**
     * @param namaOrangTua the namaOrangTua to set
     */
    public void setNamaOrangTua(String namaOrangTua) {
        this.namaOrangTua = namaOrangTua;
    }

    /**
     * @return the tahunDiterima
     */
    public String getTahunDiterima() {
        return tahunDiterima;
    }

    /**
     * @param tahunDiterima the tahunDiterima to set
     */
    public void setTahunDiterima(String tahunDiterima) {
        this.tahunDiterima = tahunDiterima;
    }

    /**
     * @return the tahunLulus
     */
    public String getTahunLulus() {
        return tahunLulus;
    }

    /**
     * @param tahunLulus the tahunLulus to set
     */
    public void setTahunLulus(String tahunLulus) {
        this.tahunLulus = tahunLulus;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
