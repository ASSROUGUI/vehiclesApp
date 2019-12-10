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
public class truck extends vehicles {
   
  public  int LoadWeight;
      void setLoadWeight(int LoadWeight ){
       
        if (LoadWeight>=600){
         System.out.println("Load Weight is not accepted becacause it is over wight >600 ");}
        else{ this.LoadWeight=LoadWeight;
        System.out.print("Load Weight is accepted : ");
                System.out.println(LoadWeight);}}

      
            public void welcomeMsg(){
   System.out.println("  welcome to Trucks");}

}
