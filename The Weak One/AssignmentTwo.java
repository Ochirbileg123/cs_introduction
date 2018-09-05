
/**
 * Write a description of class AssignmentTwo here.
 *
 * @author (Antosh)
 * @version (Wednesday Week-1)
 */
public class AssignmentTwo
{
  public void exerciseOne(String yourName)
  {
      System.out.println("Hello");
      System.out.println(yourName);
  }
  
  public int exerciseTwo(int a, int b)
  {
      return a - b;
  }
  
  public void exerciseThree(int a, int b)
  {
      System.out.println(a / b);
  }
  
  public void exerciseFour(String yourName)
  {
    for (int i = 0; i < 15; i++)
    {
      System.out.println(yourName);
    }
  }
  
  public void exerciseFive(int age)
  {
      int myAge = 15;
      if (age > myAge)
      {
          System.out.println("I'm not too old, GOSSSH");
      }
      else if(age < myAge)
      {
          System.out.println("I'm not too young, REAAAA");
      }
      else
      {
          System.out.println("Yay,You have succesfully found out my age");
      }
   }
}
