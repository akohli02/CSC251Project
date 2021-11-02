import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Project_Aimy_Kohli

{ 
   public static void main(String args[]) throws IOException
   {
   //Variables
      //Objects
      File file = new File("Rooms2.txt");
      Scanner inputFile = new Scanner(file);
      ArrayList<Room> rooms = new ArrayList<Room>();
               
      String name; 
      double roomLength;
      double roomWidth;
      int shadeAmount;
      double coolingCapacity = 0;
      String manufacturer;
      String type;
      double acCoolingCapacity = 0;
                           
      while(inputFile.hasNext())
      {
       name = getRoomName(inputFile);
       roomLength = getRoomLength(inputFile);
       roomWidth = getRoomWidth(inputFile);
       shadeAmount = getShadeAmount(inputFile);
       
       inputFile.nextLine();
       
       manufacturer = getManufacturer(inputFile);
       type = getType(inputFile);
       acCoolingCapacity = getAcCoolingCapacity(inputFile);

       inputFile.nextLine();
      
       AirConditioner airConditioner = new AirConditioner(manufacturer, type, acCoolingCapacity);
       Room room = new Room(name,roomLength, roomWidth, shadeAmount,coolingCapacity, airConditioner);
       
       rooms.add(room);
       }     
       
      inputFile.close();
      
      
       for(Room room: rooms)
       {
       System.out.print(room);
       /**
       displayRoomName(room);
       displayRoomArea(room);
       displayRoomShade(room);
       displayBtuPerHour(room);   
       */
       } 
   }
   
   //Methods to get Room and AC info from file
      
      private static String getRoomName(Scanner inputFile){
         
         return inputFile.nextLine();
      }
      
      private static double getRoomLength(Scanner inputFile){
          
          return inputFile.nextDouble();  
      }
      
      private static double getRoomWidth(Scanner inputFile){
           
      return inputFile.nextDouble();
      }
      
      private static int getShadeAmount(Scanner inputFile){
        
      return inputFile.nextInt();
      }
      
      private static String getManufacturer(Scanner inputFile){
           
      return inputFile.nextLine();
      }
      
      private static String getType(Scanner inputFile){
           
      return inputFile.nextLine();
      }
      
      private static double getAcCoolingCapacity(Scanner inputFile){
           
      return inputFile.nextDouble();
      }
      
      
      /**
      private static void displayRoomName(Room room){
          System.out.print("\nRoom Name: "
                           + room.getName());
      }
      
      private static void displayRoomArea(Room room){      
         System.out.print("\nRoom Area (in square feet): "
                           + room.calculateArea()); 
      
      }
      
      private static void displayRoomShade(Room room){
          System.out.print("\nAmount of Shade: " + room.caculateShadeBrightness());      
      }
      
      private static void displayBtuPerHour(Room room){
         System.out.printf("\nBTUs Per Hour needed: %.2f", room.calculateCoolingCapacity());                    
       }
       */
          
}