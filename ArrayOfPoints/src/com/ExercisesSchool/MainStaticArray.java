package com.ExercisesSchool;

public class MainStaticArray {
    private static Point[] array = new Point[4];

    public static void Main(String[] args){
        array[0] = new Point(3,4);
        array[1] = new Point(6,4);
        array[2] = new Point(6,0);
        array[3] = new Point(3,3);

        System.out.println(perimeter());
    }

    public static double perimeter(){
        double sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sum += array[i].getDistanceFromPoint(array[i+1]);
        }
        sum += array[array.length-1].getDistanceFromPoint(array[0]);
        return sum;
    }
}