/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gwss.ics3cu.muir.alexUnit4Arrays;

/**
 *
 * @author User
 */
public class AlexArrayUtil implements ArrayUtilities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlexArrayUtil aau = new AlexArrayUtil();
        int[][] data = {{1, 3, 6, 7}, {1, 2, 9}};
        String s = "hello";
        System.out.println(s);
        //System.out.println(aau.copyArray(s));
        System.out.println(data);



    }

    /**
     * version: 1.0
     *
     * description this method copies a 1d array of data.
     *
     * @param data
     * @return copyData
     */

    public int[] copyArray(int[] data) {
        int[] copyData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            int[] copyRow = new int[data.length];
            copyData = copyRow;
        }

        return copyData;
    }

    public int[][] copyArray(int[][] data) {
        int[][] copyData = new int[data.length][];
        for (int i = 0; i < data.length; i++) {
            int[] copyRow = new int[data[i].length];
            for (int j = 0; j < data.length; j++) {
                copyRow[j] = data[i][j];
            }
            copyData[i] = copyRow;
        }
        return copyData;
    }


   
    public double[] copyArray(double[] data) {
        double[] copy = new double[data.length];
        for (int row = 0; row < data.length; row++) {
            copy[row] = data[row];
        }
        return copy;
    }

  
    public double[][] copyArray(double[][] data) {
        double[][] copyData = new double[data.length][];
        for (int i = 0; i < data.length; i++) {
            double[] copyRow = new double[data[i].length];
            for (int j = 0; j < data.length; j++) {
                copyRow[j] = data[i][j];
            }
            copyData[i] = copyRow;
        }
        return copyData;
    }

   
    public String[] copyArray(String[] data) {
        String copyData[] = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            String[] copyRow = new String[data.length];
            copyData = copyRow;
        }
        return copyData;
    }

    public String[][] copyArray(String[][] data) {
        String copyData[][] = new String[data.length][];
        for (int i = 0; i < data.length; i++) {
            String copyRow[] = new String[data[i].length];
            for (int j = 0; j < data.length; j++) {
                copyRow[j] = (String) data[i][j];
            }
            copyData[i] = copyRow;
        }
        return copyData;
    }

    /**
     * version: 1.0
     *
     * description: this method prints an array of data (1d)
     *
     * @param data
     */
    @Override
    public void displayArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    @Override
    public void displayArray(double[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    @Override
    public void displayArray(String[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    @Override
    public void displayArray(int[][] data) {
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                System.out.print(data[row][col] + ",");
            }
            System.out.println();
        }
    }

    @Override
    public void displayArray(double[][] data) {
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                System.out.print(data[row][col] + ",");
            }
            System.out.println();
        }
    }

    @Override
    public void displayArray(String[][] data) {
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                System.out.print(data[row][col] + ",");
            }
            System.out.println();
        }
    }

    /**
     * version:1.0
     *
     * this method swaps 2 numbers to switch their locations in the array.
     *
     * @param data
     * @param i first number
     * @param j second number
     */
    @Override
    public void swap(int[] data, int i, int j) {
        int tmp;
        tmp = data[j];
        data[j] = data[i];
        data[i] = tmp;

    }

    @Override
    public void swap(int[][] data, int rowI, int colI, int rowJ, int colJ) {
        int tmp;
        tmp = data[rowI][colI];
        data[rowI][colI] = data[rowJ][colJ];
        data[rowJ][colJ] = tmp;
    }

    @Override
    public void swap(double[] data, int i, int j) {
        double tmp;
        tmp = data[j];
        data[j] = data[i];
        data[i] = tmp;
    }

    @Override
    public void swap(double[][] data, int rowI, int colI, int rowJ, int colJ) {
        double tmp;
        tmp = data[rowI][colI];
        data[rowI][colI] = data[rowJ][colJ];
        data[rowJ][colJ] = tmp;
    }

    @Override
    public void swap(String[] data, int i, int j) {
        String tmp;
        tmp = data[j];
        data[j] = data[i];
        data[i] = tmp;
    }

    @Override
    public void swap(String[][] data, int rowI, int colI, int rowJ, int colJ) {
        String tmp;
        tmp = data[rowI][colI];
        data[rowI][colI] = data[rowJ][colJ];
        data[rowJ][colJ] = tmp;
    }

    /**
     * version:1.0
     *
     * this method bubble sorts the array. It finds if the first number is
     * bigger than the second number and if not it will swap those numbers.
     *
     * @param data
     */
    @Override
    public void bubbleSort(int[] data) {
        for (int pass = 0; pass < data.length; pass++) {
            for (int i = 0; i < data.length - pass - 1; i++) {
                if (data[i] > data[i + 1]) {
                    swap(data, i, i + 1);
                }
            }
        }
    }

    @Override
    public void selectionSort(int[] data) {
        for (int pass = 0; pass < data.length; pass++) {
            int indexOfMin = pass;
            for (int i = pass + 1; i < data.length; i++) {
                if (data[i] < data[indexOfMin]) {
                    indexOfMin = i;
                }
            }
            swap(data, indexOfMin, pass);
        }
    }

    @Override
    public void bubbleSort(double[] data) {
        for (int pass = 0; pass < data.length; pass++) {
            for (int i = 0; i < data.length - pass - 1; i++) {
                if (data[i] > data[i + 1]) {
                    swap(data, i, i + 1);
                }
            }
        }
    }

    @Override
    public void selectionSort(double[] data) {
        for (int pass = 0; pass < data.length; pass++) {
            int indexOfMin = pass;
            for (int i = pass + 1; i < data.length; i++) {
                if (data[i] < data[indexOfMin]) {
                    indexOfMin = i;
                }
            }
            swap(data, indexOfMin, pass);
        }
    }

    @Override
    public void bubbleSort(String[] data) {
        String tmp;
        for (int pass = 0; pass < data.length; pass++) {
            for (int i = 0; i < data.length - 1 - pass; i++) {
                double compareNumber = data[i].compareTo(data[i + 1]);
                if (compareNumber > 0) {
                    tmp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = tmp;
                }
            }
        }
    }

    @Override
    public void selectionSort(String[] data) {
        for (int pass = 0; pass < data.length; pass++) {
            int indexOfMin = pass;
            for (int i = pass + 1; i < data.length; i++) {
                double compareNumber = data[i].compareTo(data[indexOfMin]);
                if (compareNumber < 0) {
                    indexOfMin = i;
                }
            }
            swap(data, indexOfMin, pass);
        }
    }

    /// @Override
    public int linearSearch(int[] data, int value) {
        int indexOfValue = -1;
        for (int i = 0; i < data.length; i++) {
            if (value == data[i]) {
                indexOfValue = i;
            }
        }
        return indexOfValue;
    }

    @Override
    public void binarySearch(int[] data) {
        int left = 0;
        int right = data.length - 1;
        int indexOfValue = -1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (indexOfValue == data[middle]) {
                indexOfValue = middle;
            } else if (indexOfValue > data[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
    }

    //  @Override
    public double linearSearch(double[] data, double value) {
        double indexOfValue = -1;
        for (int i = 0; i < data.length; i++) {
            if (value == data[i]) {
                indexOfValue = i;
            }
        }
        return indexOfValue;
    }

    @Override
    public void binarySearch(double[] data) {

        int left = 0;
        int right = data.length - 1;
        int indexOfValue = -1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (indexOfValue == data[middle]) {
                indexOfValue = middle;
            } else if (indexOfValue > data[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }


    }

    // @Override
    public int linearSearch(String[] data, String value) {
        int indexOfValue = -1;
        for (int i = 0; i < data.length; i++) {
            if (value.equals(data[i])) {
                indexOfValue = i;
            }
        }
        return indexOfValue;
    }

    // @Override
    public int binarySearch(String[] data, String value) {
        int left = 0;
        int right = data.length - 1;
        int indexOfValue = -1;

        while (left <= right) {
            int middle = (left + right) / 2;
            double compare = value.compareTo(data[middle]);
            if (compare == 0) {
                indexOfValue = middle;
            } else if (compare > 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return indexOfValue;
    }

    @Override
    public int findMaximumValue(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    @Override
    public double findMaximumValue(double[] data) {
        double max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    @Override
    public int findIndexOfMaximumValue(int[] data) {
        int indexOfMaxValue = 0;
        for (int i = 0; i > data.length; i++) {
            if (data[i] > indexOfMaxValue) {
                indexOfMaxValue = i;
            }
        }
        return indexOfMaxValue;
    }

    @Override
    public int findIndexOfMaximumValue(double[] data) {
        int indexOfMaxValue = 0;
        for (int i = 0; i > data.length; i++) {
            if (data[i] > indexOfMaxValue) {
                indexOfMaxValue = i;
            }
        }
        return indexOfMaxValue;
    }

    @Override
    public int findMinimumValue(int[] data) {
        int low = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < low) {
                low = data[i];
            }
        }
        return low;
    }

    @Override
    public double findMinimumValue(double[] data) {
        double low = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < low) {
                low = data[i];
            }
        }
        return low;
    }

    @Override
    public int findIndexOfMinimumValue(int[] data) {
        int indexOfMinimum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < indexOfMinimum) {
                indexOfMinimum = i;
            }
        }
        return indexOfMinimum;
    }

    @Override
    public int findIndexOfMinimumValue(double[] data) {
        int indexOfMinimum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < indexOfMinimum) {
                indexOfMinimum = i;
            }
        }
        return indexOfMinimum;
    }

    @Override
    public int findMaximumValue(int[][] data) {
        int maxValue = findMaximumValue(data[0]);
        for (int row = 1; row < data.length; row++) {
            for (int col = 1; col < data.length; col++) {
                int rowMax = findMaximumValue(data[row]);
                if (rowMax < maxValue) {
                    maxValue = rowMax;
                }
            }
        }
        return maxValue;
    }

    @Override
    public double findMaximumValue(double[][] data) {
        double maxValue = findMaximumValue(data[0]);
        for (int row = 1; row < data.length; row++) {
            double rowMax = findMaximumValue(data[row]);
            if (rowMax < maxValue) {
                maxValue = rowMax;
            }
        }
        return maxValue;
    }

   @Override
    public int[] findIndexOfMaximumValue(int[][] data) {
        int[] indicesOfMaxValue = new int[2];
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col > data.length; col++) {
                if (data[col][row] > data[ indicesOfMaxValue[0]][indicesOfMaxValue[1]]) {
                    indicesOfMaxValue[0] = row;
                    indicesOfMaxValue[1] = col;
                }
            }
        }
        return indicesOfMaxValue;
    }

    @Override
    public int[] findIndexOfMaximumValue(double[][] data) {
        int[] indicesOfMaxValue = new int[2];
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col > data.length; col++) {
                if (data[col][row] > data[ indicesOfMaxValue[0]][indicesOfMaxValue[1]]) {
                    indicesOfMaxValue[0] = row;
                    indicesOfMaxValue[1] = col;
                }
            }
        }
        return indicesOfMaxValue;
    }

    @Override
    public int findMinimumValue(int[][] data) {
        int minValue = findMinimumValue(data[0]);
        for (int row = 1; row < data.length; row++) {
            int rowMin = findMinimumValue(data[row]);
            if (rowMin < minValue) {
                minValue = rowMin;
            }
        }
        return minValue;
    }

    @Override
    public double findMinimumValue(double[][] data) {
        double minValue = findMinimumValue(data[0]);
        for (int row = 1; row < data.length; row++) {
            double rowMin = findMinimumValue(data[row]);
            if (rowMin < minValue) {
                minValue = rowMin;
            }
        }
        return minValue;
    }

    @Override
    public int[] findIndexOfMinimumValue(int[][] data) {
        int[] indicesOfMinValue = new int[2];
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i > data.length; i++) {
                if (data[i][j] > data[ indicesOfMinValue[0]][indicesOfMinValue[1]]) {
                    indicesOfMinValue[0] = j;
                    indicesOfMinValue[1] = i;
                }
            }
        }
        return indicesOfMinValue;
    }

    @Override
    public int[] findIndexOfMinimumValue(double[][] data) {
        int[] indicesOfMinValue = new int[2];
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i > data.length; i++) {
                if (data[i][j] > data[ indicesOfMinValue[0]][indicesOfMinValue[1]]) {
                    indicesOfMinValue[0] = j;
                    indicesOfMinValue[1] = i;
                }
            }
        }
        return indicesOfMinValue;
    }

    public int findIndexOfMinimumValue(int[][] data, int colIndex) {
        int indicesOfMinValue = 0;
        for (int row = 1; row < data.length; row++) {
            if (data[row][colIndex] < data[indicesOfMinValue][colIndex]) {
                indicesOfMinValue = row;
            }
        }
        return indicesOfMinValue;
    }

    public int findIndexOfMaximumValue(int[][] data, int colIndex) {
        int indicesOfMinValue = 0;
        for (int row = 1; row < data.length; row++) {
            if (data[row][colIndex] > data[indicesOfMinValue][colIndex]) {
                indicesOfMinValue = row;
            }
        }
        return indicesOfMinValue;
    }

    @Override
    public double findAverage(int[] data) {
        return findSum(data) / data.length;
    }

    @Override
    public double findAverage(double[] data) {
        return findSum(data) / data.length;
    }

    @Override
    public double findAverage(int[][] data) {
        double rowSum = 0;
        int numValues = 0;
        for (int row = 0; row < data.length; row++) {
            rowSum = findSum(data[row]) + rowSum;
            numValues = numValues + data[row].length;
        }
        return rowSum / numValues;
    }

    public double findAverage(int[][] data, int colIndex) {
        double sum = 0;

        for (int row = 0; row < data.length; row++) {
            sum = sum + data[row][colIndex];

        }
        return sum / data.length;
    }

    @Override
    public double findAverage(double[][] data) {
        double rowSum = 0;
        double numValues = 0;
        for (int row = 0; row < data.length; row++) {
            rowSum = findSum(data[row]) + rowSum;
            numValues = numValues + data[row].length;
        }
        return rowSum / numValues;
    }

    @Override
    public double findSum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
    }

    @Override
    public double findSum(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
    }

    @Override
    public double findSum(int[][] data) {
        double rowSum = 0;
        for (int row = 0; row < data.length; row++) {
            rowSum = findSum(data[row]) + rowSum;
        }
        return rowSum;
    }

    @Override
    public double findSum(double[][] data) {
        double rowSum = 0;
        for (int row = 0; row < data.length; row++) {
            rowSum = findSum(data[row]) + rowSum;
        }
        return rowSum;
    }



    @Override
    public void linearSearch(int[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void linearSearch(double[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void linearSearch(String[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void binarySearch(String[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

