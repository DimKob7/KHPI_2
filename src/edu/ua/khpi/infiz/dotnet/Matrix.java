package edu.ua.khpi.infiz.dotnet;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    private int[][] data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new int[rows][columns];
    }


    public void readData(Scanner scanner, boolean manualInput) {
        if (manualInput) {
            System.out.println("Введіть елементи матриці:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    data[i][j] = scanner.nextInt();
                }
            }
        } else {
            Random random = new Random();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    data[i][j] = random.nextInt(100); // Генерувати значення від 0 до 99
                }
            }
        }
    }

    public Matrix add(Matrix other) {
        if (rows != other.rows || columns != other.columns) {
            System.out.println("Розмірності матриць не співпадають виконання операцій додавання. Помилка!!!");
            System.exit(0);
            //throw new IllegalArgumentException("Розмірності матриць не співпадають");
        }


        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = data[i][j] + other.data[i][j];
            }
        }

        return result;
    }

    public Matrix subtract(Matrix other) {
        if (rows != other.rows || columns != other.columns) {
            System.out.println("Розмірності матриць не співпадають виконання операцій віднімання. Помилка!!!");
            System.exit(0);
//              throw new IllegalArgumentException("Розмірності матриць не співпадають");
        }

        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = data[i][j] - other.data[i][j];
            }
        }

        return result;
    }

    public Matrix multiply(Matrix other) {
        if (columns != other.rows) {
            System.out.println("Кількість стовпців першої матриці повинна дорівнювати кількості рядків другої матриці. Помилка!!!");
            System.exit(0);
//            throw new IllegalArgumentException("Кількість стовпців першої матриці повинна дорівнювати кількості рядків другої матриці");
        }

        int resultRows = rows;
        int resultColumns = other.columns;
        Matrix result = new Matrix(resultRows, resultColumns);

        for (int i = 0; i < resultRows; i++) {
            for (int j = 0; j < resultColumns; j++) {
                int sum = 0;
                for (int k = 0; k < columns; k++) {
                    sum += data[i][k] * other.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }

        return result;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
