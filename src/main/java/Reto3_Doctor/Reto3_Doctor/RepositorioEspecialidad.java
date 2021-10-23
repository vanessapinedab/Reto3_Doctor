/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_Doctor.Reto3_Doctor;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public class RepositorioEspecialidad {
    
    @Autowired
    private InterfaceEspecialidad crud;  
    
    public List<ModeloEspecialidad> getAll(){
        return (List<ModeloEspecialidad>) crud.findAll();
    } 
    public Optional<ModeloEspecialidad> getSpecialty(int id){
        return crud.findById(id);
    } 
    public ModeloEspecialidad save(ModeloEspecialidad specialty){
        return crud.save(specialty);
    }
    
}
