/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.repositories;

import id.sch.smkbifor.entities.Mapel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author server02
 */
@Repository("mapelRepository")
public interface MapelRepository extends CrudRepository<Mapel, Integer>{
    Mapel findByKodeMapel (String kodeMapel);   
}
