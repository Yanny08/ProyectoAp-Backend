package com.portfolio.BackEnd.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ResumenTrab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 20, message = " no comple con la longitud")
    private String puesto;
    
    @NotNull
    @Size(min = 1, max = 20, message = " no comple con la longitud")
    private String organismo;
    
    @NotNull
    private String fechaIni;
    
    @NotNull
    private String fechaFin;
    
    @Size(min = 1, max = 100, message = " no comple con la longitud")
    private String descripcion;
    
}
