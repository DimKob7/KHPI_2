package edu.ua.khpi.infiz.dotnet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stars = "********************";
//        try {
//            number = scanner.nextInt();
//            marker = true;
//            scanner.close();
//        } catch (InputMismatchException e) {
//            System.out.println("Wrong input! Stay calm and carry on!");
//        }
        int rows1 = 0;
        int columns1 = 0;
        int rows2 = 0;
        int columns2 = 0;
        try {
            System.out.print("Введіть кількість рядків першої матриці: ");
            rows1 = scanner.nextInt();

            System.out.print("Введіть кількість стовпців першої матриці: ");
            columns1 = scanner.nextInt();

            System.out.print("Введіть кількість рядків другої матриці: ");
            rows2 = scanner.nextInt();
            System.out.print("Введіть кількість стовпців другої матриці: ");
            columns2 = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Не вірно введені дані, треба ввести число а не букву!");
            scanner.close();
            System.exit(0);
        }



        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Ввести значення матриць вручну? (y/n): ");

        String inputChoice = scanner2.next();
        boolean manualInput = inputChoice.equalsIgnoreCase("y")||inputChoice.equalsIgnoreCase("Y");

        Matrix matrix1 = new Matrix(rows1, columns1);
        Matrix matrix2 = new Matrix(rows2, columns2);

        matrix1.readData(scanner2, manualInput);
        matrix2.readData(scanner2, manualInput);

        System.out.println(stars+"  Перша матриця:  "+stars);
        matrix1.printMatrix();

        System.out.println(stars+"  Друга матриця:  "+stars);
        matrix2.printMatrix();


        System.out.println(stars+"  Сума матриць:   "+stars);
        Matrix sum = matrix1.add(matrix2);
        sum.printMatrix();


        System.out.println(stars+"  Різниця матриць:    "+stars);
        Matrix difference = matrix1.subtract(matrix2);
        difference.printMatrix();


        System.out.println(stars+"  Добуток матриць:    "+stars);
        Matrix product = matrix1.multiply(matrix2);
        product.printMatrix();

        scanner2.close();
    }
}
