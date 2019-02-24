import java.util.Scanner;
public class g2{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a<0)
        {
            System.out.print("invalid");
        }else if(a%2!=0)
        {
            System.out.print("Odd");
        }else if(a%2==0)
        {
            System.out.print("Even");
        }
    }
}
