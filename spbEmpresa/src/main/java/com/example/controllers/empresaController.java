/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controllers;

/**
 *
 * @author LuisD
 */
import com.example.models.empresa;
import com.example.services.empresaService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/empresa")
public class empresaController {
    @Autowired
    empresaService EService;
    
    @GetMapping
    public ArrayList<empresa> getEmpresas() {
        return EService.getAll();
    }
    
    @PostMapping
    public empresa saveEmpresa(@RequestBody empresa Empresa) {
        return EService.saveEmpresa(Empresa);
    } 
    
    @GetMapping(path="/{id}")
    public Optional<empresa> getEmpresa(@PathVariable("id") Long id) {
        return EService.getEmpresa(id);
    }
    
    @GetMapping("/query")
    public ArrayList<empresa> getEmpresa(@RequestParam("emp") int id) {
        return EService.getEmpresa(id);
    }
    
    @DeleteMapping(path="/{id}")
    public String deleteEmpresa(@PathVariable("id") Long id) {
        boolean del = EService.deleteEmpresa(id);
        if (del) return "Registro eliminada con éxito";
        else return "No se pudo eliminar el registro";
    }
    
}
