package com.example.CadastroProdutos.Models.Repositories;
import com.example.CadastroProdutos.Models.Entitys.ProdutosCadastro;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<ProdutosCadastro, Integer>{} 
