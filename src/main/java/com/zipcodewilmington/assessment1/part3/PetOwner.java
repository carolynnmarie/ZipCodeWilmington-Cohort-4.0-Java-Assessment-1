package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public String owner;
    public Pet [] pets;


    public PetOwner(String name, Pet... pets2) {
        this.owner = name;
        this.pets = pets2;
        if(this.pets == null){
            this.pets = new Pet[0];
        } else {
            for(Pet each: this.pets){
                each.owner = this;
            }
        }
    }

    public void setOwner(String owner) {
        this.pets = new Pet[]{};
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pets = Arrays.copyOf(pets, pets.length + 1);
        pets[pets.length - 1] = pet;

    }


    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        int x = 0;
        ArrayList<Pet> aL = new ArrayList<>(Arrays.asList(this.pets));
        for(Pet item: this.pets){
            if(item.equals(pet)){
                aL.remove(item);
                x++;
            }
        }
        pets = aL.toArray(pets);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        boolean is = false;
        for(Pet id: this.pets){
            if(id.equals(pet)){
                is = true;
            }
        }
       return is;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungestPetAge() {
        Integer young = Integer.MAX_VALUE;
        for(Pet pet: pets){
            Integer x = pet.getAge();
            if(x < young){
                young = x;
            }
        }
        return young;
    }



    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer old = 0;
        for(Pet pet: pets){
            if(pet.getAge() > old){
                old = pet.getAge();
            }
        }
        return old;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer x = 0;
        for(Pet pet: pets){
            x += pet.getAge();
        }
        Float y = (float)(x/pets.length);
        return y;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.owner;
    }

        /**
         * @return array representation of animals owned by this PetOwner
         */
        public Pet[] getPets(){
            return this.pets;
        }
}

