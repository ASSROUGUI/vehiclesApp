/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author ashwag2s
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
//        vehicles vehicles1=new vehicles("car","hondai");
//        vehicles1.setFuelType("Diesel");
//        vehicles1.setvehicles(8,4,5,7,-1,8);
//        vehicles1.setColor("white");
   System.out.println("welcome to vehicles press 1: Cars 2:Motorcycle 3.Trucks"); 

   
    
         Scanner input = new Scanner(System.in);
       int  num = input.nextInt();
  
    car carObject = new car();
    Motorcycle MotorcycleObject = new Motorcycle();
    truck truckObject =new truck();
    


switch(num) {
 case 1:
   
    carObject.welcomeMsg();
    carObject.setname("classic car", "toyota");
    carObject.setFuelType("Gas");
    carObject.setColor("white");
    carObject.setseatsNo(4);
    carObject.WheelsNo(4);
    carObject.setYearMake(2012);
    carObject.setTorque(3);
    carObject.setRPM(6);
    carObject.setHorsePower(66);
        System.out.println("bye"); 
    break;
  case 2:
         
    MotorcycleObject.welcomeMsg();
    MotorcycleObject.setname("superMotorcycle", "toyota");
    MotorcycleObject.setFuelType("water");
    MotorcycleObject.setColor("red");
    MotorcycleObject.WheelsNo(2);
    MotorcycleObject.setseatsNo(2);
    MotorcycleObject.setYearMake(2019);
    MotorcycleObject.setTorque(999);
    MotorcycleObject.setRPM(2);
    MotorcycleObject.setHorsePower(106);
        System.out.println("bye"); 
  
    break;
     case 3:
         
    truckObject.welcomeMsg();
    truckObject.setname("super Truck", "hondai");
    truckObject.setFuelType("Diesel");
    truckObject.setColor("black");
    truckObject.setseatsNo(2);
    truckObject.WheelsNo(4);
    truckObject.setYearMake(2016);
    truckObject.setTorque(0);
    truckObject.setRPM(-6);
    truckObject.setHorsePower(218);
    truckObject.setLoadWeight(999);
        System.out.println("bye"); 
  
    break;
  default:
      System.out.println("Not Failed number");
}

   



    
    }  
}
