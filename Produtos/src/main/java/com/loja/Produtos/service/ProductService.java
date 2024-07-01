package com.loja.Produtos.service;

import com.loja.Produtos.ProductoRepo;
import com.loja.Produtos.models.Produtos;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface ProductService {
    Optional<Produtos> registrarProducto(Produtos request);
    Optional<Produtos> atualizarProduto(UUID id, Produtos request);
    List<Produtos> getall();
Optional<Produtos> getById (UUID id);





}
