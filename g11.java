import java.util.Scanner;
public class g11{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double a=s.nextInt();
        double b=s.nextInt();
        double c=Math.pow(a,b);
        int d=0;
        d=(int)Math.round(c);
            System.out.print(d);
}}
