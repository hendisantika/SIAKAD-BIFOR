/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.controllers;

import id.sch.smkbifor.entities.Jurusan;
import id.sch.smkbifor.services.JurusanService;
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
public class JurusanRestController {
    @Autowired
    private JurusanService jurusanService;
    
    @RequestMapping(path="/api/jurusan", method=RequestMethod.GET)
    public Iterable <Jurusan> listAllJurusan() {
        return jurusanService.listAllJurusan();
    }
    
    @RequestMapping(value="/api/jurusan/{id}", method=RequestMethod.GET)
    public Jurusan getJurusanById(@PathVariable("id") Integer id) {
        return jurusanService.getJurusanById(id);
    }
}
