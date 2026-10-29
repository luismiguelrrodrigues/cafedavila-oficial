package com.br.cafedavila.model;


import jakarta.persistence.*;
import org.hibernate.annotations.Audited;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Pedidos")
public class Pedidos {
    //Definições das colunas nas tabelas pedidos do MySQL
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer cpf;
    @Column(length = )
    private String tipo;
    private Integer local;
    private Integer codigo;
    private Integer qtde;
    @Column(length = )
    private String pagto;
    private BigDecimal total;
    private LocalDate data;
    @Column(length = )
    private String status;

    //constructor (construtores)


    public Pedidos() {
    }

    public long getId() {
        return id;
    }

    public Integer getCpf() {
        return cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getLocal() {
        return local;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getQtde() {
        return qtde;
    }

    public String getPagto() {
        return pagto;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public LocalDate getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setLocal(Integer local) {
        this.local = local;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public void setPagto(String pagto) {
        this.pagto = pagto;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
