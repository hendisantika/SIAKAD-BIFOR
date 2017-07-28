/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.Kelas;
import id.sch.smkbifor.repositories.KelasRepository;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author server02
 */
@Service("kelasService")
public class KelasServiceImpl implements KelasService {

    private KelasRepository kelasRepository;
    
    @Autowired
    public void setKelasRepository(KelasRepository kelasRepository) {
        this.kelasRepository = kelasRepository;
    }

    @Override
    public Collection<Kelas> listAllKelas() {
        return kelasRepository.findAll();
    }

    @Override
    public Kelas getKelasById(Integer id) {
        return kelasRepository.findOne(id);
    }

    @Override
    public Kelas saveKelas(Kelas kelas) {
        return kelasRepository.save(kelas);
    }

    @Override
    public Kelas updateKelas(Kelas kelas) {
        return kelasRepository.save(kelas);
    }
    
    @Override
    public void deleteKelas(Integer id) {
        kelasRepository.delete(id);
    }
     
    @Override
    public Kelas findByKodeKelas(String kodeKelas) {
        return kelasRepository.findByKodeKelas(kodeKelas);
    }
}
