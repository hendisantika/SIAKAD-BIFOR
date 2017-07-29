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
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsMultiFormatView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsViewResolver;

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
    
    @RequestMapping(path="/admin/mapel/index", method=RequestMethod.GET)
    public String goMapel(Model model) {
        model.addAttribute("mapel", mapelService.listAllMapel());
        return "admin/mapel/index";
    }
    
    @RequestMapping("admin/mapel/new")
    public String newMapel(Model model) {
        model.addAttribute("mapel", new Mapel());
        return "admin/mapel/formmapel";
    }
    
    @RequestMapping(value="mapel", method=RequestMethod.POST)
    public String saveMapel(@Valid Mapel mapel, BindingResult bindingResult) {
        Mapel mapelExists = mapelService.findByKodeMapel(mapel.getKodeMapel());
        if (mapelExists != null) {
            bindingResult
                    .rejectValue("kodeMapel", "error.mapel",
                            "Sudah ada data dengan kode mapel tersebut");
        }
        if (bindingResult.hasErrors()) {
            return "admin/mapel/formmapel";
        } else {
        mapelService.saveMapel(mapel);
        return "redirect:/admin/mapel/index";
        }
    }
    
    @RequestMapping(value="mapel", method = {RequestMethod.GET, RequestMethod.PUT})
    public String updateMapel(@Valid Mapel mapel, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "admin/mapel/updatemapel";
        } else {
        mapelService.saveMapel(mapel);
        return "redirect:/admin/mapel/index";
        }
    }
    
    @RequestMapping("admin/mapel/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("mapel", mapelService.getMapelById(id));
        return "admin/mapel/updatemapel";
    }
    
    @RequestMapping("admin/mapel/delete/{id}")
    public String delete(@PathVariable Integer id) {
        mapelService.deleteMapel(id);
        return "redirect:/admin/mapel/index";
    }
    
    @Bean
    public JasperReportsViewResolver getJasperReportsViewResolver() {
        JasperReportsViewResolver resolver = new JasperReportsViewResolver();
        resolver.setPrefix("classpath:reports/");
        resolver.setSuffix(".jrxml");
        resolver.setViewNames("*laporan_*");
        resolver.setViewClass(JasperReportsMultiFormatView.class);
        resolver.setOrder(0);
        return resolver;
    }
}
