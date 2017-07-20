/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.Mapel;
import id.sch.smkbifor.entities.Mapel;
import id.sch.smkbifor.repositories.MapelRepository;
import id.sch.smkbifor.repositories.MapelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author server02
 */
@Service("mapelService")
public class MapelServiceImpl implements MapelService {

    private MapelRepository mapelRepository;
    
    @Autowired
    public void setMapelRepository(MapelRepository mapelRepository) {
        this.mapelRepository = mapelRepository;
    }

    @Override
    public Iterable<Mapel> listAllMapel() {
        return mapelRepository.findAll();
    }

    @Override
    public Mapel getMapelById(Integer id) {
        return mapelRepository.findOne(id);
    }

    @Override
    public Mapel saveMapel(Mapel mapel) {
        return mapelRepository.save(mapel);
    }

    @Override
    public void deleteMapel(Integer id) {
        mapelRepository.delete(id);
    }
    
    @Override
    public Mapel findByKodeMapel(String kodeMapel) {
        return mapelRepository.findByKodeMapel(kodeMapel);
    }
    
}
