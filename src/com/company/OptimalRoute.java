package com.company;

public class OptimalRoute extends ListAttractions {
    float[] listFloatTime = new float[list.length];
    float[] listFloatImportance = new float[list.length];
    String[] listStringSight = new String[list.length];

    double averageTime = 0;
    double sumTime = 0;
    int count = 0;

    public void printListAttraction() {
        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (j == 1)
                {
                    listFloatTime[i] = Float.parseFloat(list[i][j]);
                    sumTime += listFloatTime[i];
                }
                else if (j == 2)
                    listFloatImportance[i] = Float.parseFloat(list[i][j]);
                System.out.print(list[i][j] + "\t\t");
            }
            System.out.println();
        }
        averageTime = Math.rint(sumTime / listFloatTime.length);
    }
}
