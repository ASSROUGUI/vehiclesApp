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
public class vehicles {
    
     String FuelType;
    int WheelsNo;
    int RPM;
    int Torque;
    int HorsePower ;
    String Color;
    int seatsNo;
    String Maker;
    int YearMake;
    String name;
     String type;
     
     
      public void setname(String name,String type){
      this.name=name;
      this.type=type;
       System.out.print(" name of vehicle : ");
       System.out.print(name);
        System.out.print(" type of vehicle : ");
       System.out.print(type);
      }
    
   
   public vehicles(){  
       System.out.println(" Welcome of vehicles app");
   }

   
  
   public void setFuelType(String FuelType){
       
       if (FuelType.equals("Diesel")|| FuelType.equals("Petrol")|| FuelType.equals("Gas")||FuelType.equals("Electric") )
       
       { this.FuelType=FuelType;
          System.out.print(" Fuel Type : ");
                System.out.println(FuelType);}
       
   else{
           this.FuelType="Not Failed";
            System.out.println(" Fuel Type : Not Failed ");
   
   }
}
//          public void setvehicles(int WheelsNo,int RPM,int Torque,int HorsePower ,int seatsNo ,int YearMake ){
//       
//        if (WheelsNo<=0){
//         System.out.println("Number of Wheels cannot be zero or minus");}
//        else{ this.WheelsNo=WheelsNo;
//        System.out.print("Number of Wheels : ");
//                System.out.println(WheelsNo);}
//        
        
//         if (RPM<=0){
//          System.out.println("Number of Engine RPM  cannot be zero or minus");}
//        else{ this.RPM=RPM;
//             System.out.print("Number of Engine RPM  : ");
//                System.out.println(RPM);
//         }
//        
//         if (Torque<=0){
//          System.out.println("number of Torque cannot be zero or minus");}
//        else{ this.Torque=Torque;
//         System.out.print("Number of Torque  : ");
//                System.out.println(Torque);
//         }
        
//      if (HorsePower<=0){
//       System.out.println("Number of Horse Power cannot be zero or minus");}
//        else{ this.HorsePower=HorsePower* Torque/5252;
//      System.out.print("Number of Horse Power   : ");
//                System.out.println(HorsePower);}
      
//       if (seatsNo<=0){
//        System.out.println("Number of seats cannot be zero or minus");}
//        else{ this.seatsNo=seatsNo;
//          System.out.print("Number of seats   : ");
//                System.out.println(seatsNo);}
       
//        if (YearMake<=0){
//        System.out.println("Number of Make Year cannot be zero or minus");}
//        else{ this.YearMake=YearMake;
//         System.out.print(" Number of Make Year   : ");
//                System.out.println(YearMake);
//        }
      
//}
   
          
           public void setWheelsNo(int WheelsNo ){
       
        if (WheelsNo<=0){
         System.out.println("Number of Wheels cannot be zero or minus");}
        else{ this.WheelsNo=WheelsNo;
        System.out.print("Number of Wheels : ");
                System.out.println(WheelsNo);}}

             public void setRPM(int RPM ){
                  if (RPM<=0){
          System.out.println("Number of Engine RPM  cannot be zero or minus");}
        else{ this.RPM=RPM;
             System.out.print("Number of Engine RPM  : ");
                System.out.println(RPM);
         }};

  public void setTorque(int Torque ){
       
         if (Torque<=0){
          System.out.println("number of Torque cannot be zero or minus");}
        else{ this.Torque=Torque;
         System.out.print("Number of Torque  : ");
                System.out.println(Torque); }}
  
  
     public void setHorsePower(int HorsePower ){
   if (HorsePower<=0){
       System.out.println("Number of Horse Power cannot be zero or minus");}
        else{ this.HorsePower=HorsePower;
       int result= HorsePower* Torque/5252;
      System.out.print("Number of Horse Power   : ");
                System.out.println(result);}}

     
    public void setseatsNo(int seatsNo ){
  if (seatsNo<=0){
        System.out.println("Number of seats cannot be zero or minus");}
        else{ this.seatsNo=seatsNo;
          System.out.print("Number of seats   : ");
                System.out.println(seatsNo);}}

    public void setYearMake(int YearMake ){
           if (YearMake<=0){
        System.out.println("Number of Make Year cannot be zero or minus");}
        else{ this.YearMake=YearMake;
         System.out.print(" Number of Make Year   : ");
                System.out.println(YearMake);
        }}
    

     public void setColor(String Color){

     this.Color=Color;
      System.out.print(" Color : ");
                System.out.println(Color);
   }

   
      public void welcomeMsg(){
   System.out.println("  welcome to vehicles");}
    
}
