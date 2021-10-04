//POJO
public class Room
{
   //fields
      private String name; //room name
      private double roomLength;
      private double roomWidth;
      private int shadeAmount;
      private double coolingCapacity;
      
   //No arg constructor
      public Room ()
      {
         
      }
      
   /**
   Constructor that accepts arguments
   @param nam The room name
   @param roLength The room length
   @param roWidth The room width
   @param shaAmount The amount of shade
   @param coolCap The cooling capacity
   */
      
      public Room (String nam, double roLength, double roWidth, int shaAmount, double coolCap)
      {
         name = nam;
         roomLength = roLength;
         roomWidth = roWidth;
         shadeAmount = shaAmount;
         coolingCapacity = coolCap;
      }
      
   //Mutator/ Setter methods for fields
      //@param nam The name
      public void setName (String nam)
      {
         name = nam;
      }
      
      //@param roLength The room length
      public void setRoomLength( double roLength)
      {
         roomLength = roLength;
      }
      
      //@param roWidth The room width
      public void setRoomWidth( double roWidth)
      {
         roomWidth = roWidth;
      }
      
      //@param shaAmount The shade amount
      public void setShadeAmount( int shaAmount)
      {
         shadeAmount = shaAmount;
      }
      
      //@param coolCap The cooling capacity
      public void setCoolingCapacity( double coolCap)
      {
         coolingCapacity = coolCap;
      }
                  
   //Accessor/ Getter methods
      //@return The name of the bedroom
      public String getName()
      {
         return name;
      }
      
      //@return The length of the bedroom
      public double getRoomLength()
      {
          return roomLength;
      }
      
      //@return The width of the bedroom
      public double getRoomWidth()
      {
         return roomWidth;
      }
      
      //@return The shade amount of the bedroom
      public int getShadeAmount()
      {
          return shadeAmount;
      }
      
      //@return The cooling capacity
      public double getCoolingCapacity()
      {
         return coolingCapacity;
      }
      
      //@return The area of the bedroom which is the product of the roomWidth * roomLength
      public double calculateArea() //No arg method for area
      {
         return roomLength * roomWidth;
      }
      
      //@return null
       public String caculateShadeBrightness(){
         switch(getShadeAmount()){
               case 1: return "Little";
               case 2: return "Moderate";
               case 3: return "Abundant";
         } 
         
         return null;
      }

      //@return The final cooling capacity  
      public double calculateCoolingCapacity(){
      
         double coolingCapacity = 0;
         double area = calculateArea();

         if ( area < 250){
             coolingCapacity = 5500;
         }
         else if (area >= 250 && area <= 500){
            coolingCapacity = 10000;
         }
          else if (area > 500 && area < 1000){
            coolingCapacity = 17500;
         }
         else if (area >= 1000){
            coolingCapacity = 24000;
         }

      
      
      if(getShadeAmount() == 1){
         return coolingCapacity * 1.15;
      } else if (getShadeAmount() == 3){
         return coolingCapacity * .90;
      } else{
         return coolingCapacity;
      }
  

   }

                                  
}