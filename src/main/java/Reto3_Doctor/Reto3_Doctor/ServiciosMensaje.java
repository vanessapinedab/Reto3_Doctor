/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_Doctor.Reto3_Doctor;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class ServiciosMensaje {
    
    @Autowired
    private RepositorioMensaje metodosCrud;

    public List<ModeloMensaje> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<ModeloMensaje> getMessage(int messageId) {
        return metodosCrud.getMessage(messageId);
    }

    public ModeloMensaje save(ModeloMensaje message){
        if(message.getIdMessage()==null){
            return metodosCrud.save(message);
        }else{
            Optional<ModeloMensaje> e= metodosCrud.getMessage(message.getIdMessage());
            if(e.isEmpty()){
                return metodosCrud.save(message);
            }else{
                return message;
            }
        }
    }
    
}
