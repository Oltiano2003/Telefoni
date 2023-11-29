package com.example.telefoni.controllers;

import com.example.telefoni.dtos.TelefoniDto;
import com.example.telefoni.models.Telefoni;
import com.example.telefoni.service.TelefonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/telefon")
@CrossOrigin(origins = "*")
public class TelefoniController {

    private final TelefonService telefonService;


    public TelefoniController(TelefonService telefonService) {
        this.telefonService = telefonService;
    }

    @GetMapping
    public List<TelefoniDto> findAll(){
        return telefonService.findAll();
    }

    @GetMapping("/{id}")
    public TelefoniDto findById(@PathVariable long id){
        return telefonService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id){
        telefonService.deleteById(id);
    }

    @PostMapping
    public void create(@RequestBody TelefoniDto telefon){
        telefonService.create(telefon);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody TelefoniDto newTelefon, @PathVariable long id){
        telefonService.update(newTelefon,id);
    }

}
