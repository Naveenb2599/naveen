import java.util.Scanner;
public class g14{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==0||n==1)
        {
            System.out.print("no");
        }
        else
        {
        for(int i=2;i<=n/2;++i)
        {
            if(n%i==0)
            {
                System.out.print("no");
                break;
            }else
            {
                System.out.print("yes");
                break;
            }
        }}
}
