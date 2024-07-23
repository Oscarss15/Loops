package dev.oscar;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    

    public static void main(String[] args) {
        int num = 5; 
        List<String> table = TableCreationMultiply(num);
        PrintTableMultiply(table);
    }


    public static List<String> TableCreationMultiply(int num) {
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            table.add(num + " x " + i + " = " + (num * i));
        }
        return table;
    }

  
    public static void PrintTableMultiply(List<String> table) {
        for (String linea : table) {
            System.out.println(linea);
        }
    }
}