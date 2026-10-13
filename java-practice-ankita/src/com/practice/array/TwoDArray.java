package com.practice.array;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[2][4];

        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[0][3] = 40;

        arr[1][0] = 50;
        arr[1][1] = 60;
        arr[1][2] = 70;
        arr[1][3] = 80;

        System.out.println(arr[0][2]); 
        System.out.println(arr[1][3]);
        System.out.println("Rows: " + arr.length);
        
        for(int i=0;i<arr.length;i++) {
        	
        	for (int j = 0; j < arr[i].length; j++) {
        		
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
		
	}

}
