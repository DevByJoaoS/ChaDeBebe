package br.com.dev.by.joaos.ana_julia.person.service;

import br.com.dev.by.joaos.ana_julia.person.controller.GiftListDto;
import br.com.dev.by.joaos.ana_julia.person.model.Person;
import br.com.dev.by.joaos.ana_julia.person.repository.PersonRepository;
import br.com.dev.by.joaos.ana_julia.product.model.Product;
import br.com.dev.by.joaos.ana_julia.product.model.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    @Autowired
    private final PersonRepository personRepository;

    @Autowired
    private final ProductService productService;

    @Transactional
    public Person createPersonAndSelectProduct(Person person){
        Person newPerson = this.personRepository.save(person);
        this.productService.selectProduct(person.getProductId());
        return newPerson;
    }

    public List<GiftListDto> findGiftList(){
        List<Person> personList = this.personRepository.findAll();
        List<GiftListDto> giftList = new ArrayList<>();
        personList.forEach( x -> {
            Product product = this.productService.findById(x.getProductId());
            giftList.add(GiftListDto.builder()
                    .productName(product.getName())
                    .personName(x.getName())
                    .build());
        });
        return giftList;
    }
}
