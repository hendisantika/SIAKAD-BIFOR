/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.controllers;

import id.sch.smkbifor.entities.Siswa;
import id.sch.smkbifor.services.SiswaService;
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
 * @author dekikurnia
 */
@Controller
public class SiswaController {
    
    private SiswaService siswaService;

    @Autowired
    public void setSiswaService(SiswaService siswaService) {
        this.siswaService = siswaService;
    }
    
    @RequestMapping(path="admin/siswa", method=RequestMethod.GET)
    public String goSiswa(Model model) {
        model.addAttribute("siswa", siswaService.listAllSiswa());
        return "admin/siswa";
    }
    
    @RequestMapping("admin/siswa/new")
    public String newSiswa(Model model) {
        model.addAttribute("siswa", new Siswa());
        return "admin/formsiswa";
    }
    
    @RequestMapping(value="admin/siswa", method=RequestMethod.POST)
    public String saveSiswa(@Valid Siswa siswa, BindingResult bindingResult) {
        siswaService.saveSiswa(siswa);
        return "redirect:/admin/siswa"; 
    }
    
    @RequestMapping("admin/siswa/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("siswa", siswaService.getSiswaById(id));
        return "admin/formsiswa";
    }
    
    @RequestMapping("admin/siswa/delete/{id}")
    public String delete(@PathVariable Integer id) {
        siswaService.deleteSiswa(id);
        return "redirect:/admin/siswa";
    }
}
