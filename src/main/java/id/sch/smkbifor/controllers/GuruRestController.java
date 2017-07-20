/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.controllers;

import id.sch.smkbifor.entities.Guru;
import id.sch.smkbifor.services.GuruService;
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
public class GuruRestController {
    @Autowired
    private GuruService guruService;
    
    @RequestMapping(path="/api/guru", method=RequestMethod.GET)
    public Iterable <Guru> listAllGuru() {
        return guruService.listAllGuru();
    }
    
    @RequestMapping(value="/api/guru/{id}", method=RequestMethod.GET)
    public Guru getGuruById(@PathVariable("id") Integer id) {
        return guruService.getGuruById(id);
    }
}
