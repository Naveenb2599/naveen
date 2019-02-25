import java.util.Scanner;
public class g6{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        boolean flag=false;
        if(a%400==0)
        {
            flag=true;
        }else if(a%100==0)
        {
            flag=false;
        }else if(a%4==0)
        {
            flag=true;
        }
        if(flag)
        {
            System.out.print("yes");
        }else
        {
            System.out.print("no");
        }
    }
}
