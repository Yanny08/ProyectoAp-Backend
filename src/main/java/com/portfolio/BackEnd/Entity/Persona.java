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
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull //no puede quedar vacio
    @Size(min = 1, max = 15, message = " no comple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 15, message = " no comple con la longitud")
    private String apellido;
    
    private String imgPerfil;
    
    private String imgBanner;
    
    
}
