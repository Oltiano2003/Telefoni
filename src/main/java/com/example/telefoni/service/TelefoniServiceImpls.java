package com.example.telefoni.service;

import com.example.telefoni.dtos.TelefoniDto;
import com.example.telefoni.mappers.TelefoniMapper;
import com.example.telefoni.repository.TelefoniRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefoniServiceImpls implements TelefonService {

    private final TelefoniRepository repository;
    private final TelefoniMapper telefoniMapper;

    public TelefoniServiceImpls(TelefoniRepository repository, TelefoniMapper telefoniMapper) {
        this.repository = repository;
        this.telefoniMapper = telefoniMapper;
    }

    @Override
    public List<TelefoniDto> findAll() {
        return repository.findAll().stream().map(telefoniMapper::toDto).toList();
    }

    @Override
    public TelefoniDto findById(long id) {
        var entity = repository.findById(id);
        if (entity.isEmpty())
            throw new RuntimeException("Telefoni nuk eshte gjetur");
        var dto =telefoniMapper.toDto(entity.get());
        return dto;
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);

    }

    @Override
    public void create(TelefoniDto telefoniDto) {
        var entity = telefoniMapper.toEntity(telefoniDto);
        repository.save(entity);
    }

    @Override
    public void update(TelefoniDto newTelefon, long id) {
        var optinalEntity = repository.findById(id);
        if (optinalEntity.isEmpty())
            throw new RuntimeException("Order not found");

        var entity = optinalEntity.get();
        entity.setId(newTelefon.getId());
        entity.setModel(newTelefon.getModel());
        entity.setColor(newTelefon.getColor());
        entity.setPrice(newTelefon.getPrice());
        entity.setMemorySize(newTelefon.getMemorySize());
        entity.setDisplaySize(newTelefon.getDisplaySize());
        repository.save(entity);
    }
}
