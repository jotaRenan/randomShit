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
    int estadiaCat, estadiaDog;

    public PetHouse() {
        //cat = new Gato();
        //dog = new Cachorro();
    }
    
    public PetHouse(Cachorro dog, int estadiaDog, Gato cat, int estadiaCat,
            String nome) {
        this.dog = dog;
        this.estadiaDog = estadiaDog;
        this.cat = cat;
        this.estadiaCat = estadiaCat;
        this.nome = nome;
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstadiaCat() {
        return estadiaCat;
    }

    public void setEstadiaCat(int estadiaCat) {
        this.estadiaCat = estadiaCat;
    }

    public int getEstadiaDog() {
        return estadiaDog;
    }

    public void setEstadiaDog(int estadiaDog) {
        this.estadiaDog = estadiaDog;
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
    
    public String dogToString() {
        return dog.toString();
    }
    
    public String catToString() {
        return cat.toString();
    }

    public double getAlCat() {
        return cat.getQtdAl();
    }
    
    public double getAlDog() {
        return dog.getQtdAl();
    }
    
}
