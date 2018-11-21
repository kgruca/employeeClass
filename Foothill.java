public class Foothill
{
   public static void main(String[] args)
   {
      //declaring and instantiating reference to Employee
      Employee kgruca = new Employee();
      
      //set data
      kgruca.setFirstName("");
      kgruca.setLastName("Gruca");
      kgruca.setEmpID(123456);
      kgruca.setEmpSlry(9000000);
      
      //get data
      System.out.println("The employee's first name is: " + kgruca.getFirstName());
      System.out.println("The employee's last name is: " + kgruca.getLastName());
      System.out.println("The employee's Employee ID is: " + kgruca.getEmpID());
      System.out.println("The employee's yearly Salary is: $" + kgruca.getEmpSalary());
   }
}
   
class Employee
{
   
   //member data
   private String firstName;
   private String lastName;
   private int employeeID;
   private int salary;
   
   //static constants
   public static final String DEFAULT_FIRST_NAME = "undefined";
   public static final String DEFAULT_LAST_NAME = "undefined";
   public static final int DEFAULT_EMP_ID = 0;
   public static final int DEFAULT_SALARY = 0;
   
   //default constructor
   Employee()
   {
      firstName = DEFAULT_FIRST_NAME;
      lastName = DEFAULT_LAST_NAME;
      employeeID = DEFAULT_EMP_ID;
      salary = DEFAULT_SALARY;
   }
   
   //6-parameter constructor
   Employee(String empFirstName, String empLastName, int empID, int empSlry)
   {
      if( !setFirstName(empFirstName) )
         firstName = DEFAULT_FIRST_NAME;
      
      if( !setLastName(empLastName) )
         lastName = DEFAULT_LAST_NAME;
      else
         lastName = empLastName;
      
      if( !setEmpID(empID) )
         employeeID = DEFAULT_EMP_ID;
      else
         employeeID = empID;
      
      if( !setEmpSlry(empSlry) )
         salary = DEFAULT_SALARY;
      else
         salary = empSlry;
      
   }
   
   //set methods
   public boolean setFirstName(String theFirstName)
   {
      if (theFirstName.isEmpty() || theFirstName == null)
         return false;
      firstName = theFirstName;
      return true;
   }
   
   public boolean setLastName(String theLastName)
   {
      if (theLastName.isEmpty() || theLastName == null)
         return false;
      lastName = theLastName;
      return true;
   }
   
   public boolean setEmpID(int theEmpID)
   {
      if (theEmpID <= 0 || theEmpID > 1000000000)
         return false;
      employeeID = theEmpID;
      return true;
   }
      
   public boolean setEmpSlry(int theEmpSlry)
   {
      if (theEmpSlry <= 0 || theEmpSlry > 10000000)
         return false;
      salary = theEmpSlry;
      return true;
   }
   
   //get methods
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public int getEmpID()
   {
      return employeeID;
   }
   
   public int getEmpSalary()
   {
      return salary;
   }
   
}


