package br.com.dev.by.joaos.ana_julia.person.controller;

import br.com.dev.by.joaos.ana_julia.person.model.Person;
import br.com.dev.by.joaos.ana_julia.person.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/pessoa/v1")
@RequiredArgsConstructor
public class PersonController {

    @Autowired
    private final PersonService personService;

    @PostMapping
    private Person createPerson(@RequestBody Person person){
        return this.personService.createPersonAndSelectProduct(person);
    }

    @GetMapping
    private List<GiftListDto> findGiftList(){
        return this.personService.findGiftList();
    }
}
