/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.Jurusan;

/**
 *
 * @author dekikurnia
 */
public interface JurusanService {
    
    Iterable<Jurusan> listAllJurusan();

    Jurusan getJurusanById(Integer id);

    Jurusan saveJurusan(Jurusan jurusan);

    void deleteJurusan(Integer id);
    
}
