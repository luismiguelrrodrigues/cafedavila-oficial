package com.br.cafedavila.model;


import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Usuarios")
public class Usuarios {

    //Definições das colunas nas tabelas usuarios do MySQL
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer registro;
    @Column(length = 80)
    private String nome;
    @Column(length = 35)
    private String email;
    @DateTimeFormat(style = "yyyy-mm-dd")
    private LocalDate cadastro;
    @Column(length = 10)
    private String senha;
    private Boolean ativo; //y=sim n=não

    //Constructor (construtores)


    public Usuarios() {
    }


    public Usuarios(long id, Integer registro, String nome, String email, LocalDate cadastro, String senha, Boolean ativo) {
        this.id = id;
        this.registro = registro;
        this.nome = nome;
        this.email = email;
        this.cadastro = cadastro;
        this.senha = senha;
        this.ativo = ativo;
    }

    //Getters e Setters = preparando campos com front-end/back-end


    public long getId() {
        return id;
    }

    public Integer getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getCadastro() {
        return cadastro;
    }

    public String getSenha() {
        return senha;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setId(long id) {
        this.id = id;
    }


    public void setRegistro(Integer registro) {
        this.registro = registro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCadastro(LocalDate cadastro) {
        this.cadastro = cadastro;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
