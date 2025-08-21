public class EarthVolume {
    public static void main(String[]args){
        double radiusKm = 6378;
        double radiusMiles = radiusKm*0.621371;
        double volumeCubicKm = (4.0/3.0)*Math.PI*Math.pow(radiusKm,3);
        double volumeCubicMiles = (4.0/3.0)*Math.PI*Math.pow(radiusMiles,3);
        System.out.println("The volume of earth in cubic kilometers is "+volumeCubicKm+" and cubic miles is "+volumeCubicMiles);
    }
}
