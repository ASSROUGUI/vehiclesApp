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
//   System.out.println("welcome to vehicles press to show 1-Cars 2-Motorcycle 3-Trucks 4-to buy a vehicle"); 

   
    
         Scanner input = new Scanner(System.in);

         Scanner vehiclesType = new Scanner(System.in);
  
    car carObject = new car();
    Motorcycle MotorcycleObject = new Motorcycle();
    truck truckObject =new truck();
    
  


 	   System.out.println("press how many type of vehicles do you want"); 
            int  vehiclesNum = input.nextInt();
 String[] vehiclesArray =new String[vehiclesNum];     
int i;
System.out.println("Please enter  name of vehicles: car or/and motorcycle or/and truck  ");              
 for ( i = 0; i < vehiclesArray.length; i++) {
             System.out.print(i+1 +"-" );
        vehiclesArray[i] = vehiclesType.nextLine();
                      
 }
 
 
String car ="car";
System.out.println("\n  vehicles you wanted are : ");
		for (i = 0; i < vehiclesArray.length; i++)
                {System.out.print(i+1 +"-" + vehiclesArray[i] + "\t");

                
                
                

                
switch( vehiclesArray[i]) {
 case "car":
   
    carObject.welcomeMsg();
    System.out.println("newest car is : "+carObject.getnewestCars()); 
     System.out.println("Enter name of the car"); 
       carObject.name = vehiclesType.nextLine();
           System.out.println("\n Enter type of the car"); 
       carObject.type=vehiclesType.nextLine();
    carObject.setname(carObject.name, carObject.type);
     System.out.println("\n Enter the Fuel Type "); 
    carObject.FuelType=vehiclesType.nextLine();
    carObject.setFuelType( carObject.FuelType);
    carObject.setColor("white");
    carObject.setseatsNo(4);
    carObject.setWheelsNo(4);
    carObject.setYearMake(2012);
   System.out.println("Enter number of  Torque"); 
    carObject.Torque = input.nextInt();
    carObject.setTorque(carObject.Torque);
    carObject.setRPM(6);
    carObject.setHorsePower(66);
        System.out.println("bye"); 
    break;
  case "motorcycle":
         
    MotorcycleObject.welcomeMsg();
    System.out.println("Enter name of the Motorcycle"); 
       MotorcycleObject.name = vehiclesType.nextLine();
           System.out.println("\n Enter type of the Motorcycle"); 
       MotorcycleObject.type=vehiclesType.nextLine();
    MotorcycleObject.setname(MotorcycleObject.name, MotorcycleObject.type);
     System.out.println("\n Enter the Fuel Type "); 
    MotorcycleObject.FuelType=vehiclesType.nextLine();
    MotorcycleObject.setFuelType( MotorcycleObject.FuelType);
    MotorcycleObject.setColor("red");
    MotorcycleObject.setWheelsNo(2);
    MotorcycleObject.setseatsNo(2);
    MotorcycleObject.setYearMake(2019);
       System.out.println("Enter number of Torque "); 
    MotorcycleObject.Torque=input.nextInt();
    MotorcycleObject.setTorque(MotorcycleObject.Torque);
    MotorcycleObject.setRPM(2);
    MotorcycleObject.setHorsePower(106);
        System.out.println("bye"); 
  
    break;
     case "truck":
         
    truckObject.welcomeMsg();
      System.out.println("Enter name of the truck"); 
       truckObject.name = vehiclesType.nextLine();
           System.out.println("Enter type of the truck"); 
       truckObject.type=vehiclesType.nextLine();
    truckObject.setname( truckObject.name, truckObject.type);
     System.out.println("\n Enter the Fuel Type "); 
       truckObject.FuelType=vehiclesType.nextLine();
    truckObject.setFuelType(truckObject.FuelType);
        System.out.println("Enter the color "); 
       truckObject.Color=vehiclesType.nextLine();
    truckObject.setColor( truckObject.Color);
    System.out.println("Enter Number of seats Number"); 
       truckObject.seatsNo = input.nextInt();
    truckObject.setseatsNo(truckObject.seatsNo);
     System.out.println("Enter Number of Wheels Number"); 
       truckObject.WheelsNo = input.nextInt();
    truckObject.setWheelsNo(truckObject.WheelsNo);
    System.out.println("Enter Year Made it in"); 
       truckObject.YearMake = input.nextInt();
    truckObject.setYearMake(truckObject.YearMake);
       System.out.println("Enter Number of Torque"); 
       truckObject.Torque = input.nextInt();
    truckObject.setTorque(truckObject.Torque);
    System.out.println("Enter Number of Engine RPM "); 
       truckObject.RPM = input.nextInt();
    truckObject.setRPM(truckObject.RPM);
    System.out.println("Enter Number of HorsePower "); 
       truckObject.HorsePower = input.nextInt();
    truckObject.setHorsePower(truckObject.HorsePower);
      System.out.println("Enter Load Weight"); 
       truckObject.LoadWeight = input.nextInt();
    truckObject.setLoadWeight(truckObject.LoadWeight);
        System.out.println("bye"); 
  
    break;
    
   
       
  default:
      System.out.println("Not Failed number ..try again with these names : car or/and motorcycle or/and truck");
}

   
                
    }
    }           
}


