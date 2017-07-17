/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.Jurusan;
import id.sch.smkbifor.repositories.JurusanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dekikurnia
 */
@Service("jurusanService")
public class JurusanServiceImpl implements JurusanService {
    
    private JurusanRepository jurusanRepository;
    
    @Autowired
    public void setJurusanRepository(JurusanRepository jurusanRepository) {
        this.jurusanRepository = jurusanRepository;
    }

    @Override
    public Iterable<Jurusan> listAllJurusan() {
        return jurusanRepository.findAll();
    }

    @Override
    public Jurusan getJurusanById(Integer id) {
        return jurusanRepository.findOne(id);
    }

    @Override
    public Jurusan saveJurusan(Jurusan jurusan) {
        return jurusanRepository.save(jurusan);
    }

    @Override
    public void deleteJurusan(Integer id) {
        jurusanRepository.delete(id);
    }
    
}
