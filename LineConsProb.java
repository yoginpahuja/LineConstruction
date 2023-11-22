import java.text.DecimalFormat;
import java.util.*;
public class LineConsProb {
    public static double length(int x1,int x2,int y1,int y2)
    {
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
    public static void main (String[] args)
    {
        Scanner scanObj=new Scanner(System.in);
        scanObj.useDelimiter("[\\s,]+");
        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println("Please enter the coordinates of the first point (x1,y1)");
        int x1,y1;
        x1=scanObj.nextInt();
        y1=scanObj.nextInt();
        System.out.println("Please enter the coordinates of the second point (x2,y2)");
        int x2,y2;
        x2=scanObj.nextInt();
        y2=scanObj.nextInt();
        double len=length(x1,x2,y1,y2);
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("Length of the line is " + df.format(len));
    }
}
