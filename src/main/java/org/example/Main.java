package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println(shouldWakeUp(true, 1));
        //System.out.println(shouldWakeUp(false, 2));
        //System.out.println(shouldWakeUp(true, 8));
        //System.out.println(shouldWakeUp(true, -1));
        //System.out.println(hasTeen(9,99,19));
        //System.out.println(hasTeen(23,15,42));
        //System.out.println(hasTeen(22,23,34));

        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println(area(width,height));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23 || !isBarking) {
            return false;
        }
        return clock >= 20 || clock < 8;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if (firstAge >= 13 && firstAge<=19 || secondAge>=13 && secondAge<=19 || thirdAge>=13 && thirdAge<=19 ) {
            return true;
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp){
        int lowestTemp = 25;
        int highestTemp = isSummer ? 45: 35;

        return temp < highestTemp && temp > lowestTemp;
    }

    public static double area(double width, double height){
        if(width<0 || height<0){
            System.out.println("width veya height sıfırdan küçük olamaz !! Width :" + width + "Height : " +height);
            return -1;
        }
        return width * height;
    }

    public static  double area(double radius){
        if(radius<0){
            System.out.println("radius cannot be less than zero !!! Radius :" + radius);
            return -1;

        }return Math.PI*Math.pow(radius,2);
    }
}



