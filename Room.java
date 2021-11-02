//POJO
public class Room
{
   //fields
      private String name; //room name
      private double roomLength;
      private double roomWidth;
      private int shadeAmount;
      private double coolingCapacity;
      private AirConditioner airConditioner;
      
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
      
      public Room (String nam, double roLength, double roWidth, int shaAmount, double coolCap, AirConditioner air)
      {
         name = nam;
         roomLength = roLength;
         roomWidth = roWidth;
         shadeAmount = shaAmount;
         coolingCapacity = coolCap;
         airConditioner = new AirConditioner(air);
      }
      
         //Mutator/ Setter methods for fields
      public void setName (String nam)
      {
         name = nam;
      }
      
      public void setRoomLength( double roLength)
      {
         roomLength = roLength;
      }
      
      public void setRoomWidth( double roWidth)
      {
         roomWidth = roWidth;
      }
      
      public void setShadeAmount( int shaAmount)
      {
         shadeAmount = shaAmount;
      }

      public void setCoolingCapacity( double coolCap)
      {
         coolingCapacity = coolCap;
      }
      
      public void setAirConditioner(AirConditioner air)
      {
         airConditioner = new AirConditioner(air);
      }

                  
   //Accessor/ Getter methods
      public String getName()
      {
         return name;
      }
      
      public double getRoomLength()
      {
          return roomLength;
      }
      
      public double getRoomWidth()
      {
         return roomWidth;
      }
      
      public int getShadeAmount()
      {
          return shadeAmount;
      }
      
      public double getCoolingCapacity()
      {
         return coolingCapacity;
      }
      
      public double calculateArea() //No arg method for area
      {
         return roomLength * roomWidth;
      }
      
      public AirConditioner getAirConditioner()
      {
         return new AirConditioner(airConditioner);
      }

      
       public String caculateShadeBrightness(){
         switch(getShadeAmount()){
               case 1: return "Little";
               case 2: return "Moderate";
               case 3: return "Abundant";
         } 
         
         return null;
      }

         
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
   
   public boolean hasCoolingCapacity()
   {
      boolean adequateCooling;
      
      if(coolingCapacity > airConditioner.getCoolingCapacity())
      {
         adequateCooling = true;
      }
      
      else
      {
         adequateCooling = false;
      }
      
      return adequateCooling;
   }
   
   public String toString()
   {
      String str = "\nRoom Name: " + getName() 
                   +"\nRoom Area (in square feet): " + calculateArea()
                   +"\nAmount of Shade: " + caculateShadeBrightness()
                   +"\nBTUs Per Hour needed: " + calculateCoolingCapacity()  
                   + airConditioner.toString();
                  
      return str;            

   }

                                  
}