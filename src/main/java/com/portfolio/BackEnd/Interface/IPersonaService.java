package com.portfolio.BackEnd.Interface;

import com.portfolio.BackEnd.Entity.Persona;
import java.util.List;

public interface IPersonaService {

     //Traer una lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}
