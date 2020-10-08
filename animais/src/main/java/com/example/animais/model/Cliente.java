package com.example.animais.model;

public class Cliente implements Pessoa {
    private String cpf,email;

    public Cliente(String email, String cpf){
        this.setEmail(email);
        this.setCpf(cpf);
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public boolean setEmail(String email) {
        try {
            this.email= email;
            return true;
            
        } catch (Exception error) {
            System.out.println(error);
            return false;
        }
    }

    @Override
    public String getCpf() {
        return this.email;
    }

    @Override
    public boolean setCpf(String cpf) {
        try {
            this.cpf= cpf;
            return true;
            
        } catch (Exception error) {
            System.out.println(error);
            return false;
        }
    }
    
}
