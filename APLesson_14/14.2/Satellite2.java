import java.util.ArrayList;
public class Satellite2
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();

	   double[] honLoc = {5, 6};
       locate.add(new Honda2(honLoc));
       locate.add(new Toyota2("8, 9"));
       locate.add(new GMC2(3, 8));

       double[] home = {0, 0};


       String printout = "\n\n" +
               "==========================";


       for (Location l : locate)
       {
		   double xmove = Math.round((1+ (Math.random()*100))*100.00)/100.00;
		   double ymove = Math.round((1+ (Math.random()*100))*100.00)/100.00;
		   printout += "\nAfter " + l.getID() + " Moved (" + getLocation(l.getLoc()) + ")";
           (l).move(xmove, 2*ymove);
		   printout += "\nNew Location: (" + getLocation(l.getLoc()) + ")\n\n";
       }


       printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


       for (Location l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home) + ")";
       }


       System.out.println(printout);
   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt("%.2f"(Math.pow(car[0] - home[0], 2)+ Math.pow(car[0] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return String.format(("%.2f, %.2f") loc[0] , loc[1]);
   }
}