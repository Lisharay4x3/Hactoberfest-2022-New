// Armstrong program
import java.util.Scanner;
class program1
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n,a,num,s=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        num=n;
        while(n>0)
        {
            a=n%10;
            s=s+a*a*a;
            n=n/10;
        }
        if(num==s)
        System.out.println("It is an armstrong number");
        else
        System.out.println("It is not an armstrong number");
        }
    }
    //Output
    //Enter a number
    //2
    //It is not an armstrong number