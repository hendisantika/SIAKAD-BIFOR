/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.Siswa;

/**
 *
 * @author dekikurnia
 */
public interface SiswaService {
    
    Iterable<Siswa> listAllSiswa();

    Siswa getSiswaById(Integer id);

    Siswa saveSiswa(Siswa siswa);

    void deleteSiswa(Integer id);
    
    public Siswa findByNisn (String nisn);
    
}
