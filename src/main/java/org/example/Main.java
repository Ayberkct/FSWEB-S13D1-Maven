package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println(shouldWakeUp(true, 1));
        //System.out.println(shouldWakeUp(false, 2));
        //System.out.println(shouldWakeUp(true, 8));
        //System.out.println(shouldWakeUp(true, -1));
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
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
}



