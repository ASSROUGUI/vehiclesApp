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
   

//         Scanner input = new Scanner(System.in);
//       int i = input.nextInt();
// 
//Scanner in = new Scanner(System.in);
//String name = in.nextLine();


truck truckObject =new truck();
    truckObject.welcomeMsg();
//    truckObject.setColor(name);
      truckObject.setColor("red");
     truckObject.setLoadWeight(999);
//    truckObject.setLoadWeight(i);
    truckObject.setFuelType("water");
   

    
    car carObject = new car();
    carObject.welcomeMsg();
    carObject.setname("car", "honda");
    carObject.setTorque(99);
    carObject.setHorsePower(88);
    
    Motorcycle MotorcycleObject = new Motorcycle();
    MotorcycleObject.welcomeMsg();
    MotorcycleObject.setFuelType("Gas");
    MotorcycleObject.setseatsNo(-5);

    
    }  
}
