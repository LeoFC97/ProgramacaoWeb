package com.example.animais.model;

import java.util.Date;
import java.util.Objects;

public class Doacao {
    public Date dataInicio, dataFim;
    public int id;
    public Doacao(){}
    public Doacao(int Id){
        setId(id);
    }

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

    public boolean setId(int id) {
        try {
            this.id = id;
            return true;
        } catch (Exception e) {
            return false;
        }
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
