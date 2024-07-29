import java.util.Scanner;
class PrimeNumber{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = s.nextInt();
int count = 2;
for(int i=2;i<=num/2;i++)
{
if(num%i==0)
{
count++;
}
}
if(count==2){
System.out.println(num + "is prime number");
}
else 
{
System.out.println(num +"is not prime number");
}
}
}