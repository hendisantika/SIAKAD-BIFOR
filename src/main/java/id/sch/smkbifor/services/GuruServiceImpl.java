/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.Guru;
import id.sch.smkbifor.entities.Guru;
import id.sch.smkbifor.repositories.GuruRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author server02
 */
@Service("guruService")
public class GuruServiceImpl implements GuruService {
    
    private GuruRepository guruRepository;
    
    @Autowired
    public void setGuruRepository(GuruRepository guruRepository) {
        this.guruRepository = guruRepository;
    }

    @Override
    public Collection<Guru> listAllGuru() {
        return guruRepository.findAll();
    }

    @Override
    public Guru getGuruById(Integer id) {
        return guruRepository.findOne(id);
    }

    @Override
    public Guru saveGuru(Guru guru) {
        return guruRepository.save(guru);
    }

    @Override
    public Guru updateGuru(Guru guru) {
        return guruRepository.save(guru);
    }
    
    @Override
    public void deleteGuru(Integer id) {
        guruRepository.delete(id);
    }
    
    @Override
    public Guru findByKodeGuru(String kodeGuru) {
        return guruRepository.findByKodeGuru(kodeGuru);
    }
    
}
