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
public class SobreMi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(min = 0, max = 100, message = " no comple con la longitud")
    private String linkGit;
    
    @Size(min = 0, max = 100, message = " no comple con la longitud")
    private String linkDisc;
    
    @Size(min = 0, max = 100, message = " no comple con la longitud")
    private String linkLinke;
    
    @Size(min = 0, max = 100, message = " no comple con la longitud")
    private String linkCv;
    
    @NotNull
    @Size(min = 1, max = 500, message = " no comple con la longitud")
    private String descripcion;
    
    private String img;
    
    
}
