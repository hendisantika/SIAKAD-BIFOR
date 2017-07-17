/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.Kelas;

/**
 *
 * @author server02
 */
public interface KelasService {
    Iterable<Kelas> listAllKelas();

    public Kelas getKelasById(Integer id);

    Kelas saveKelas(Kelas jurusan);

    void deleteKelas(Integer id);
}
