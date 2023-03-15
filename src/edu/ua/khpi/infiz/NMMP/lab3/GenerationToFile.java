package edu.ua.khpi.infiz.nmmp.lab3;

import java.io.FileWriter;
import java.io.IOException;

public class GenerationToFile {
    //private int count;
    protected String filename = "src/edu/ua/khpi/infiz/nmmp/lab3/resources/lab3_data.txt";

    public void generateData(int count)  {

        try (FileWriter writer = new FileWriter(filename, false)) {
            int d;
            for (int i = 0; i < count; i++) {
                double x1 = 2.0d * Math.random()-1.0d;
                double x2 = 2.0d * Math.random()-1.0d;
                d=0;
                if ((x2 > (x1 + 0.5d)) || (x2 < (x1 - 0.5d))) {
                    d = 1;
                }
                writer.write(" " + x1 + " " + x2 + " " + d + "\n");
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

