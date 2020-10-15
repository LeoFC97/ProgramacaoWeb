package com.example.animais.model;

import java.util.Objects;

public class Animal {
    public String nome, emailDono;
    public int id;
    public Animal(){}
    public Animal(String nome, String emailDono){
        setEmailDono(emailDono);
        setNome(nome);
    }
    public String getEmailDono() {
        return emailDono;
    }
    public boolean setEmailDono(String emailDono){
        try {
            this.emailDono = emailDono;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public String getNome(){
        return this.nome;
    }
    public boolean setNome(String nome){
        try {
            this.nome=nome;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    @Override
    public int hashCode() {
        int hash = 5;
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
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
