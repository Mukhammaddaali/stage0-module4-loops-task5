package school.mjc.stage0.loops.task5;

import java.util.Scanner;

public class Square {
    public void printSquareFrom8s(int sideLength){
    for (int i=0;i<sideLength;i++){
        for (int j=0;j<sideLength;j++){
           if (i==0 || i==sideLength-1 || j==0 || j==sideLength) System.out.print(8);else System.out.println(" ");
        }
    }
    }
    public void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        printSquareFrom8s(x);
    }
}
