package com.ExercisesSchool;

import java.util.ArrayList;

public class NShape {
    private ArrayList<Point> arrayList = new ArrayList<>();

    public NShape(){

    }

    public NShape(Point point){
        this.arrayList.add(point);
    }

    public NShape(ArrayList<Point> points){
        this.arrayList.addAll(points);
    }

    public void addPoint(Point point){
        this.arrayList.add(point);
    }

    public void addPoint(int x,int y){
        this.arrayList.add(new Point(x,y));
    }

    public void perimeter(){

    }

    public Point nearest(){
        double min = Integer.MAX_VALUE;
        Point nearest = null;
        for (Point point : arrayList) {
            if(point.getDistanceFromZero() < min){
                min = point.getDistanceFromZero();
                nearest = point;
            }
        }
        return nearest;
    }

    public double getMinDistance(){
        double min = Integer.MAX_VALUE;
        for (int i = 0;i < this.arrayList.size() - 2;i++){
            double minTemp = this.arrayList.get(i).getDistanceFromPoint(this.arrayList.get(i + 1));
            if(minTemp < min){
                min = minTemp;
            }
        }
        double minTemp = this.arrayList.get(this.arrayList.size()-1).getDistanceFromPoint(this.arrayList.get(0));
        if(minTemp < min){
            min = minTemp;
        }
        return min;
    }

    public double getMaxDistance(){
        double max = Integer.MIN_VALUE;
        for (int i = 0;i < this.arrayList.size() - 2;i++){
            double maxTemp = this.arrayList.get(i).getDistanceFromPoint(this.arrayList.get(i + 1));
            if(maxTemp > max){
                max = maxTemp;
            }
        }
        double maxTemp = this.arrayList.get(this.arrayList.size()-1).getDistanceFromPoint(this.arrayList.get(0));
        if(maxTemp > max){
            max = maxTemp;
        }
        return max;
    }
}
