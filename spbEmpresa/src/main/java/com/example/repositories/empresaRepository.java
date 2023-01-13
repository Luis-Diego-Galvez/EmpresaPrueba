/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.repositories;

/**
 *
 * @author LuisD
 */
import com.example.models.empresa;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface empresaRepository extends CrudRepository<empresa,Long> {
    
    public abstract ArrayList<empresa> findById(int id);
    
    
}
