/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.sch.smkbifor.services;

import id.sch.smkbifor.entities.User;

/**
 *
 * @author dekikurnia
 */
public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
