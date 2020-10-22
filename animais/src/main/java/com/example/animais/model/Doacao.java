package com.example.animais.model;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Doacao {
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    public Calendar dataInicio;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    public Calendar dataFim;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @JsonManagedReference
    @ManyToOne
    private Cliente cliente;
    
    @JsonManagedReference
    @ManyToOne
    private Funcionario funcionario;

    public Doacao(){}


    public boolean devolverAnimal(int IDAnimal, String emailDono){
        //to be implemented
        return false;
    }
    public boolean iniciarAdocao(int IDAnimal, String emailDono){
        //to be implemented
        return false;
    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
       this.id = id;
    }
    @Override
    public int hashCode() {
        int hash = 11;
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
        final Doacao other = (Doacao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
