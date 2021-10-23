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
public class ServiciosReservaciones {
    
    @Autowired
    private RepositorioReservaciones metodosCrud;

    public List<ModeloReservaciones> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<ModeloReservaciones> getReservation(int reservationId) {
        return metodosCrud.getReservation(reservationId);
    }

    public ModeloReservaciones save(ModeloReservaciones reservation){
        if(reservation.getIdReservation()==null){
            return metodosCrud.save(reservation);
        }else{
            Optional<ModeloReservaciones> e= metodosCrud.getReservation(reservation.getIdReservation());
            if(e.isEmpty()){
                return metodosCrud.save(reservation);
            }else{
                return reservation;
            }
        }
    }
    
}
