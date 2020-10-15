package com.example.animais.model;

import java.util.Objects;

public class Cliente implements Pessoa {
    public String email,cpf;

    public Cliente(String email, String cpf){
        setCpf(cpf);
        setEmail(email);
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public boolean setEmail(String email) {
        try {
            this.email = email;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public boolean setCpf(String cpf) {
        try {
            this.cpf = cpf;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.cpf);
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
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
}
