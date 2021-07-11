package br.com.dev.by.joaos.ana_julia.person.model;

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
@Table(name="tb_person_per", schema="public")
@SequenceGenerator(name = "sq_person", initialValue = 1, allocationSize = 1)
public class Person {

    @Id
    @GeneratedValue(generator = "sq_person", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_person")
    private Long id;

    @Column(name = "st_name")
    private String name;

    @Column(name = "id_product")
    private Long productId;

}
