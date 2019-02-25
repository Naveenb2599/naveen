import java.util.Scanner;
public class g9{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c[]=new int[a];
        for(int i=0;i<a;i++)
        {
            c[i]=s.nextInt();
        }
        int sum=0;
        for(int j=0;j<b;j++)
        {
            sum=sum+c[j];
        }
            System.out.print(sum);
}}
