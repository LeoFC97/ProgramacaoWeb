package com.example.animais.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Pessoa {
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false, length = 150, unique = true)
    private String email;
    @Column(nullable = false, length = 14, unique = true, updatable = false )
    private String cpf;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;


    public String getNome(){
        return nome;
    }
    public Long getId(){
        return id;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEmail(){
        return email;
    }
}
