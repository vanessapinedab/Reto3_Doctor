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
public class RepositorioDoctor {
    
    @Autowired
    private InterfaceDoctor crud;
  
    public List<ModeloDoctor> getAll(){
        return (List<ModeloDoctor>) crud.findAll();
    } 
    public Optional<ModeloDoctor> getDoctor(int id){
        return crud.findById(id);
    } 
    public ModeloDoctor save(ModeloDoctor doctor){
        return crud.save(doctor);
    }
    
}
