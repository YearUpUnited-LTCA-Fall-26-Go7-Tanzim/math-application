package com.pluralsight;

public class mathApp {
    public static void main(String[] args) {
        int bobSalary = 45000 ;
        int garySalary = 75000 ;
        int highestSalary = Math.max(bobSalary,garySalary) ;
        System.out.println("The highest salary is $" + highestSalary) ;


        int carPrice = 7500 ;
        int truckPrice = 12000 ;
        int cheapVehicle = Math.min(carPrice,truckPrice) ;
        System.out.println("The cheapest vehicle price is $" + cheapVehicle) ;

        double circleRad = 7.25 ;
        double circleDisplay = Math.PI * circleRad * circleRad ;
        System.out.println("The display area is: " + circleDisplay) ;

        double value = 5.0 ;
        double valueSqrt = Math.sqrt(value) ;
        System.out.println("The square root of " + value + " is " + valueSqrt);

        double x1 = 5, y1 = 10 ;
        double x2 = 85, y2 = 10 ;
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)) ;
        System.out.println("The distance between the two points is: " + distance) ;

        double valueB = -3.8 ;
        double absolute = Math.abs(-3.8) ;
        System.out.println("The absolute value is: " + absolute) ;

        int days = 24 ;
        int hourInDay = 24 ;
        int minsInHour = 60 ;
        int minsIn24Days = Math.multiplyExact(Math.multiplyExact(days, hourInDay), minsInHour);
        System.out.println("There are " + minsIn24Days + " minutes in 24 days") ;

        





    }
}
