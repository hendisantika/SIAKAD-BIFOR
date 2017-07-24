/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.controllers;

import id.sch.smkbifor.entities.Siswa;
import id.sch.smkbifor.services.SiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dekikurnia
 */
@RestController
public class SiswaRestController {
    @Autowired
    private SiswaService siswaService;
    
    @RequestMapping(path="/api/siswa", method=RequestMethod.GET)
    public Iterable <Siswa> listAllSiswa() {
        return siswaService.listAllSiswa();
    }
    
    @RequestMapping(value="/api/siswa/{id}", method=RequestMethod.GET)
    public Siswa getSiswaById(@PathVariable("id") Integer id) {
        return siswaService.getSiswaById(id);
    }
}
