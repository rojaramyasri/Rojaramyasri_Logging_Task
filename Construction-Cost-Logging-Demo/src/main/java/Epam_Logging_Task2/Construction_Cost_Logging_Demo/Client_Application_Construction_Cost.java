package Epam_Logging_Task2.Construction_Cost_Logging_Demo;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Client_Application_Construction_Cost 
{
	private static final Logger LOGGER=LogManager.getLogger(Client_Application_Construction_Cost.class);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		      Scanner scan=new Scanner(System.in);
		      String standarad_materials;
		      double total_area_of_house;
		      boolean automated_house;
		      LOGGER.info("Enter the details for the following:\n 1.Standarad of Materials 2.Total area of house (in square feet only) 3.Automated house(True or False)");
		      standarad_materials=scan.nextLine();
		      total_area_of_house=scan.nextDouble();
		      automated_house=scan.nextBoolean();
		      Construction_Cost object=new Construction_Cost();
		      double total_construction_cost=object.construction_total_cost(standarad_materials,total_area_of_house,automated_house);
		      LOGGER.info("Total Construction Cost is:"+total_construction_cost);
		      scan.close();
	}

}
