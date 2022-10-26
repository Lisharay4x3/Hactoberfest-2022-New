import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        int n,p,s=0,d;
        System.out.println("Enter a number");
        n=in.nextInt();
        p=n*n;
        do
        {
            d=p%10;
            s=s+d;
            p=p/10;
            }
            while(p!=0);
            if(s==n)
            System.out.println("It is neon number");
            else
            System.out.println("It is not neon number");
        }
    }
    //Enter a number
    //3
    //It is not neon number
