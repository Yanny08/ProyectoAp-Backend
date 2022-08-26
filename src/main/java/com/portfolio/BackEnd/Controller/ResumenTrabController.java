package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.Entity.ResumenTrab;
import com.portfolio.BackEnd.Interface.IResumenTrabService;
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
@RequestMapping  ("/resumenTrab")
@CrossOrigin(origins = "*")
public class ResumenTrabController {
    
  @Autowired IResumenTrabService iresumenTrabService;

    @GetMapping("/traer")
    public List<ResumenTrab> getResumenTrab() {
        return iresumenTrabService.getResumenTrab();
    }
    
    @PostMapping("/crear")
    public void createResumenTrab(@RequestBody ResumenTrab resumenTrab) {
        iresumenTrabService.saveResumenTrab(resumenTrab);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deleteResumenTrab(@PathVariable Long id){
        iresumenTrabService.deleteResumenTrab(id);
    
    }
    
    @PutMapping("/editar/{id}")
    public ResumenTrab editResumenTrab(@PathVariable Long id,
    @RequestBody ResumenTrab resumenTrab){resumenTrab.setId(id);
        iresumenTrabService.saveResumenTrab(resumenTrab);
        return resumenTrab;
    }
    
} 
