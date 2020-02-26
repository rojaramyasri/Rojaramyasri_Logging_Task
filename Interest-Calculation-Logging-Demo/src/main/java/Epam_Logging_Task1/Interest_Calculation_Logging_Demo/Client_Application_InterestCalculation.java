package Epam_Logging_Task1.Interest_Calculation_Logging_Demo;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Client_Application_InterestCalculation extends SimpleandCompoundInterest
	{
	private static final Logger LOGGER=LogManager.getLogger(Client_Application_InterestCalculation.class);
	public static void main(String[] args) 
		{	
	        Scanner sc=new Scanner(System.in);
	        LOGGER.info("Enter Your Choice 1.Simple interest 2.Compound Interest");
	        int choice=sc.nextInt();
	        if(choice==1)
	        {
	        	SimpleandCompoundInterest object=new SimpleandCompoundInterest();
	        	int principle_amount,time;
	        	double rate_of_interest;
	        	LOGGER.info("Enter Principle Amount, Time( in months), and Rate of Interest");
	        	principle_amount=sc.nextInt();
	        	time=sc.nextInt();
	        	rate_of_interest=sc.nextDouble();
	        	double simple_interest=object.SimpleInterest(principle_amount,time,rate_of_interest);
	        	LOGGER.info("Simple Interest is: "+simple_interest);
	        }
	        else if(choice==2)
	        {
	        	SimpleandCompoundInterest object=new SimpleandCompoundInterest();
	        	int principle_amount,time,no_of_compounding_periods;
	        	double rate_of_interest;
	        	LOGGER.info("Enter Principle Amount, Time( in months), and Rate of Interest,Number of Compounding periods");
	        	principle_amount=sc.nextInt();
	        	time=sc.nextInt();
	        	rate_of_interest=sc.nextDouble();
	        	no_of_compounding_periods=sc.nextInt();
	        	double compound_interest=object.CompoundInterest(principle_amount,time,rate_of_interest,no_of_compounding_periods);
	        	LOGGER.info("Compound Interest is: "+compound_interest);
	        }
	        else
	        	LOGGER.info("Sorry! You have entered wrong/invalid option");
	     sc.close();   
		}

	}
