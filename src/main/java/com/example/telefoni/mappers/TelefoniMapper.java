package com.example.telefoni.mappers;

import com.example.telefoni.dtos.TelefoniDto;
import com.example.telefoni.models.Telefoni;
import org.springframework.stereotype.Component;

@Component
public class TelefoniMapper {
    public Telefoni toEntity(TelefoniDto telefoniDto){
        Telefoni telefoni = new Telefoni();
        telefoni.setId(telefoniDto.getId());
        telefoni.setModel(telefoniDto.getModel());
        telefoni.setColor(telefoniDto.getColor());
        telefoni.setPrice(telefoniDto.getPrice());
        telefoni.setMemorySize(telefoniDto.getMemorySize());
        telefoni.setDisplaySize(telefoniDto.getDisplaySize());
        return telefoni;
    }

    public TelefoniDto toDto(Telefoni telefoni){
        TelefoniDto telefoniDto = new TelefoniDto();
        telefoniDto.setId(telefoni.getId());
        telefoniDto.setModel(telefoni.getModel());
        telefoniDto.setColor(telefoni.getColor());
        telefoniDto.setPrice(telefoni.getPrice());
        telefoniDto.setMemorySize(telefoni.getMemorySize());
        telefoniDto.setDisplaySize(telefoni.getDisplaySize());
        return telefoniDto;
    }


}
