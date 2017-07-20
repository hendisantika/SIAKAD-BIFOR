/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.controllers;

import id.sch.smkbifor.entities.Mapel;
import id.sch.smkbifor.services.MapelService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author server02
 */
@Controller
public class MapelController {
    private MapelService mapelService;

    @Autowired
    public void setMapelService(MapelService mapelService) {
        this.mapelService = mapelService;
    }
    
    @RequestMapping(path="/admin/mapel", method=RequestMethod.GET)
    public String goMapel(Model model) {
        model.addAttribute("mapel", mapelService.listAllMapel());
        return "admin/mapel";
    }
    
    @RequestMapping("admin/mapel/new")
    public String newMapel(Model model) {
        model.addAttribute("mapel", new Mapel());
        return "admin/formmapel";
    }
    
    @RequestMapping(value="mapel", method=RequestMethod.POST)
    public String saveMapel(@Valid Mapel mapel, BindingResult bindingResult) {
        mapelService.saveMapel(mapel);
        return "redirect:/admin/mapel"; 
    }
    
    @RequestMapping("mapel/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("mapel", mapelService.getMapelById(id));
        return "admin/formmapel";
    }
    
    @RequestMapping("mapel/delete/{id}")
    public String delete(@PathVariable Integer id) {
        mapelService.deleteMapel(id);
        return "redirect:/admin/mapel";
    }
    
}
