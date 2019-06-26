package com.epam.hud.entity;

public class Programmer {
    private int stringNumber;
    private int beforeSalary;
    private int afterSalary;
    private int generalSalary;
    private String name;

    public Programmer(String name, int stringNumber, int beforeSalary, int afterSalary) {
        this.name = name;
        this.afterSalary = afterSalary;
        this.beforeSalary = beforeSalary;
        this.stringNumber = stringNumber;
    }

    public Programmer() {
        stringNumber = 5100;
        beforeSalary = 5;
        afterSalary = 10;
        name = "Vasiliy";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public void setStringNumber(int stringNumber) {
        this.stringNumber = stringNumber;
    }

    public int getBeforeSalary() {
        return beforeSalary;
    }

    public void setBeforeSalary(int beforeSalary) {
        this.beforeSalary = beforeSalary;
    }

    public int getAfterSalary() {
        return afterSalary;
    }

    public void setAfterSalary(int afterSalary) {
        this.afterSalary = afterSalary;
    }

    public int getGeneralSalary() {
        return generalSalary;
    }

    public void setGeneralSalary(int generalSalary) {
        this.generalSalary = generalSalary;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "stringNumber=" + stringNumber +
                ", beforeSalary=" + beforeSalary +
                ", afterSalary=" + afterSalary +
                ", generalSalary=" + generalSalary +
                ", name='" + name + '\'' +
                '}';
    }
}
