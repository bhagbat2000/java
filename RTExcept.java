public class RTExcept
{
public static void throwit ()
{
System.out.println("throwit");
throw new RuntimeException();
}
public static void main(String [] args)
{
try
{
System.out.println("hello");
throwit();
}
catch (Exception re)
{
System.out.println("caught");
}
finally
{
System.out.println("finally");
}
System.out.println("after ");
}
}