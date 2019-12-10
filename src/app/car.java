/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author ashwag2s
 */
public class car  extends vehicles {
   
    private String newestCar ="2020 Ford Mustang Shelby GT500";
//    public car(){
//          System.out.println(" Constructor of car");
//          
//    }
          public void setnewestCars(String cars)
          { this.newestCar=cars;}
          
          public String getnewestCars()
          {return newestCar;}

    
          public void welcomeMsg(){
   System.out.println("  welcome to Car");}
}
