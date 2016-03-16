package general;
import java.util.ArrayList;
import hr.*;
import java.util.Scanner;
/**
 *
 * @author Tony
 */
public class Main 
{
    public static void main(String[] args)
    {
        //util variables for system input
        boolean keepGoing=true;
        Scanner read=new Scanner(System.in);
        Scanner empRead =new Scanner(System.in);
        
        int input;
        
        ArrayList<Employee>empList=new ArrayList<>();
        CommissionSalesEmployee comEmp;
        
        System.out.println("Welcome to Javarus");
        
        //menu driven do while loop
        do
        {
           MenuClass.mainMessage();
           
           input=read.nextInt();
           if(input==1)//work with employee options
           {
               //local variables for Employee
               int empInput;
               boolean empKeepGoing=true;
               do
               {
                //display emp Message
                MenuClass.empMessage(); 
                
                //read inut
                empInput=read.nextInt();
                if(empInput==1)//new emp
                {
                    //temp vairables for emp 
                    Scanner empread=new Scanner(System.in);
                    String firstName,lastName,position;
                    int age,year,month,day;
                    double commissionRate,grossSales;
                    
                    //Ask for user input
                    System.out.println();
                    System.out.println("Enter Fist name:");
                    firstName=empread.nextLine();
                    System.out.println("Enter Last name:");
                    lastName=empread.nextLine();
                    System.out.println("Enter position:");
                    position=empread.nextLine();
                    System.out.println("Enter age:");
                    age=empread.nextInt();
                    System.out.println("Enter hire year:");
                    year=empread.nextInt();
                    System.out.println("Enter hire month:");
                    month=empread.nextInt();
                    System.out.println("Enter hire day:");
                    day=empread.nextInt();
                    System.out.println("Enter Commision Rate:");
                    commissionRate=empread.nextDouble();
                    
                    
                    comEmp=new CommissionSalesEmployee(firstName,lastName,age,position,year,month,day,commissionRate,0.0);
                    empList.add(comEmp);
                    System.out.println("Employee created");
                    
                }else if(empInput==2)//existing emp
                {
                    
                }else if (empInput==0)//exit
                {
                    //change the flag to false
                    empKeepGoing=false;
                    
                }else//invalid input
                {
                    MenuClass.errMessage();
                    empKeepGoing=true;
                }
               }while(empKeepGoing);//end of
           }else if(input==2)//work with product options
           {
               
           }else if(input==0)//exit loop
           {
               //change the flag to false
               keepGoing=false;
           }else//invalid input
           {
               MenuClass.errMessage();
               keepGoing=true;
           }
        }
        while(keepGoing);//end of loop
    }//end of main   
}//end of class
