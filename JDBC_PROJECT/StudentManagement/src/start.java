import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Student.Manage.Student;
import com.Student.Manage.StudentDao;

public class start 
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome Student Management Application"); 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Display Student");
			System.out.println("Press 4 to Upate Student Data");
			System.out.println("Press 5 to Exit Student");
			System.out.println("\nEnter your Choice: ");
			int c=Integer.parseInt(br.readLine());
			
			
			if(c==1)
			{
				//add new student into list
	
				System.out.println("Enter your name:  ");
				String name=br.readLine();
				
				System.out.println("Enter user phone: ");
				String phone=br.readLine();
				
				System.out.println("Enter user city: ");
				String city=br.readLine();
				
				//create student obj to store student
				
				
				Student st=new Student(name,phone,city);
				boolean ans=StudentDao.insertStudentToDB(st);
				
				if(ans)
				{
					System.out.println("Record added Sucessfully...");
				}
				else
				{
					System.out.println("Something went Wrong please try again...");
				}
				
				System.out.println(st);
			}
			else if(c==2)
			{
				//delete student into list
				System.out.println("Enter student id to delete ");
				int userId=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				if(f)
				{
					System.out.println(" Record Deleted..");
				}
				else
				{
					System.out.println("something went wrong...");
				}
			}
			else if(c==3)
			{
				//display all students
				System.out.println("Display all Records..");
				StudentDao.DisplayStudent();
			}
			else if(c==4)
			{
				System.out.println("Enter new Name: ");
				String Name=br.readLine();
				System.out.println("Enter student id:");
				int Id=Integer.parseInt(br.readLine());
				//Update Student Record
				boolean f=StudentDao.UpdateRecord(Name,Id);
				
				if(f)
				{
					System.out.println("Record Update");
				}
				
				else
				{
					System.out.println("something went Wrong....");
				}
			}
			else
			{
				break;
			}
			
		}
		System.out.println("Thank you for using my application");
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
	}

}
