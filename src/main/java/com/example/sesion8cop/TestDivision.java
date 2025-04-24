package com.example.sesion8cop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Resultado: " + (a/b)), lanza un  ArithmeticException

        try {
            System.out.println("Ingrese el valor de a: ");
            float a = sc.nextInt();
            System.out.println("Ingrese el valor de b: ");
            float b = sc.nextInt();
            float c = 0;
            c = (a/b);
            System.out.println("Resultado: " + c);


        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre zero");
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar solamente numeros");
        } finally {
            System.out.println("Operación finalizada");
            sc.close();
        }
    }
}