package com.company;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;


public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader file;
        file = new BufferedReader(new FileReader("xx.txt"));
        List<String> NL = new ArrayList<String>();
        File urdu = new File("xx.txt");
        Scanner inputfile = new Scanner(urdu);
        inputfile.hasNext(" ");
        Double count =0.0;


        ArrayList<String> abc=new ArrayList<>();
        ArrayList<String> Corpus=new ArrayList<>();

        while (inputfile.hasNextLine())
        {
            {
                String lines = inputfile.nextLine();
                 Corpus.add(lines);
                String[] words = lines.split("\\P{L}+");
                for (String e : words)
                {

                    if (!abc.contains(e))
                   {
                        {
                            abc.add(e);
                            count++;
                        }
                   }
                }
            }


        }
        System.out.println("total lines"+Corpus.size());
        System.out.println("words : "+count);

        int[][] matrix = new int[Corpus.size()][abc.size()];
        for (int i = 0; i < Corpus.size(); i++)
        {
            String[] s =  Corpus.get(i).toString().split(" ");
            for (int j = 0; j < s.length; j++)
            {
                int result = abc.indexOf(s[j]);
                if (result != -1)
                {
                    matrix[i][result] = 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }



    }
}
