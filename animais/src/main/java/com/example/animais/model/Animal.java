package com.example.animais.model;

public class Animal {
    public String nome, emailDono;
    public int id;
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
}
