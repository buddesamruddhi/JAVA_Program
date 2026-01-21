import java.util.Scanner;

public class prime_no{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
System.out.print("enter the no");
int num = sc.nextInt();
boolean isprime = true;
if (num<=1)
{
isprime = false;
}
else{
 for(int i=2 ; i<=num/2; i++)
{
 if (num % i== 0)
{
 isprime = false;
break;
}
}
}
if (isprime)
{
System .out.println(num + "it is a prime no");
}
else{
System.out.println(num+ " it's a not prime no");
}
sc.close();
}
}



