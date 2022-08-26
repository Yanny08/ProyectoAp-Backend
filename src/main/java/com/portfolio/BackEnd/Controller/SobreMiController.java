package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.Entity.SobreMi;
import com.portfolio.BackEnd.Interface.ISobreMiService;
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
@RequestMapping  ("/sobreMi")
@CrossOrigin(origins = "*")
public class SobreMiController {

    @Autowired ISobreMiService isobreMiService;

    @GetMapping("/traer")
    public List<SobreMi> getSobreMi() {
        return isobreMiService.getSobreMi();
    }
    
    @GetMapping(path = {"/traer/{id}"})
    public SobreMi listarId(@PathVariable("id") Long id){
        return isobreMiService.findSobreMi(id);
    }
    
    @PostMapping("/crear")
    public void createSobreMi(@RequestBody SobreMi sobreMi) {
        isobreMiService.saveSobreMi(sobreMi);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deleteSobreMi(@PathVariable Long id){
        isobreMiService.deleteSobreMi(id);
    }
    
    @PutMapping("/editar/{id}")
    public SobreMi editSobreMi(@PathVariable Long id,
    @RequestBody SobreMi sobreMi){sobreMi.setId(id);
        isobreMiService.saveSobreMi(sobreMi);
        return sobreMi;
    }
    
}