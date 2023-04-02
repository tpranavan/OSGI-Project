package waffles_subcriber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import waffles_publisher.Waffles_PublisherInterface;
import waffles_subcriber.Waffles_Subscriber;

public class SubmethodSubscriber {
	public static  List<Object> stringlist=new ArrayList<Object>();
	public static  List<Object> TotalInvoicelist=new ArrayList<Object>();
	public static float TotalPrice=0;
	
	public static void milkshake_producer(Waffles_PublisherInterface milkshake) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("\nSelect the type of Waffle Type\n1. Vegan waffles   2. flemish waffles");
	    System.out.printf("\nEnter the number : ");
	    int milkshakeType = myObj.nextInt();  
	    
	    if(milkshakeType == 1) {
	    System.out.println("\nThe price of the  according to the type");
	    
		
		Scanner scan=new Scanner(System.in);
		Waffles_Subscriber u1 = new Waffles_Subscriber();
		milkshake.ListCakes_1();
		
		String user_option="yes";
		int total=0;
		
		do {

			System.out.println("\nSelect the type of Item\n1. BrusselsWaffle  2. LiegeWaffle  3. AmericanWaffle  4. PotatoWaffle");
			System.out.printf("\nEnter the number : ");
			int size=scan.nextInt();
			
			if(size == 1) {
				System.out.println("/nYour selection for  LiegeWaffle item is successful ");				
			
				System.out.println("Current Bill: "+milkshake.items_1(size));
				total+=milkshake.items_1(size);
				
				u1.setPayment(milkshake.BrusselsWaffle);
				
				stringlist.add(u1.getPayment());
				
				TotalPrice += milkshake.items_1(size);
			}
			else if(size == 2) {
				System.out.println("\nYour selection for LiegeWaffle item is successful ");				
			
				System.out.println("Current Bill: "+milkshake.items_1(size));
				total+=milkshake.items_1(size);
				
				u1.setPayment(milkshake.LiegeWaffle);
				
				stringlist.add(u1.getPayment());
				
				TotalPrice += milkshake.items_1(size);
			}			
			else if(size == 3) {
				System.out.println("\nYour selection for AmericanWaffle item is successful ");				
				
				System.out.println("Current Bill: "+milkshake.items_1(size));
				total+=milkshake.items_1(size);
				
				u1.setPayment(milkshake.AmericanWaffle);
				
				stringlist.add(u1.getPayment());
				
				TotalPrice += milkshake.items_1(size);
			}
			else if(size == 4) {
				System.out.println("\nYour selection for PotatoWaffle item is successful ");				
				
				System.out.println("Current Bill: "+milkshake.items_1(size));
				total+=milkshake.items_1(size);
				
				u1.setPayment(milkshake.PotatoWaffle);
				;
				stringlist.add(u1.getPayment());
				
				TotalPrice += milkshake.items_1(size);
			}
			else 
				System.out.println("\nUnexpected error! Please try again");
			   
				u1.setPayment(total);
				stringlist.add(u1.getPayment());			
			
				total=0;
				System.out.println("\nDo you want to continue? 'yes' for YES \n 'no' for NO");
				user_option=scan.next();		
			}
		while(user_option.equals("yes")); 
		
		//printing the bill for Waffle Service
				System.out.println("\n\nCake Service Bill");
				System.out.println("--------------------------------------------------------");   
				System.out.println("   	Total Price: " +TotalPrice);
				System.out.println("--------------------------------------------------------");   
				System.out.println("        Thank you..!             ");
		
		stringlist.clear();
		
		u1.setPayment(TotalPrice);

		TotalInvoicelist.add(u1.getPayment());
		TotalPrice=0;
	    }else if(milkshakeType == 2) {
	    	System.out.println("\nThe price of the Waffle according to the type");
		    
			
			Scanner scan=new Scanner(System.in);
			Waffles_Subscriber u1 = new Waffles_Subscriber();
			milkshake.ListCakes_2();
			
			String user_option="yes";
			int total=0;
			
			
			do {

				System.out.println("\nSelect the type of Item\n1. PandanWaffle\n2. HotdogWaffle\n3. FlemishWaffle\n4. VeganWaffles");
				System.out.printf("Enter the number : ");
				int size=scan.nextInt();
				
				if(size == 1) {
					System.out.println("\nYour selection for PandanWaffle Waffle  item is successful ");				
				
					System.out.println("Current Bill: "+milkshake.items_2(size));
					total+=milkshake.items_2(size);
					
					u1.setPayment(milkshake.PandanWaffle);
					
					stringlist.add(u1.getPayment());
					
					TotalPrice += milkshake.items_2(size);
				}
				else if(size == 2) {
					System.out.println("\nYour selection for HotdogWaffle Waffle item is successful ");				
				
					System.out.println("Current Bill: "+milkshake.items_2(size));
					total+=milkshake.items_2(size);
					
					u1.setPayment(milkshake.HotdogWaffle);
					
					stringlist.add(u1.getPayment());
					
					TotalPrice += milkshake.items_2(size);
				}			
				else if(size == 3) {
					System.out.println("\nYour selection for FlemishWaffle Waffle item is successful ");				
					
					System.out.println("Current Bill: "+milkshake.items_2(size));
					total+=milkshake.items_2(size);
					
					u1.setPayment(milkshake.FlemishWaffle);
					
					stringlist.add(u1.getPayment());
					
					TotalPrice += milkshake.items_2(size);
				}
				else if(size == 4) {
					System.out.println("\nYour selection for VeganWaffles Waffle item is successful ");				
					
					System.out.println("Current Bill: "+milkshake.items_2(size));
					total+=milkshake.items_2(size);
					
					u1.setPayment(milkshake.VeganWaffles);
					;
					stringlist.add(u1.getPayment());
					
					TotalPrice += milkshake.items_2(size);
				}
				else 
					System.out.println("\nUnexpected error! Please try again");
				   
					u1.setPayment(total);
					stringlist.add(u1.getPayment());			
				
					total=0;
					System.out.println("\nDo you want to continue? 'yes' for YES \n 'no' for NO");
					user_option=scan.next();		
				}
			while(user_option.equals("yes")); 
			
			//printing the bill for Waffle Service
			System.out.println("\n\n Waffle Service Bill");
			System.out.println("--------------------------------------------------------");   
			System.out.println("   	Total Price: " +TotalPrice);
			System.out.println("--------------------------------------------------------");   
			System.out.println("        Thank you..!             ");
			
			stringlist.clear();
			
			u1.setPayment(TotalPrice);

			TotalInvoicelist.add(u1.getPayment());
			TotalPrice=0;
	    }
	}
	

}
