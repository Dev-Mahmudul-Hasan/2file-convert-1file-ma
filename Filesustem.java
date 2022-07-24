package com.mycompany.filesustem;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Filesustem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, j = 0;
        int arr[][] = new int[50][50];
        int arr1[][] = new int[50][50];
        int arr2[][] = new int[50][50];
        int rrr3[][] = new int[50][50];
        int c[][] = new int[50][50];

        System.out.println("Enter Your 2D Squre Marix size: ");
        int n = input.nextInt();
        try {
            
            //Create file
            File dir = new File("C:/Users/User/Downloads/Matrix");
            dir.mkdir();
            
            //Create text file and  formatter System
            Formatter formatter1 = new Formatter("C:/Users/User/Downloads/Matrix/student1.txt");
            Formatter formatter2 = new Formatter("C:/Users/User/Downloads/Matrix/student2.txt");
            
            //File Write  Matrix 1st Rows and Colums
            System.out.println("Enter your 1st Matrix: ");
            for (i = 0; i < n; i++) {

                for (j = 0; j < n; j++) {
                    arr[i][j] = input.nextInt();
                    formatter1.format("\t" + arr[i][j]);
                }
                formatter1.format("\n");
            }
            //File Write  Matrix 1st Rows and Colums
            System.out.println("Enter your 2nd Matrix: ");
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    arr1[i][j] = input.nextInt();
                    formatter2.format("\t" + arr1[i][j]);
                }
                formatter2.format("\n");
            }
            formatter2.close();
            formatter1.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        //Read 1st txt.file (1st matrix)
        try {
            File file1 = new File("C:/Users/User/Downloads/Matrix/student1.txt");
            Scanner scanner1 = new Scanner(file1);
            int ff[] = new int[50];
            int t = 0;
             //read file
            while (scanner1.hasNext()) {
                int l = scanner1.nextInt();
                ff[t] = l;
                t++;
                int y;
                y = 0;
                //1D array convert 2D array Matrix
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++) {
                        rrr3[i][j] = ff[y];
                        y++;
                    }
                }
            }

            scanner1.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        //Read 1st txt.file (1st matrix)
        try {
            File file2 = new File("C:/Users/User/Downloads/Matrix/student2.txt");
            Scanner scanner2 = new Scanner(file2);
            Formatter formatter3 = new Formatter("C:/Users/User/Downloads/Matrix/student3.txt");

            int tt[] = new int[50];
            int f = 0;
            //read file
            while (scanner2.hasNext()) {
                int a = scanner2.nextInt();
                tt[f] = a;
                f++;
                int m;
                m = 0;
                
                //1D array convert 2D array Matrix
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++) {
                        arr2[i][j] = tt[m];
                        m++;
                    }
                }
            }
            
            // 1st and 2nd txt.file multification
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        c[i][j] += rrr3[i][k] * arr2[k][j];
                    }
                }
            }
            
            // Multifiaction wrtie 3rd file
            System.out.println("Multification Matrix: ");
            for (i = 0; i < n; i++) {
                formatter3.format("\n");
                System.out.print("\n");
                for (j = 0; j < n; j++) {
                    formatter3.format("\t" + c[i][j]);
                    System.out.print("\t" + c[i][j]);
                }
            }
            scanner2.close();
            formatter3.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
