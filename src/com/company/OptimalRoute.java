package com.company;

import java.util.HashMap;
import java.util.LinkedList;

public class OptimalRoute extends ListAttractions {
    float[] listFloatTime = new float[list.length];
    float[] listFloatImportance = new float[list.length];
    String[] listStringSight = new String[list.length];

    float[] listFloatDifference = new float[list.length];

    double averageTime = 0;
    double sumTime = 0;
    float count = 0;

    public void printListAttraction() {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 2) {
                    listFloatTime[i] = Float.parseFloat(list[i][j]);
                    sumTime += listFloatTime[i];
                }
                else if (j == 3)
                    listFloatImportance[i] = Float.parseFloat(list[i][j]);
                System.out.print(list[i][j] + "\t\t");
            }
            System.out.println();
        }
        averageTime = Math.rint(sumTime / listFloatTime.length);
        valueFilter();
    }
    public void valueFilter() {
        for (int i = 0; i < list.length; i++) {

                if (listFloatTime[i] < (float) averageTime * 2) {
                    listStringSight[i] = list[i][0];

                }
                else
                {
                    listStringSight[i] = " ";
                    listFloatTime[i] = 0;
                    listFloatImportance[i] = 0;
                }

            listFloatDifference[i] = listFloatImportance[i] - listFloatTime[i];
        }
        System.out.println();
        System.out.println();
        result();
    }
    public void result() {
        HashMap<String, Float> list1 = new HashMap<>();
        for (int i = 0; i < listStringSight.length; i++)
        {
            list1.put(listStringSight[i], listFloatDifference[i]);
            if (averageTime > list1.put(listStringSight[i], listFloatDifference[i]))
            {
                list1.remove(listStringSight[i], listFloatDifference[i]);
            }
        }
        System.out.println(list1.values());
        System.out.println(list1.keySet());
    }
}
