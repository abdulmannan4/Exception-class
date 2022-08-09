public class exception1
{
public void result(int age) throws ArithmeticException,NullPointerException
{
if(age<18)
{
throw new ArithmeticException("Not Eligible");
}
else
{
throw new NullPointerException("Eligible");
}
}
public static void main(String args[])
{
exception1 obj = new exception1();
try
{
obj.result(3);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}