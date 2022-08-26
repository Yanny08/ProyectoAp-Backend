package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.Entity.Contacto;
import com.portfolio.BackEnd.Interface.IContactoService;
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
@RequestMapping  ("/contactos")
@CrossOrigin(origins = "*")
public class ContactoController {

    @Autowired IContactoService icontactoService;

    @GetMapping("/traer")
    public List<Contacto> getContacto() {
        return icontactoService.getContacto();
    }
    
    @GetMapping("/traer/{id}")
    public Contacto listarId(@PathVariable("id") Long id){
        return icontactoService.findContacto(id);
    }
    
    @PostMapping("/crear")
    public void createContacto(@RequestBody Contacto contacto) {
        icontactoService.saveContacto(contacto);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deleteContacto(@PathVariable Long id){
        icontactoService.deleteContacto(id);
    }
    
    @PutMapping("/editar/{id}")
    public Contacto editContacto(@PathVariable Long id,
    @RequestBody Contacto contacto){
        contacto.setId(id);
        icontactoService.saveContacto(contacto);
        return contacto;
    }
    
    
}