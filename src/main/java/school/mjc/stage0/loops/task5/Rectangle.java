package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
for (int i=0;i<height;i++){
    for (int j=0;j<length;j++){
        if (i==0 || i==height-1 || j==0 || j==length) System.out.println(8); else System.out.println(" ");
    }
}
    }
}
