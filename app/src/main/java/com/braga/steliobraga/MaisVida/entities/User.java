package com.braga.steliobraga.MaisVida.entities;

import java.util.List;

public class User {

    String name;
    String email;
    String birthday;
    List localizacao;
    String tipodesangue;
    String password;
    List unidades_proximas;
    String genero;
    String celular;

    public User(String name, String email, String birthday, List localizacao, String tipodesangue, String password, List unidades_proximas, String genero, String celular) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.localizacao = localizacao;
        this.tipodesangue = tipodesangue;
        this.password = password;
        this.unidades_proximas = unidades_proximas;
        this.genero = genero;
        this.celular = celular;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(List localizacao) {
        this.localizacao = localizacao;
    }

    public String getTipodesangue() {
        return tipodesangue;
    }

    public void setTipodesangue(String tipodesangue) {
        this.tipodesangue = tipodesangue;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List getUnidades_proximas() {
        return unidades_proximas;
    }

    public void setUnidades_proximas(List unidades_proximas) {
        this.unidades_proximas = unidades_proximas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
