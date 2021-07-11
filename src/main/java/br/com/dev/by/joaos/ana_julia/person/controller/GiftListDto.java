package br.com.dev.by.joaos.ana_julia.person.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GiftListDto {

    private String personName;

    private String productName;
}
