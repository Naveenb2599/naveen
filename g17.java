import java.util.Scanner;
class g17{  
  public static void main(String[] args){
      Scanner s=new Scanner(System.in);
    int c=0,a,z;  
    int n=s.nextInt();
    z=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(z==c)  
    System.out.println("yes");   
    else  
 System.out.println("No");   
   }  
}
