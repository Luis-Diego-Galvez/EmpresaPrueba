/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.services;

import com.example.models.empresa;
import com.example.repositories.empresaRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LuisD
 */
@Service    
public class empresaService {
    @Autowired
    empresaRepository ERepos;
    
    public ArrayList<empresa> getAll() {
        return ((ArrayList<empresa>) ERepos.findAll());
    }
    
    public empresa saveEmpresa(empresa Empresa) {
        return ERepos.save(Empresa);
    }
    
    public Optional<empresa> getEmpresa(Long id) {
        return ERepos.findById(id);
    }
    
    public ArrayList<empresa> getEmpresa(int id) {
        return ERepos.findById(id);
    }
    
    public boolean deleteEmpresa(Long id) {
        try {
            ERepos.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
    
}
