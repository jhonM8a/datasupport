package com.technical.support.datasupport.controllers;

import com.technical.support.datasupport.entities.RegistroHora;
import com.technical.support.datasupport.repositories.RegistroHoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/registrohora")
@CrossOrigin(origins = "*")
public class RegistroHoraController {
    @Autowired
    private RegistroHoraRepository registroHora;

    @PostMapping("/crear")
    public void crearRegistroHora(@RequestBody RegistroHora registroHoraRequest){
        registroHora.save(registroHoraRequest);
    }

    @GetMapping("/all")
    public List<RegistroHora> getHoras(){
        return registroHora.findAll();
    }

    @GetMapping("/{id}")
    public RegistroHora getHora(@PathVariable Long id){
        Optional<RegistroHora> registroHoraOptional = registroHora.findById(id);
        return registroHoraOptional.isPresent() ? registroHoraOptional.get() : null;
    }

}
