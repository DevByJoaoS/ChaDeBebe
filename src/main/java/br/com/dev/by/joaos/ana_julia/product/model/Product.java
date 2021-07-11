package br.com.dev.by.joaos.ana_julia.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_product_pro", schema="public")
@SequenceGenerator(name = "sq_product", initialValue = 1, allocationSize = 1)
public class Product {

    @Id
    @GeneratedValue(generator = "sq_product", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_product")
    private Long id;

    @Column(name = "st_name")
    private String name;

    @Column(name = "nr_quantity")
    private Long quantity;

}
