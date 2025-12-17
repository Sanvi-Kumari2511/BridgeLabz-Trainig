//Finding volume of Earth
public class VolumeOfEarth
{
 public static void  main(String args [])
   {

    // Taking input details
    double radiusInKilometers = 6378.0;
    double radiusInMiles = radiusInKilometers/1.6;

    // Calculating volume of the Earth 
    double volumeOfEarthInKilometers = (4.0/3.0)*Math.PI*radiusInKilometers;
    double volumeOfEarthInMiles = (4.0/3.0)*Math.PI*radiusInMiles;

    // Diplaying outputs
    System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarthInKilometers + " and cubic miles is " + volumeOfEarthInMiles );

   }
}