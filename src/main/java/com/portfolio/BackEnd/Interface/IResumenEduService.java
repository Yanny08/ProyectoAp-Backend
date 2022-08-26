package com.portfolio.BackEnd.Interface;

import com.portfolio.BackEnd.Entity.ResumenEdu;
import java.util.List;

public interface IResumenEduService {
   public List<ResumenEdu> getResumenEdu();

    public void saveResumenEdu(ResumenEdu resumenEdu);

    public void deleteResumenEdu(Long id);

    public ResumenEdu findResumenEdu(Long id); 
}
