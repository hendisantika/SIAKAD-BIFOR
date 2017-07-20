/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.controllers;

import id.sch.smkbifor.entities.Mapel;
import id.sch.smkbifor.services.MapelService;
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
public class MapelRestController {
    @Autowired
    private MapelService mapelService;
    
    @RequestMapping(path="/api/mapel", method=RequestMethod.GET)
    public Iterable <Mapel> listAllMapel() {
        return mapelService.listAllMapel();
    }
    
    @RequestMapping(value="/api/mapel/{id}", method=RequestMethod.GET)
    public Mapel getMapelById(@PathVariable("id") Integer id) {
        return mapelService.getMapelById(id);
    }
}
