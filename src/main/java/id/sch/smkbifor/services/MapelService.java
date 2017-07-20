/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.Mapel;

/**
 *
 * @author server02
 */
public interface MapelService {
    Iterable<Mapel> listAllMapel();

    Mapel getMapelById(Integer id);

    Mapel saveMapel(Mapel siswa);

    void deleteMapel(Integer id);
}
