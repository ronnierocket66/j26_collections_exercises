package Zad3;

public class Student {

    public Student(String indeks, String name, String surename, Gender gender) {
        this.indeks = indeks;
        this.name = name;
        this.surename = surename;
        this.gender = gender;
    }
    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private String indeks, name, surename;
   private Gender gender;

    @Override
    public String toString() {
        return "Student{" +
                "indeks='" + indeks + '\'' +
                ", name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", gender=" + gender +
                '}';
    }
}
