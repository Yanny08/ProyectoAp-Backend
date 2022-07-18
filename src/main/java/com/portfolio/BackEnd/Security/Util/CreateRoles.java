package com.portfolio.BackEnd.Security.Util;

import com.portfolio.BackEnd.Security.Entity.Rol;
import com.portfolio.BackEnd.Security.Enums.RolNombre;
import com.portfolio.BackEnd.Security.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;

    public void run(String... args) throws Exception {
        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
    }
}*/