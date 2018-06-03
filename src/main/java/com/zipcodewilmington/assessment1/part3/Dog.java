package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */

    private String name;
    private Integer age;
    private PetOwner owner;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.owner = super.owner;
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        this.age = age;
        this.name = "Dog name";
        this.owner = super.owner;
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        this.name = name;
        this.age = 0;
        this.owner = super.owner;
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        this.name = "Dog name";
        this.age = 0;
        this.owner = super.owner;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setOwner(PetOwner owner) {
        owner.addPet(new Dog(this.name, this.age));
        this.owner = owner;
    }


    public PetOwner getOwner() {
        return owner;

    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
