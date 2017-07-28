/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.controllers;

import id.sch.smkbifor.entities.Guru;
import id.sch.smkbifor.services.GuruService;
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
public class GuruController {
    private GuruService guruService;
    private MapelService mapelService;

    @Autowired
    public void setGuruService(GuruService guruService) {
        this.guruService = guruService;
    }
    
    @Autowired
    public void setMapelService(MapelService mapelService) {
        this.mapelService = mapelService;
    }
    
    @RequestMapping(path="/admin/guru/index", method=RequestMethod.GET)
    public String goGuru(Model model) {
        model.addAttribute("guru", guruService.listAllGuru());
        return "admin/guru/index";
    }
    
    @RequestMapping("admin/guru/new")
    public String newGuru(Model model) {
        model.addAttribute("guru", new Guru());
        model.addAttribute("listMapel", mapelService.listAllMapel());
        return "admin/guru/formguru";
    }
    
    @RequestMapping(value="guru", method=RequestMethod.POST)
    public String saveGuru(@Valid Guru guru, BindingResult bindingResult, Model model) {
        Guru guruExists = guruService.findByKodeGuru(guru.getKodeGuru());
        if (guruExists != null) {
            model.addAttribute("listMapel", mapelService.listAllMapel());
            bindingResult
                    .rejectValue("kodeGuru", "error.guru",
                            "Sudah ada data dengan kode tersebut");
        }
        if (bindingResult.hasErrors()) {
            model.addAttribute("listMapel", mapelService.listAllMapel());
            return "admin/guru/formguru";
        } else {
            guruService.saveGuru(guru);
            return "redirect:/admin/guru/index";
        }
    }
    
    @RequestMapping(value="guru", method=RequestMethod.PUT)
    public String updateGuru(@Valid Guru guru, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("listMapel", mapelService.listAllMapel());
            return "admin/guru/updateguru";
        } else {
            guruService.saveGuru(guru);
            return "redirect:/admin/guru/index";
        }
    }
    @RequestMapping("admin/guru/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("guru", guruService.getGuruById(id));
        model.addAttribute("listMapel", mapelService.listAllMapel());
        return "admin/guru/updateguru";
    }
    
    @RequestMapping("admin/guru/delete/{id}")
    public String delete(@PathVariable Integer id) {
        guruService.deleteGuru(id);
        return "redirect:/admin/guru/index";
    }
    
}
