/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.controllers;

import id.sch.smkbifor.entities.Mapel;
import id.sch.smkbifor.services.MapelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author dekikurnia
 */
@Controller
public class MapelReportController {
    
    @Autowired
    private MapelService materiService;
    
    @RequestMapping("admin/mapel/report")
    public ModelAndView generateMapelReport(ModelAndView model) {
        Iterable<Mapel> data = materiService.listAllMapel();
        model.addObject("dataSource", data);
        model.addObject("format", "pdf");
        model.setViewName("laporan_kelas");
        return model;
    }
    
}
