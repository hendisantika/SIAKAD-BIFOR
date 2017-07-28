/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.controllers;

import id.sch.smkbifor.entities.Siswa;
import id.sch.smkbifor.services.JurusanService;
import id.sch.smkbifor.services.SiswaService;
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
 * @author dekikurnia
 */
@Controller
public class SiswaController {
    
    private SiswaService siswaService;
    private JurusanService jurusanService;
    private KelasService kelasService;

    @Autowired
    public void setSiswaService(SiswaService siswaService) {
        this.siswaService = siswaService;
    }
    
    @Autowired
    public void setJurusanService(JurusanService jurusanService) {
        this.jurusanService = jurusanService;
    }
    
    @Autowired
    public void setKelasService(KelasService kelasService) {
        this.kelasService = kelasService;
    }
    
    @RequestMapping(path="/admin/siswa/index", method=RequestMethod.GET)
    public String goSiswa(Model model) {
        model.addAttribute("siswa", siswaService.listAllSiswa());   
        return "admin/siswa/index";
    }
    
    @RequestMapping("admin/siswa/new")
    public String newSiswa(Model model) {
        model.addAttribute("siswa", new Siswa());
        model.addAttribute("listJurusan", jurusanService.listAllJurusan());
        model.addAttribute("listKelas", kelasService.listAllKelas());
        return "admin/siswa/formsiswa";
    }
    
    @RequestMapping(value="siswa", method=RequestMethod.POST)
    public String saveSiswa(@Valid Siswa siswa, BindingResult bindingResult, Model model) {
        Siswa siswaExists = siswaService.findByNisn(siswa.getNisn());
        if (siswaExists != null) {
            model.addAttribute("listJurusan", jurusanService.listAllJurusan());
            model.addAttribute("listKelas", kelasService.listAllKelas());
            bindingResult
                    .rejectValue("nisn", "error.siswa",
                            "Sudah ada data dengan NISN tersebut");
        }
        if (bindingResult.hasErrors()) {
            model.addAttribute("listJurusan", jurusanService.listAllJurusan());
            model.addAttribute("listKelas", kelasService.listAllKelas());
            return "admin/siswa/formsiswa";
        } else {
        siswaService.saveSiswa(siswa);
        return "redirect:/admin/siswa/index";
        }  
    }
    
    @RequestMapping("admin/siswa/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("siswa", siswaService.getSiswaById(id));
        model.addAttribute("listJurusan", jurusanService.listAllJurusan());
        model.addAttribute("listKelas", kelasService.listAllKelas());
        return "admin/siswa/formsiswa";
    }
    
    @RequestMapping("admin/siswa/delete/{id}")
    public String delete(@PathVariable Integer id) {
        siswaService.deleteSiswa(id);
        return "redirect:/admin/siswa/index";
    }
}
