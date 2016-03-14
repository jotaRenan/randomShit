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
    
    public PetHouse(Cachorro dog, Gato cat, String nome, int estadia) {
        this.dog = dog;
        this.cat = cat;
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

    public void setCat(Gato cat) {
        this.cat = cat;
    }

    public void setDog(Cachorro dog) {
        this.dog = dog;
    }
    
    public Cachorro getDog() {
        return dog;
    }

}
