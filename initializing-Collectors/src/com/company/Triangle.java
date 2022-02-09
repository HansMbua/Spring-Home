package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Triangle {

    private List<Point> points;



    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }



    public void Draw(){
//        System.out.printf( "%n pointA = %d , pointB = %d pointC = %d %n",getPointA(),getPointB(),getPointC());

        for (Point point: points ){
            System.out.println("PontA = ("+point.getX()+", "+point.getY()+" )");
        }

        System.out.printf("%n Using Streams to display the result bellow %n");
        points.stream().forEach(point -> System.out.println("PontA = ("+point.getX()+", "+point.getY()+" )"));




    }



}
