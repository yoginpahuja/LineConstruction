import java.text.DecimalFormat;
import java.util.*;
public class LineConsProb {
    public static double length(int x1,int x2,int y1,int y2)
    {
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
    public static int equalityCheck(double len1,double len2)
    {
       if(len1>len2)
        return 1;
       else if (len1<len2)
        return 2;
       else 
        return 0;
    }
    public static void printLengths(double len,int lineNum)
    {
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("Length of the line " + lineNum + " is " + df.format(len));
    }
    public static void main (String[] args)
    {
        Scanner scanObj=new Scanner(System.in);
        scanObj.useDelimiter("[\\s,]+");
        System.out.println("Welcome to Line Comparison Computation Program");

        System.out.println("Please enter the coordinates of the first point of 1st Line (x1,y1)");
        int x1,y1;
        x1=scanObj.nextInt();
        y1=scanObj.nextInt();
        System.out.println("Please enter the coordinates of the second point of 1st Line (x2,y2)");
        int x2,y2;
        x2=scanObj.nextInt();
        y2=scanObj.nextInt();
        
        System.out.println("Please enter the coordinates of the first point of 2nd Line (x3,y3)");
        int x3,y3;
        x3=scanObj.nextInt();
        y3=scanObj.nextInt();
        System.out.println("Please enter the coordinates of the second point of 2nd Line (x4,y4)");
        int x4,y4;
        x4=scanObj.nextInt();
        y4=scanObj.nextInt();

        double len1=length(x1,x2,y1,y2);
        double len2=length(x3,x4,y3,y4);
   
        printLengths(len1,1);
        printLengths(len2,2);

       switch (equalityCheck(len1, len2)) {
        case 1:
            System.out.println("Line 1 is longer than Line 2");
            break;
        case 2:
            System.out.println("Line 2 is longer than Line 1");
            break;
        default:
            System.out.println("Both the Lines are equal");
            break;
       }
    }
}
