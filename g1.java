import java.util.Scanner;
public class g1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>0)
        {
            System.out.print("Positive");
        }
        else if(a<0)
        {
            System.out.print("Negative");
        }else
        {
            System.out.print("Zero");
        }
    }
}
