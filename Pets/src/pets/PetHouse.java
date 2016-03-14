/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

/**
 *
 * @author usuario
 */
public class PetHouse {
    Gato cat;
    Cachorro dog;
    String nome;
    int estadia;

    public PetHouse() {
        cat = new Gato();
        dog = new Cachorro();
    }
    
    public PetHouse(Cachorro dog, String nome, int estadia) {
        this.dog = dog;
        this.nome = nome;
        this.estadia = estadia;
    }

    public PetHouse(Gato cat, String nome, int estadia) {
        this.cat = cat;
        this.nome = nome;
        this.estadia = estadia;
    }
    
    public void add(Gato cat, String nome, int estadia) {
        this.cat = cat;
        this.nome = nome;
        this.estadia = estadia;
    }
    
    public void add(Cachorro dog, String nome, int estadia) {
        this.dog = dog;
        this.nome = nome;
        this.estadia = estadia;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstadia() {
        return estadia;
    }

    public void setEstadia(int estadia) {
        this.estadia = estadia;
    }    

    public Gato getCat() {
        return cat;
    }

    public Cachorro getDog() {
        return dog;
    }

}
