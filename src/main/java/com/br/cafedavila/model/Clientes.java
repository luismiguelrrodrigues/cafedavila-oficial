package com.br.cafedavila.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Clientes")
public class Clientes {
    //Definições das colunas nas tabelas Clientes do MySQL
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer cpf;
    @Column(length = 80)
    private String nome;
    @Column(length = 100)
    private String endereco;
    @Column(length = 50)
    private String bairro;
    @Column(length = 50)
    private String cidade;
    @Column(length = 25)
    private String telefone;
    @Column(length = 50)
    private String email;
    private LocalDate datanascimento;
    private BigDecimal saldo;
    @Column(length = 10)
    private String senha;
    @Column
    private String historico;
    private LocalDate datacadastro;
    private boolean ativo;

    //constructor (construtores)


    public Clientes() {
    }

    public long getId() {
        return id;
    }

    public Integer getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public String getSenha() {
        return senha;
    }

    public String getHistorico() {
        return historico;
    }

    public LocalDate getDatacadastro() {
        return datacadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void setDatacadastro(LocalDate datacadastro) {
        this.datacadastro = datacadastro;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
