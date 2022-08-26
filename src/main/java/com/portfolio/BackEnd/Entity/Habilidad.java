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
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull//No puede quedar nulo
    private int porcentaje;
    
    @NotNull
    @Size(min = 1, max = 15, message = " no comple con la longitud")
    private String titulo;
   
    //Al no colocar nada no limito el campo.
    private String icono;
    
    //Puedo dejarlo Nulo.
    private String color;
    
    
    
    
    
   
     

}
