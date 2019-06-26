package com.epam.hud.container;

import com.epam.hud.entity.Programmer;

import java.util.Arrays;

/**
 * int size = 0
 * int capacity = 10
 * Programmer[] arrayProgrammer = new Programmer[capacity];
 * addProgrammer(Programmer programmer) {
 * if (size+1 >= capacity) {
 * araryCapacityIncrease()
 * }
 * arrayProgrammer[size+1] =  programmer
 * }
 */

public class ProgrammerContainer {
    private int capacity = 10;
    private Programmer[] arrayProgrammer = new Programmer[capacity];
    private int size = 0;

    public void addProgrammer(Programmer programmer) {
        if (size >= capacity) {
            arrayProgrammer = getExpandArray();
        }
        arrayProgrammer[size] = programmer;
        size++;
    }

    private Programmer[] getExpandArray() {
        int newSize = arrayProgrammer.length * 2;
        Programmer[] intermediateArray = new Programmer[newSize];
        for (int i = 0; i < arrayProgrammer.length; i++) {
            intermediateArray[i] = arrayProgrammer[i];
        }
        capacity = newSize;
        return intermediateArray;
    }

    public void editProgrammer(int index, String name, int stringNumber, int beforeSalary, int afterSalary) {
        if (index < size) {
            arrayProgrammer[index].setName(name);
            arrayProgrammer[index].setStringNumber(stringNumber);
            arrayProgrammer[index].setBeforeSalary(beforeSalary);
            arrayProgrammer[index].setAfterSalary(afterSalary);
        } else {
            System.out.println("Warning! Index out of bound.");
        }
    }

    public void setArrayProgrammer(Programmer[] arrayProgrammer) {
        size = arrayProgrammer.length;
        capacity = arrayProgrammer.length;
        this.arrayProgrammer = arrayProgrammer;
    }

    public Programmer[] deleteProgrammer(Programmer[] array, int index) {
        if (index < size) {
            Programmer[] intermediateArray = new Programmer[array.length];
            size--;
            for (int i = 0; i < index; i++) {
                intermediateArray[i] = array[i];
            }
            for (int i = index; i < array.length - 1; i++) {
                intermediateArray[i] = array[i + 1];
            }
            return intermediateArray;
        } else {
            System.out.println("Warning! Index out of bound.");
            return null;
        }
    }

    public Programmer getProgrammer(int index) {
        if (index < size) {
            return arrayProgrammer[index];
        } else {
            System.out.println("Warning! Index out of bound.");
            return null;
        }
    }

    public Programmer[] getAll() {
        return arrayProgrammer;
    }

    @Override
    public String toString() {
        StringBuilder programmers = new StringBuilder();
        for (int i = 0; i < size; i++) {
            programmers.append(arrayProgrammer[i]);
            programmers.append("\n");
        }
        return programmers.toString();
    }
}
