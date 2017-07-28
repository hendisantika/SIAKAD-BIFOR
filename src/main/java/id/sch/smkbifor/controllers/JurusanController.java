/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.controllers;

import id.sch.smkbifor.entities.Jurusan;
import id.sch.smkbifor.services.JurusanService;
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
public class JurusanController {
    
    private JurusanService jurusanService;

    @Autowired
    public void setJurusanService(JurusanService jurusanService) {
        this.jurusanService = jurusanService;
    }
    
    @RequestMapping(path="/admin/jurusan/index", method=RequestMethod.GET)
    public String goJurusan(Model model) {
        model.addAttribute("jurusan", jurusanService.listAllJurusan());
        return "admin/jurusan/index";
    }
    
    @RequestMapping("admin/jurusan/new")
    public String newJurusan(Model model) {
        model.addAttribute("jurusan", new Jurusan());
        return "admin/jurusan/formjurusan";
    }
    
    @RequestMapping(value="jurusan", method=RequestMethod.POST)
    public String saveJurusan(@Valid Jurusan jurusan, BindingResult bindingResult) {
        jurusanService.saveJurusan(jurusan);
        return "redirect:/admin/jurusan/index"; 
    }
    
    @RequestMapping("admin/jurusan/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("jurusan", jurusanService.getJurusanById(id));
        return "admin/jurusan/formjurusan";
    }
    
    @RequestMapping("admin/jurusan/delete/{id}")
    public String delete(@PathVariable Integer id) {
        jurusanService.deleteJurusan(id);
        return "redirect:admin/admin/jurusan";
    }
    
}
