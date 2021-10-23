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
public class ServiciosDoctor {
    
    @Autowired
    private RepositorioDoctor metodosCrud;

    public List<ModeloDoctor> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<ModeloDoctor> getDoctor(int idDoctor) {
        return metodosCrud.getDoctor(idDoctor);
    }

    public ModeloDoctor save(ModeloDoctor doctor){
        if(doctor.getId()==null){
            return metodosCrud.save(doctor);
        }else{
            Optional<ModeloDoctor> e=metodosCrud.getDoctor(doctor.getId());
            if(e.isEmpty()){
                return metodosCrud.save(doctor);
            }else{
                return doctor;
            }
        }
    }
    
}
