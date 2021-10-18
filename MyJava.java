class MyJava{
public static void main(String[] args){

System.out.println("Only for practise");

evenOddNumber(15);
}
  
  public static void evenOddNumber(int num){
if(num%2==0)
    System.out.println("Number is Even");
else
   System.out.println("Number is Odd");
  }

public stattic void withoutModEvenOdd(int num){
int temp=num/2;
if(temp*2==num)
     System.out.println("Number is Even");
else
     System.out.println("Number is Odd");
}

}
