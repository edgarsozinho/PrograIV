package com.loja.Produtos.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Modelconfig {
    @Bean
    public ModelMapper mapper()  {
        return new ModelMapper();}
}
