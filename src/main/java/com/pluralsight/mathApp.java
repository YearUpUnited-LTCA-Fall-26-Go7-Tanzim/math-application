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
        

    }
}
