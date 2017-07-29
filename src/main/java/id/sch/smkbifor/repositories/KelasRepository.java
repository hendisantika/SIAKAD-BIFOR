/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.repositories;

import id.sch.smkbifor.entities.Kelas;
import java.util.Collection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author server02
 */
@Repository("kelasRepository")
public interface KelasRepository extends CrudRepository<Kelas, Integer> {
    Kelas findByKodeKelas (String kodeKelas);
    @Override
    Collection<Kelas> findAll();
}
