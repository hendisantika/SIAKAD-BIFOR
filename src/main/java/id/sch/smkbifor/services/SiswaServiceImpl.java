/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.Siswa;
import id.sch.smkbifor.entities.Siswa;
import id.sch.smkbifor.repositories.SiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dekikurnia
 */
@Service("siswaService")
public class SiswaServiceImpl implements SiswaService{

    private SiswaRepository siswaRepository;
    
    @Autowired
    public void setSiswaRepository(SiswaRepository siswaRepository) {
        this.siswaRepository = siswaRepository;
    }

    @Override
    public Iterable<Siswa> listAllSiswa() {
        return siswaRepository.findAll();
    }

    @Override
    public Siswa getSiswaById(Integer id) {
        return siswaRepository.findOne(id);
    }

    @Override
    public Siswa saveSiswa(Siswa siswa) {
        return siswaRepository.save(siswa);
    }
    
    @Override
    public Siswa updateSiswa(Siswa siswa) {
        return siswaRepository.save(siswa);
    }

    @Override
    public void deleteSiswa(Integer id) {
        siswaRepository.delete(id);
    }
    
    @Override
    public Siswa findByNisn(String nisn) {
        return siswaRepository.findByNisn(nisn);
    }
}
