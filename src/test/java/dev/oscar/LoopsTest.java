package dev.oscar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LoopsTest {
    @Test
    void testPrintTableMultiply() {
        List<String> table = new ArrayList<>();
        table.add("5 x 1 = 5");
        table.add("5 x 2 = 10");
        table.add("5 x 3 = 15");
        table.add("5 x 4 = 20");
        table.add("5 x 5 = 25");
        table.add("5 x 6 = 30");
        table.add("5 x 7 = 35");
        table.add("5 x 8 = 40");
        table.add("5 x 9 = 45");
        table.add("5 x 10 = 50");

        Loops.PrintTableMultiply(table);  
    }

    @Test
    void testTableCreationMultiply() {
        int num = 5;
        List<String> expectedTable = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            expectedTable.add(num + " x " + i + " = " + (num * i));
        }
        
        List<String> actualTable = Loops.TableCreationMultiply(num);
        
        assertEquals(expectedTable, actualTable);
    }

   
}
