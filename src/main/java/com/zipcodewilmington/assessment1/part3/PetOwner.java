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
    private Pet[] pets;

    public PetOwner(String name, Pet... pets) {
        this.owner = name;
        this.pets = pets;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        getPets();
        for(int i = 0; i<pets.length; i++) {
            if(pets[i] == null) {
                pets[i] = pet;
            }
        }

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for(int i = 0; i<pets.length; i++) {
            if(pets[i].equals(pet)) {
                pets[i] = null;
            }
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for(int i = 0; i<pets.length; i++) {
            if(pet.equals(pets[i])) {
                return true;
            }
        }

        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        return null;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        getPets();
        float average = 0;
        for(int i = 0; i<pets.length; i++) {
            average += pets[i].age;
        }
        average = average / pets.length;
        return average;
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
        String name = "Pet owner name";
        return name;
    }

        /**
         * @return array representation of animals owned by this PetOwner
         */
        public Pet[] getPets(){
            return pets;
        }
}

