package com.example.animais.model;

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
    
}
