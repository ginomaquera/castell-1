/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.castell.controller.campain;

import com.tecsup.castell.dao.CampainDAO;
import com.tecsup.castell.model.Campain;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author SABADO-MANHANA
 */

@Service
@Transactional
public class CampainServiceImpl implements CampainService{
    
    @Autowired
    CampainDAO campainDAO;

    @Override
    public List<Campain> all() {
        return campainDAO.all();
    }

    @Override
    public Campain find(Long id) {
        return campainDAO.find(id);
    }

    @Override
    public void save(Campain campain) {
         if (campain.getId() == null) {
            campainDAO.save(campain);
        } else {
            campainDAO.update(campain);
        }
    }

    @Override
    public void delete(Long id) {
        Campain cat = this.find(id);
        campainDAO.delete(cat);
    }
    
}
