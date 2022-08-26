package com.portfolio.BackEnd.Interface;

import com.portfolio.BackEnd.Entity.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List<Proyecto> getProyecto();

    public void saveProyecto(Proyecto proyecto);

    public void deleteProyecto(Long id);

    public Proyecto findProyecto(Long id);
    
}
