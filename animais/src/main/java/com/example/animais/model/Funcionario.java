package com.example.animais.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Funcionario extends Pessoa {
    @Column(nullable = false, length = 100)
    private String setor;
    @Column(nullable = false)
    private String senha;

    @OneToMany(mappedBy = "funcionario")
    @JsonBackReference
    private List<Doacao> doacoes = new ArrayList<>();

    public String getSetor(){
        return setor;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }



    public Funcionario(){}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
