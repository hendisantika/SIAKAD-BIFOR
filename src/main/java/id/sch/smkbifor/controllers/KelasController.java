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
    
    @RequestMapping(path="/admin/kelas/index", method=RequestMethod.GET)
    public String goKelas(Model model) {
        model.addAttribute("kelas", kelasService.listAllKelas());
        return "admin/kelas/index";
    }
    
    @RequestMapping("admin/kelas/new")
    public String newKelas(Model model) {
        model.addAttribute("kelas", new Kelas());
        return "admin/kelas/formkelas";
    }
    
    @RequestMapping(value="kelas", method=RequestMethod.POST)
    public String saveKelas(@Valid Kelas kelas, BindingResult bindingResult, Model model) {
        Kelas kelasExists = kelasService.findByKodeKelas(kelas.getKodeKelas());
        if (kelasExists != null) {
            bindingResult
                    .rejectValue("kodeKelas", "error.kelas",
                            "Sudah ada data dengan kode kelas tersebut");
        }
        if (bindingResult.hasErrors()) {
            return "admin/kelas/formkelas";
        } else {
        kelasService.saveKelas(kelas);
        return "redirect:/admin/kelas/index";
        } 
    }
    
    @RequestMapping(value="kelas", method = {RequestMethod.GET, RequestMethod.PUT})
    public String updateKelas(@Valid Kelas kelas, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "admin/kelas/updatekelas";
        } else {
        kelasService.saveKelas(kelas);
        return "redirect:/admin/kelas/index";
        } 
    }
    
    @RequestMapping("admin/kelas/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("kelas", kelasService.getKelasById(id));
        return "admin/kelas/updatekelas";
    }
    
    @RequestMapping("admin/kelas/delete/{id}")
    public String delete(@PathVariable Integer id) {
        kelasService.deleteKelas(id);
        return "redirect:/admin/kelas/index";
    }
    
}
