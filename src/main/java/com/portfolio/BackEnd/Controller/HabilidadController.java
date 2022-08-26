package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.Entity.Habilidad;
import com.portfolio.BackEnd.Interface.IHabilidadService;
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
@RequestMapping  ("/habilidades")
@CrossOrigin(origins = "*")
public class HabilidadController {

    @Autowired IHabilidadService ihabilidadService;

    @GetMapping("/traer")
    public List<Habilidad> getHabilidad() {
        return ihabilidadService.getHabilidad();
    }
    
    @PostMapping("/crear")
    public void createHabilidad(@RequestBody Habilidad habilidad) {
        ihabilidadService.saveHabilidad(habilidad);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deleteHabilidad(@PathVariable Long id){
        ihabilidadService.deleteHabilidad(id);
    }
    
    @PutMapping("/editar/{id}")
    public Habilidad editHabilidad(@PathVariable Long id,
    @RequestBody Habilidad habilidad){
        habilidad.setId(id);
        ihabilidadService.saveHabilidad(habilidad);
        return habilidad;
    }
    
}