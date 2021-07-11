CREATE sequence sq_product;

create table tb_product_pro(
                             id_product bigint NOT NULL,
                             st_name varchar(240) NOT NULL,
                             nr_quantity bigint NOT NULL,
                             CONSTRAINT  tb_product_pkey PRIMARY KEY (id_product)
);

CREATE sequence sq_person;

create table tb_person_per(
                             id_person bigint NOT NULL,
                             st_name varchar(240) NOT NULL,
                             id_product bigint NOT NULL,
                             CONSTRAINT  tb_person_pkey PRIMARY KEY (id_person)
);