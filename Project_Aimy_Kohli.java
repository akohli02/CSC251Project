import java.util.Scanner;

public class Project_Aimy_Kohli

{ 
   public static void main(String args[])
   {
   //Variables
      //Objects
      Scanner keyboard = new Scanner(System.in);
               
      String name; //room name
      double roomLength;
      double roomWidth;
      int shadeAmount;
      double coolingCapacity = 0;
                           
       name = getRoomName(keyboard);
       roomLength = getRoomLength(keyboard);
       roomWidth = getRoomWidth(keyboard);
       shadeAmount = getShadeAmount(keyboard);
       
       Room room = new Room(name,roomLength, roomWidth, shadeAmount,coolingCapacity);
       
       displayRoomName(room);
       displayRoomArea(room);
       displayRoomShade(room);
       displayBtuPerHour(room);         
      }
      
      
      private static String getRoomName(Scanner keyboard){
         System.out.print("\nPlease enter the name of the room: ");
         return keyboard.nextLine();
      }
      
      private static double getRoomLength(Scanner keyboard){
          System.out.print("\nPlease enter the length of the room (in feet): ");
          return keyboard.nextDouble();  
      }
      
      private static double getRoomWidth(Scanner keyboard){
           System.out.print("\nPlease enter the width of the room (in feet): ");
      return keyboard.nextDouble();
      }
      
      private static int getShadeAmount(Scanner keyboard){
        System.out.print("\nWhat is the amount of shade that this room receives?\n"
                        + "\n\t1.Little Shade"
                        + "\n\t2.Moderate Shade"
                        + "\n\t3.Abundant Shade\n");

      System.out.print("\nPlease select from the options above: ");
      return keyboard.nextInt();
      }
      
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
          
}