package com.company;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    void array() throws MyArraySizeException, MyArrayDataException {
        String[][] massiv = {{"1","1","1","1"},{"2","g","2","2"},{"3","3","3","3"},{"4","4","4","4"}};
        calculation(massiv);
    }

    void calculation(String massiv[][]) throws MyArraySizeException, MyArrayDataException {
        int len = 0;
        int rows = massiv.length;
        for (int m = 0; m < massiv.length; m++) {
            if(massiv[m].length!=4 || rows!=4) throw new MyArraySizeException("Matrix not 4x4");


        }
        int sum=0;
        Integer [][] convMassiv = new Integer[massiv.length][massiv.length];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                try {
                    convMassiv[i][j] = Parsing(massiv[i][j]);

                } catch (MyArrayDataException e) {
                    System.out.println("Is not number: " +i+ " " +j );
                    e.printStackTrace();
                    convMassiv[i][j] = 0; //не рабоатет
                }
                System.out.printf(convMassiv[i][j]+ " ");
                sum=convMassiv[i][j]+sum;
            }
            System.out.println();
        }}
int Parsing(String convMassiv) throws MyArrayDataException{
        try{
            return Integer.parseInt(convMassiv);
        }
        catch(Exception ex)
    {
        throw new MyArrayDataException("DON'T TOUCH, IS WORKING");
    }
}

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
            // write your code here
            Main ob = new Main();
            ob.array();

}}