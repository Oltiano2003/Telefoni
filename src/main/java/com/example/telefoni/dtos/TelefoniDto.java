package com.example.telefoni.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TelefoniDto {
    private long id;
    private String model;
    private String color;
    private double price;
    private int memorySize;
    private double displaySize;
}
