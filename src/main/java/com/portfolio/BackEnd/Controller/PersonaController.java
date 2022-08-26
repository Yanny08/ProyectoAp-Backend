package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.Entity.Persona;
import com.portfolio.BackEnd.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping  ("/personas")
@CrossOrigin(origins = "*")
public class PersonaController {

    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("/traer") //de base de datos al front
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }
    
    @PostMapping("/crear")// del front q guarde en el back
    public void createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
    
    }
    
    @PutMapping("/editar/{id}")
    public Persona editPersona(@PathVariable Long id,      
    @RequestBody Persona persona){
        persona.setId(id);
        ipersonaService.savePersona(persona);
        return persona;
    }
    
    @GetMapping("/trer/perfil")
    public Persona findPersona() {
        return ipersonaService.findPersona((long)1 );
    }
}