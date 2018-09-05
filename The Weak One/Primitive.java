
/**
 * Write a description of class Primitive here.
 *
 * @author (Antosh)
 * @version (a version number or a date)
 */
public class Primitive
{
  
    int myNumber = 1;
    double myDoubleNumber = 2.6;
    float myFloatNumber = 3.4f;
    boolean isTrueOrFalse = false;
    char myChar = 'a';
    String myString = "Hello World";
    long myLongNumber = 1123233232;
    short myShortNumber = 123;
    
    public int addTwoNumbers (int a, int b)
    
    {
        return a+b;
    }
    
    public float addTwoNumbers (float a, float b)
    
    {
        return a + b;
    }
    
    public String giveMeString (int x)
    
    {
        if (x > 100)
        {
            return "too High";
        }
        else if (50 <= x && x <= 100)
        {
            return "in Between";
        }
        else
        {
            return "too Low";
        }
    }
    
    public int sumOfNumber (int x)
    {
        int sum = 0;
        for (int i = 1; i <= x; i++)
        {
            sum = sum + 1;
        }
        return sum;
    }
    
    public int sumOfNumberWithWhile(int x)
    {
        int sum = 0;
        int i = 1;
        while(i < x)
        {
            sum = sum + 1;
            i = i + 1;
        }
        return sum;
    }
    
    private void printMyNameOut(String yourName)
    {
        System.out.println("My Name Is : " + yourName);
    }
    
    protected void anotherPrint(String name)
    {
        printMyNameOut(name);
    }
}   
