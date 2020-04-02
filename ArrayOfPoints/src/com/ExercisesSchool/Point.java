package com.ExercisesSchool;

public class Point {
    //data
    private double x;
    private double y;

    //cons
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistanceFromZero(){
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
    }

    public double getDistanceFromPoint(Point point){
        return Math.sqrt(Math.pow(point.getX() - this.x,2) + Math.pow(point.getY() - this.y,2));
    }

    public static double getDistanceBetween(Point point1,Point point2){
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(),2) + Math.pow(point2.getY() - point1.getY(),2));
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
