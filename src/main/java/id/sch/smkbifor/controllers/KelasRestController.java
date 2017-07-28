/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.controllers;

import id.sch.smkbifor.entities.Kelas;
import id.sch.smkbifor.services.KelasService;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author server02
 */
@RestController
public class KelasRestController {
    @Autowired
    private KelasService kelasService;
    
    @RequestMapping(path="/api/kelas", method=RequestMethod.GET)
    public Collection <Kelas> listAllKelas() {
        return kelasService.listAllKelas();
    }
    
    @RequestMapping(value="/api/kelas/{id}", method=RequestMethod.GET)
    public Kelas getKelasById(@PathVariable("id") Integer id) {
        return kelasService.getKelasById(id);
    }
}
