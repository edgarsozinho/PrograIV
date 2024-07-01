package com.loja.Produtos.models;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.security.PrivateKey;
import java.util.UUID;



@Data
@Table
public class Produtos {
    @Id
    private UUID id;
    @Column(unique=true)
    private String name;
    private  double Preco;
    private  String  discricao;
    private  int  quantidade;
}
