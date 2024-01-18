package com.example.CadastroProdutos.Models.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "produtos_cadastrados")
public class ProdutosCadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeProduto;
    private Double precoProduto;
    private Double descontoProduto;

    // Construtores
    public ProdutosCadastro(){}
    public ProdutosCadastro(String nomeProduto, Double precoProduto, Double descontoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.descontoProduto = descontoProduto;
    }

    // Getters and Setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPrecoProduto() {
        return this.precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Double getDescontoProduto() {
        return this.descontoProduto;
    }

    public void setDescontoProduto(Double descontoProduto) {
        this.descontoProduto = descontoProduto;
    }




    
}
