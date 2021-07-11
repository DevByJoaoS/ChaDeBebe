package br.com.dev.by.joaos.ana_julia.product.model.service;

import br.com.dev.by.joaos.ana_julia.person.service.PersonService;
import br.com.dev.by.joaos.ana_julia.product.model.Product;
import br.com.dev.by.joaos.ana_julia.product.model.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;

    public List<Product> findAll(){
        List<Product> productList = this.productRepository.findAll();
        productList = productList.stream().filter(x -> x.getQuantity() > 0).collect(Collectors.toList());
        return productList;
    }

    public Product createProduct(Product product){
        return this.productRepository.save(product);
    }

    public void selectProduct(Long id){
        Product product = this.productRepository.findById(id).orElse(null);
        product.setQuantity(product.getQuantity() - 1);
        this.productRepository.save(product);
    }

    public Product findById(Long id){
        return this.productRepository.findById(id).orElse(null);
    }


}
