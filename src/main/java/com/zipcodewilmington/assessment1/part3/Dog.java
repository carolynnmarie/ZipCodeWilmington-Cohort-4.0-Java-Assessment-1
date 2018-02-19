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
        this.name = "Name of Dog";
        this.age = Integer.MAX_VALUE;
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        this.age = Integer.MAX_VALUE;
        this.name = "Dog name";
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        this.name = "Name of Dog";
        this.age = 0;

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
        this.age = Integer.MAX_VALUE;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setOwner(PetOwner owner) {
        this.owner = owner;
    }

    @Override
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
