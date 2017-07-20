/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.Guru;

/**
 *
 * @author server02
 */
public interface GuruService {
    Iterable<Guru> listAllGuru();

    Guru getGuruById(Integer id);

    Guru saveGuru(Guru siswa);

    void deleteGuru(Integer id);
}
