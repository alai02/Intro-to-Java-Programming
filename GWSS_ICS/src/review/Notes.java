/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

/**
 *
 * @author User
 */
public class reviewpt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // String[][] copyData = new String[20][30];
        String[][] array = new String[30][20];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = "*";
            }
        }
        for (int row = 1; row < array.length; row = row + 2) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = "+";

            }

        }
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (row == 0 || row == array.length - 1
                        || col == 0 || col == array[row].length - 1) {
                    array[row][col] = "8";
                }
            }
        }
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (row == col || row + col == array[row].length - 1) {
                    array[row][col] = "x";
                }

            }
        }

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col--) {
                if ("x".equals(array[row][col])) {
                    swap(array, row, col, array.length - 1 - row, col);
                }

            }
        }
        
 //       String[][] copyData = new String[30][20];
 //       copyData = copyArray(array);
 //       display(copyData);
        display(array);

    }

    public static void display(String[][] array) {

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + "");
            }
            System.out.println();
        }
    }

    public static String[][] copyArray(String[][] array) {
        String copyData[][] = new String[array.length][];
        for (int i = 0; i < array.length; i++) {
            String copyRow[] = new String[array[i].length];
            for (int j = 0; j < array.length; j++) {
                copyRow[j] = (String) array[i][j];
            }
            copyData[i] = copyRow;
        }
        return copyData;
    }

    public static void swap(String[][] data, int rowI, int colI, int rowJ, int colJ) {
        String tmp;
        tmp = data[rowI][colI];
        data[rowI][colI] = data[rowJ][colJ];
        data[rowJ][colJ] = tmp;
    }
}


