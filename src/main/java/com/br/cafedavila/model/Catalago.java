package com.br.cafedavila.model;


import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "Catalago")
public class Catalago {
    //Definições das colunas nas tabelas Catalago do MySQL
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer codigo;
    @Column(length = 30)
    private String produto;
    @Column(length = 80)
    private String descricao;
    private Integer valor;
    @DateTimeFormat(style = "yyyy-mm-dd")
    private LocalDate data;
    private boolean ativo;

    //constructor (construtores)


    public Catalago() {
    }

    public Catalago(long id, Integer codigo, String produto, String descricao, Integer valor, LocalDate data, boolean ativo) {
        this.id = id;
        this.codigo = codigo;
        this.produto = produto;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.ativo = ativo;
    }


    public long getId() {
        return id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getProduto() {
        return produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
