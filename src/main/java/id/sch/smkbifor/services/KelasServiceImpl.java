/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.Kelas;
import id.sch.smkbifor.repositories.KelasRepository;
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
    public Iterable<Kelas> listAllKelas() {
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
    public void deleteKelas(Integer id) {
        kelasRepository.delete(id);
    }
     
    @Override
    public Kelas findByKodeKelas(String kodeKelas) {
        return kelasRepository.findByKodeKelas(kodeKelas);
    }
}
