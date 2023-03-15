package edu.ua.khpi.infiz.nmmp.lab3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Lab 3. \nTask1: Data generation. \nTask2: Data calculation.\n ");
        GenerationToFile generationToFile = new GenerationToFile();
        generationToFile.generateData(1000);
    }
}
