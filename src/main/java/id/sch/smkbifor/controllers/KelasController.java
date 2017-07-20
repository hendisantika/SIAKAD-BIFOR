/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.controllers;

import id.sch.smkbifor.entities.Kelas;
import id.sch.smkbifor.services.KelasService;
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
public class KelasController {
    private KelasService kelasService;

    @Autowired
    public void setKelasService(KelasService kelasService) {
        this.kelasService = kelasService;
    }
    
    @RequestMapping(path="/admin/kelas", method=RequestMethod.GET)
    public String goKelas(Model model) {
        model.addAttribute("kelas", kelasService.listAllKelas());
        return "admin/kelas";
    }
    
    @RequestMapping("admin/kelas/new")
    public String newKelas(Model model) {
        model.addAttribute("kelas", new Kelas());
        return "admin/formkelas";
    }
    
    @RequestMapping(value="kelas", method=RequestMethod.POST)
    public String saveKelas(@Valid Kelas kelas, BindingResult bindingResult) {
        kelasService.saveKelas(kelas);
        return "redirect:/admin/kelas"; 
    }
    
    @RequestMapping("kelas/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("kelas", kelasService.getKelasById(id));
        return "admin/formkelas";
    }
    
    @RequestMapping("kelas/delete/{id}")
    public String delete(@PathVariable Integer id) {
        kelasService.deleteKelas(id);
        return "redirect:/admin/kelas";
    }
    
}
