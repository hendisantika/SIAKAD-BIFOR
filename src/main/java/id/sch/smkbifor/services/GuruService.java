/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.Guru;
import java.util.Collection;

/**
 *
 * @author server02
 */
public interface GuruService {
    Collection<Guru> listAllGuru();

    Guru getGuruById(Integer id);

    Guru saveGuru(Guru guru);
    
    Guru updateGuru(Guru guru);

    void deleteGuru(Integer id);
    
    public Guru findByKodeGuru (String kodeGuru);
}
