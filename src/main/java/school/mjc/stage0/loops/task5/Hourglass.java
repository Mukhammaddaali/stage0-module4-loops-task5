package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i=0;i<height;i++){
            for (int j=0;j<height;j++){
                if (i<=j && height-1>=j+i||i>=j && height-1<=j+i) System.out.print(8);else System.out.println(" ");
            }
            System.out.println();
        }

    }
}
