package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.Entity.Proyecto;
import com.portfolio.BackEnd.Interface.IProyectoService;
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
@RequestMapping  ("/proyectos")
@CrossOrigin(origins = "*")
public class ProyectoController {

    @Autowired IProyectoService iproyectoService;

    @GetMapping("/traer")
    public List<Proyecto> getProyecto() {
        return iproyectoService.getProyecto();
    }
   
    @PostMapping("/crear")
    public void createProyecto(@RequestBody Proyecto proyecto) {
        iproyectoService.saveProyecto(proyecto);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deleteProyecto(@PathVariable Long id){
        iproyectoService.deleteProyecto(id);
    }
   
    @PutMapping("/editar/{id}")
    public Proyecto editProyecto(@PathVariable Long id,
    @RequestBody Proyecto proyecto){
        proyecto.setId(id);
        iproyectoService.saveProyecto(proyecto);
        return proyecto;
    }
    
}