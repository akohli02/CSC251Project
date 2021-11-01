public class AirConditioner
{
   //Fields
   
      private String manufacturer;
      private String type;
      private double coolingCapacity;
      
   /**
      Constructor
      @param manufacturer
      @param type
      @param coolingCapacity
      
   */
   
      public AirConditioner()
      {
      
      }
      
      public AirConditioner( String manufacturer, String type, double coolingCapacity)
      {
         this.manufacturer = manufacturer;
         this.type = type;
         this.coolingCapacity = coolingCapacity;
      }
      
   //Mutators
      public void setManufacturer( String manufacturer)
      {
         this.manufacturer = manufacturer;
      }
   
      public void setType(String type)
      {
         this.type = type;
      }
      
      public void setCoolingCapacity( double coolingCapacity)
      {
         this.coolingCapacity = coolingCapacity;
      }
      
      //Accessors
      public String getManufacturer()
      {
         return manufacturer;
      }
   
      public String getType()
      {
         return type;
      }
      
      public double getCoolingCapacity()
      {
         return coolingCapacity;
      }

      public String toString()
      {
         String str = "Air Conditioner Manufacturer: " + manufacturer
                       + "\nAir Conditioner Type: " + type
                       + "\nAir Conditioner Cooling Capacity (BTUs Per Hour): " + coolingCapacity;
         return str;
      }
}