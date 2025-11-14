import java.util.Random;

class ArrayInitialization {

    public static void main(String[] args) {
        int[] dataPoints = new int[100];

        Random randomGenerator = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            int randomNumber = randomGenerator.nextInt(100) + 1;

            dataPoints[i] = randomNumber;
        }

        System.out.println("First 5 data points initialized:");
        for (int i = 0; i < 5; i++) {
            System.out.println("dataPoints[" + i + "]: " + dataPoints[i]);
        }
    }
}


class ArrayPrinter {

    public static void main(String[] args) {
        int[] dataPoints = new int[100];


        for (int i = 0; i < dataPoints.length; i++) {

            System.out.printf("%d", dataPoints[i]);

            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }

        System.out.println();
    }
}


class ArrayStats {

    public static void main(String[] args) {
        int[] dataPoints = new int[100];

        long sum = 0;
        double average = 0.0;


        for (int dataPoint : dataPoints) {
            sum += dataPoint;
        }


        average = (double) sum / dataPoints.length;


        System.out.println("\n--- Array Statistics ---");

        System.out.println("The **sum** of all the values in the dataPoints array is: **" + sum + "**");

        System.out.printf("The **average** of the random array dataPoints is: **%.2f**\n", average);
    }
}


import SafeInput.SafeInput;

public class UserInput {

    public static void main(String[] args) {


        final int MIN = 1;
        final int MAX = 100;

        int targetValue = SafeInput.getRangedInt(System.in, "Enter a target value", MIN, MAX);


        System.out.println("You entered a validated target value: **" + targetValue + "**");

    }
}


class ArraySearcher {

    public static void main(String[] args) {
        int[] dataPoints = new int[100];

        int targetValue = 50;

        int count = 0;

        for (int dataPoint : dataPoints) {

            if (dataPoint == targetValue) {
                count++;
            }
        }

        System.out.println("\n--- Search Results ---");

        if (count > 0) {
            System.out.println("The program **found** the value **" + targetValue +
                    "** **" + count + "** times in the dataPoints array.");
        } else {
            System.out.println("The value **" + targetValue +
                    "** was **NOT FOUND** in the dataPoints array (count: 0).");
        }
    }
}

class ArrayMinMaxFinder {

    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        int minVal = dataPoints[0];

        int maxVal = dataPoints[0];


        for (int i = 1; i < dataPoints.length; i++) {

            int currentVal = dataPoints[i];

            if (currentVal < minVal) {
                minVal = currentVal;
            }

            if (currentVal > maxVal) {
                maxVal = currentVal;
            }
        }


        System.out.println("\n--- Minimum and Maximum Values ---");
        System.out.println("The **minimum** value found in the dataPoints array is: **" + minVal + "**");
        System.out.println("The **maximum** value found in the dataPoints array is: **" + maxVal + "**");
    }
}



import java.util.Random;

class Task9 {

    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random randomGenerator = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = randomGenerator.nextInt(100) + 1;
        }


        System.out.println("The average of the values in the dataPoints array is: " + getAverage(dataPoints));

    }


    public static double getAverage(int values[]) {
        if (values == null || values.length == 0) {
            return 0.0;
        }

        long sum = 0;

        for (int val : values) {
            sum += val;
        }


        return (double) sum / values.length;
    }
}