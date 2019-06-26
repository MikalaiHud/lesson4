package com.epam.hud;

import com.epam.hud.container.ProgrammerContainer;
import com.epam.hud.entity.Programmer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ProgrammerContainer programmerContainer = new ProgrammerContainer();
        Programmer programmer1 = new Programmer("Nikita", 16000, 2, 1);
        Programmer programmer2 = new Programmer("Nikita", 16000, 2, 2);
        Programmer programmer3 = new Programmer("Nikita", 16000, 2, 3);
        Programmer programmer4 = new Programmer("Nikita", 16000, 2, 4);
        Programmer programmer5 = new Programmer("Nikita", 16000, 2, 5);
        Programmer programmer6 = new Programmer("Nikita", 16000, 2, 10);
        Programmer programmer7 = new Programmer("Nikita", 16000, 2, 10);
        Programmer programmer8 = new Programmer("Nikita", 16000, 2, 10);
        Programmer programmer9 = new Programmer("Nikita", 16000, 2, 10);

        programmerContainer.addProgrammer(programmer1);
        programmerContainer.addProgrammer(programmer2);
        programmerContainer.addProgrammer(programmer3);
        programmerContainer.addProgrammer(programmer4);
        programmerContainer.addProgrammer(programmer5);
        programmerContainer.addProgrammer(programmer6);
        programmerContainer.addProgrammer(programmer7);
        programmerContainer.addProgrammer(programmer8);
        programmerContainer.addProgrammer(programmer9);

        System.out.println("-------Get All programmers-------");
        Programmer[] programmersInContainer = programmerContainer.getAll();
        Programmer programmer10 = new Programmer("Vasiliy", 50000, 3, 5);
        programmerContainer.addProgrammer(programmer10);
        programmerContainer.editProgrammer(5, "Vlad", 3000, 2, 4);
        System.out.println("-------Get All programmers after Edit-------");
        for (int i = 0; i < programmersInContainer.length; i++) {
            System.out.println(programmersInContainer[i]);
        }
        System.out.println("-------Get All programmers after delete-------");
        Programmer[] result = programmerContainer.deleteProgrammer(programmersInContainer, 3);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        programmerContainer.setArrayProgrammer(result);

        for (int i = 0; i < programmersInContainer.length; i++) {
            System.out.println(programmersInContainer[i]);
        }
        System.out.println("Get programmer by index: " + programmerContainer.getProgrammer(4));
        programmersInContainer = programmerContainer.getAll();

    }
}
