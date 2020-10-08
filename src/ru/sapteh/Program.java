package ru.sapteh;

public class Program {
    public static void main(String[] args) {
        int[][] arr1 = new int[6][7];
        array(arr1);
        seatArr(arr1);
    }

    public static void array(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += Math.random() * 10;
            }
        }
        int max= 0;
        for (int i =arr.length-1; i >=0 ; i--) {
            for (int j = 0; j < 7; j++) {
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            arr[i][0]=max;
        }
    }

    public static void seatArr(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
