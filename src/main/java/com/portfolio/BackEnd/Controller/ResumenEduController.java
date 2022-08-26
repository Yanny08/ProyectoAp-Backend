package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.Entity.ResumenEdu;
import com.portfolio.BackEnd.Interface.IResumenEduService;
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
@RequestMapping  ("/resumenEdu")
@CrossOrigin(origins = "*")
public class ResumenEduController {
    
    @Autowired IResumenEduService iresumenEduService;

    @GetMapping("/traer")
    public List<ResumenEdu> getResumenEdu() {
        return iresumenEduService.getResumenEdu();
    }
    
    @PostMapping("/crear")
    public void createResumenEdu(@RequestBody ResumenEdu resumenEdu) {
        iresumenEduService.saveResumenEdu(resumenEdu);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deleteResumenEdu(@PathVariable Long id){
        iresumenEduService.deleteResumenEdu(id);
    }
   
    @PutMapping("/editar/{id}")
    public ResumenEdu editResumenEdu(@PathVariable Long id,
    @RequestBody ResumenEdu resumenEdu){resumenEdu.setId(id);
        iresumenEduService.saveResumenEdu(resumenEdu);
        return resumenEdu;
    }
    
}  
