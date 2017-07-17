/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.repositories;

import id.sch.smkbifor.entities.Siswa;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dekikurnia
 */
public interface SiswaRepository extends CrudRepository<Siswa, Integer>{
    
}
