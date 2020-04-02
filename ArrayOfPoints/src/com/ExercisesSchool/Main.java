package com.ExercisesSchool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(3,4));
        points.add(new Point(6,4));
        points.add(new Point(6,0));
        points.add(new Point(3,0));

        System.out.println(Point.getDistanceBetween(new Point(3,4),new Point(6,4)));
        System.out.println(Point.getDistanceBetween(new Point(6,4),new Point(6,0)));
        System.out.println(Point.getDistanceBetween(new Point(6,0),new Point(3,0)));
        System.out.println(Point.getDistanceBetween(new Point(3,0),new Point(3,4)));

        NShape shape = new NShape(points);
        System.out.println("Min: " +shape.getMinDistance() + " | Max: " + shape.getMaxDistance());
    }
}