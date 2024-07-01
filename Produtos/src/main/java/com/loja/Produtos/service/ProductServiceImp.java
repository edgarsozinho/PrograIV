package com.loja.Produtos.service;

import com.loja.Produtos.ProductoRepo;
import com.loja.Produtos.models.Produtos;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service

public class ProductServiceImp implements ProductService{


    @Autowired
    private ModelMapper mapper;
    @Autowired
    private ProductoRepo repsittory;

    @Override
    public Optional<Produtos> registrarProducto(Produtos request) {
        Produtos produto = mapper.map(request, Produtos.class);
        repsittory.saveAllAndFlush (produto);
        return Optional.of(mapper.map( produto, produto.class);
    }

    @Override
    public Optional<Produtos> atualizarProduto(UUID id, Produtos request) {
        return Optional.empty();
    }

    @Override
    public List<Produtos> getall() {
        return null;
    }

    @Override
    public Optional<Produtos> getById(UUID id) {
        return Optional.empty();
    }
}
