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
public class RepositorioMensaje {
    
    @Autowired
    private InterfaceMensaje crud3;
    
    public List<ModeloMensaje> getAll(){
        return (List<ModeloMensaje>) crud3.findAll();
    }
    public Optional<ModeloMensaje> getMessage(int id){
        return crud3.findById(id);
    }
    public ModeloMensaje save(ModeloMensaje message){
        return crud3.save(message);
    }
    
}
