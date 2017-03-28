import java.util.ArrayList;
public class Satellite1
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();

	   double[] honLoc = {5, 6};
       locate.add(new Honda1(honLoc));
       locate.add(new Toyota1("8, 9"));
       locate.add(new GMC1(3, 8));

       double[] home = {0, 0};


       String printout = "\n\n" +
               "==========================" + "\nStarting locations...";


       for (Location l : locate)
       {
		   double xmove = Math.round((1+ (Math.random()*100))*100.00)/100.00;
		   double ymove = Math.round((1+ (Math.random()*100))*100.00)/100.00;
		   printout += "\nAfter " + l.getID() + " Moved (" + getLocation(l.getLoc()) + ")";
           ((Car)(l)).move(xmove, ymove);
		   printout += "\nNew Location: (" + getLocation(l.getLoc()) + ")\n\n";
       }


       printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


       for (Location l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)*100.00/100.00 + ")";
       }


       System.out.println(printout);
   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}