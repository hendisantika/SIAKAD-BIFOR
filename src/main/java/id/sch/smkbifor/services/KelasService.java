/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.Kelas;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author server02
 */
public interface KelasService {
    Collection<Kelas> listAllKelas();

    public Kelas getKelasById(Integer id);

    Kelas saveKelas(Kelas kelas);
    
    Kelas updateKelas(Kelas kelas);

    void deleteKelas(Integer id);
    
    public Kelas findByKodeKelas (String kodeKelas);
}
