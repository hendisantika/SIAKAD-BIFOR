/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.Mapel;
import java.util.Collection;

/**
 *
 * @author server02
 */
public interface MapelService {
    Collection<Mapel> listAllMapel();

    Mapel getMapelById(Integer id);

    Mapel saveMapel(Mapel mapel);
    
    Mapel updateMapel(Mapel mapel);

    void deleteMapel(Integer id);
    
    public Mapel findByKodeMapel (String kodeMapel);
}
