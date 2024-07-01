package com.loja.Produtos;

import com.loja.Produtos.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface ProductoRepo extends JpaRepository<Produtos, UUID> {

}
