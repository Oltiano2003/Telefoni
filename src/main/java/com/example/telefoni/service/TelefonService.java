package com.example.telefoni.service;

import com.example.telefoni.dtos.TelefoniDto;

import java.util.List;

public interface TelefonService {
    List<TelefoniDto> findAll();
    TelefoniDto findById(long id);

    void deleteById(long id);

    void create(TelefoniDto telefoniDto);

    void update(TelefoniDto newTelefon, long id);


}
