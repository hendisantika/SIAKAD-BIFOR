/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.controllers;

import id.sch.smkbifor.entities.Guru;
import id.sch.smkbifor.services.GuruService;
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
public class GuruController {
    private GuruService guruService;

    @Autowired
    public void setGuruService(GuruService guruService) {
        this.guruService = guruService;
    }
    
    @RequestMapping(path="/admin/guru", method=RequestMethod.GET)
    public String goGuru(Model model) {
        model.addAttribute("guru", guruService.listAllGuru());
        return "admin/guru";
    }
    
    @RequestMapping("admin/guru/new")
    public String newGuru(Model model) {
        model.addAttribute("guru", new Guru());
        return "admin/formguru";
    }
    
    @RequestMapping(value="guru", method=RequestMethod.POST)
    public String saveGuru(@Valid Guru guru, BindingResult bindingResult) {
        guruService.saveGuru(guru);
        return "redirect:/admin/guru"; 
    }
    
    @RequestMapping("guru/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("guru", guruService.getGuruById(id));
        return "admin/formguru";
    }
    
    @RequestMapping("guru/delete/{id}")
    public String delete(@PathVariable Integer id) {
        guruService.deleteGuru(id);
        return "redirect:/admin/guru";
    }
    
}
