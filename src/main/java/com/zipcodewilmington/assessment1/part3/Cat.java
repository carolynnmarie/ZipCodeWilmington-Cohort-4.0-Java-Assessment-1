package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */

    private String name;
    private Integer age;
    private PetOwner owner;

    public Cat(String name, Integer age) {

    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {

    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {


    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Integer getAge() {
        return null;
    }

    @Override
    public void setOwner(PetOwner newPetOwner) {

    }

    @Override
    public PetOwner getOwner() {
        return null;
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return null;
    }
}
