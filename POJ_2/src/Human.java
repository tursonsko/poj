/*
* This is Human class - it takes getters and setters and has parameters such as:
* name, age, height, weight, gender, student's index number and feet size
* It also has a method calles isMale() which check, if human is female or male and returns appropriate output
* Author: Wojtek
* */

import java.lang.String;

public class Human {

    private String name;
    private int age;
    private int height;
    private int weight;
    private String gender;
    private String indexNumber;
    private double feetSize;

    public Human() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getIndexNumber() {
        return indexNumber;
    }
    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public double getFeetSize() {
        return feetSize;
    }
    public void setFeetSize(double feetSize) {
        this.feetSize = feetSize;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) { this.gender = gender; }

    public void isMale(String gender) {
        String validGender = gender.toLowerCase();
        if (validGender.equals("male")) {
            System.out.println("Gender: MALE");
        } else if (validGender.equals("female")) {
            System.out.println("Gender: FEMALE");
        } else {
            System.out.println("Gender: UNKNOWN :)");
        }
    }


    public static void main(String[] args) {

        //MY OWN PARAMETERS
        Human wojtek = new Human();

        wojtek.setName("wojtek");
        wojtek.setAge(27);
        wojtek.setHeight(181);
        wojtek.setWeight(81);
        wojtek.setFeetSize(44.5);
        wojtek.setGender("foo");
        wojtek.setIndexNumber("s21611");

        System.out.println("Name: " + wojtek.getName());
        System.out.println("Age: " + wojtek.getAge());
        System.out.println("Height(CM): " + wojtek.getHeight());
        System.out.println("Weight(KG): " + wojtek.getWeight());
        System.out.println("Feet size (US): " + wojtek.getFeetSize());
        System.out.println("Index number: " + wojtek.getIndexNumber());
        wojtek.isMale(wojtek.getGender());

    }
}
