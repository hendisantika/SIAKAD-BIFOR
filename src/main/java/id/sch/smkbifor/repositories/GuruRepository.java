/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.repositories;

import id.sch.smkbifor.entities.Guru;
import id.sch.smkbifor.entities.Mapel;
import java.util.Collection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author server02
 */
@Repository("guruRepository")
public interface GuruRepository extends CrudRepository<Guru, Integer>{
    Guru findByKodeGuru (String kodeGuru); 
    @Override
    Collection<Guru> findAll();
}
