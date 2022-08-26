package com.portfolio.BackEnd.Interface;

import com.portfolio.BackEnd.Entity.Contacto;
import java.util.List;

public interface IContactoService {
     public List<Contacto> getContacto();

    public void saveContacto(Contacto contacto);

    public void deleteContacto(Long id);

    public Contacto findContacto(Long id);
    
}
