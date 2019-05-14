package fr.formation.hol.spring.sec.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.hol.spring.sec.dtos.UserAccountCreateDto;
import fr.formation.hol.spring.sec.services.UserAccountService;

@RestController
@RequestMapping("/users")
public class UserController  {
    
    private final UserAccountService service;

    protected UserController(UserAccountService service) {
	this.service = service;
    }
    
    @PostMapping
    protected void create(@RequestBody UserAccountCreateDto dto) {
	service.create(dto);
    }
    
    @DeleteMapping("/{id}")
    @Secured("ROLE_ADMIN")
    protected void deleteById(@PathVariable("id") Long id) {
	service.deleteById(id);
    }
    
    
    
}
