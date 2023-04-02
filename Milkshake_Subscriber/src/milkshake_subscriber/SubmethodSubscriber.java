package milkshake_subscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import milkshake_publisher.Milkshake_PublisherInterface;
import milkshake_subscriber.MilkshakeSubscriber;

public class SubmethodSubscriber {
	public static  List<Object> stringlist=new ArrayList<Object>();
	public static  List<Object> TotalInvoicelist=new ArrayList<Object>();
	public static float TotalPrice=0;
	
	public static void milkshake_producer(Milkshake_PublisherInterface milkshake) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("\nSelect the type of Milkshake Type\n1. Special Milkshake\n2. Normal Milkshake");
        System.out.printf("\n******************: ");
	    System.out.printf("\nEnter the number : ");
	  
	    int milkshakeType = myObj.nextInt();  
	    
	    if(milkshakeType == 1) {
	    System.out.println("\nThe price of the  according to the type");
	    
		
		Scanner scan=new Scanner(System.in);
		MilkshakeSubscriber u1 = new MilkshakeSubscriber();
		milkshake.ListCakes_1();
		
		String user_option="yes";
		int total=0;
		
		do {

			System.out.println("\nSelect the type of Item\n1. DoubleChocolate\n2. Chocolate\n3. Vanilla\n4. WhiteChocolate");
			System.out.printf("Enter the number : ");
			int size=scan.nextInt();
			
			if(size == 1) {
				System.out.println("/nYour selection for Double Chocolate item is successful ");				
			
				System.out.println("Current Bill: "+milkshake.items_1(size));
				total+=milkshake.items_1(size);
				
				u1.setPayment(milkshake.DoubleChocolate);
				
				stringlist.add(u1.getPayment());
				
				TotalPrice += milkshake.items_1(size);
			}
			else if(size == 2) {
				System.out.println("\nYour selection for Chocolate item is successful ");				
			
				System.out.println("Current Bill: "+milkshake.items_1(size));
				total+=milkshake.items_1(size);
				
				u1.setPayment(milkshake.Chocolate);
				
				stringlist.add(u1.getPayment());
				
				TotalPrice += milkshake.items_1(size);
			}			
			else if(size == 3) {
				System.out.println("\nYour selection for Vanilla item is successful ");				
				
				System.out.println("Current Bill: "+milkshake.items_1(size));
				total+=milkshake.items_1(size);
				
				u1.setPayment(milkshake.Vanilla);
				
				stringlist.add(u1.getPayment());
				
				TotalPrice += milkshake.items_1(size);
			}
			else if(size == 4) {
				System.out.println("\nYour selection for WhiteChocolate item is successful ");				
				
				System.out.println("Current Bill: "+milkshake.items_1(size));
				total+=milkshake.items_1(size);
				
				u1.setPayment(milkshake.WhiteChocolate);
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
		
		//printing the bill for Milkshake Service
				System.out.println("\n\nMilkshake Service Bill");
				System.out.println("--------------------------------------------------------");   
				System.out.println("   	Total Price: " +TotalPrice);
				System.out.println("--------------------------------------------------------");   
				System.out.println("        Thank you..!             ");
		
		stringlist.clear();
		
		u1.setPayment(TotalPrice);

		TotalInvoicelist.add(u1.getPayment());
		TotalPrice=0;
	    }else if(milkshakeType == 2) {
	    	System.out.println("\nThe price of the Milkshake according to the type");
		    
			
			Scanner scan=new Scanner(System.in);
			MilkshakeSubscriber u1 = new MilkshakeSubscriber();
			milkshake.ListCakes_2();
			
			String user_option="yes";
			int total=0;
			
			
			do {

				System.out.println("\nSelect the type of Item\n1. Coolmint\n2. Strawberry\n3. Blueberry\n4. brownie");
				System.out.printf("Enter the number : ");
				int size=scan.nextInt();
				
				if(size == 1) {
					System.out.println("\nYour selection for Coolmint Milkshake  item is successful ");				
				
					System.out.println("Current Bill: "+milkshake.items_2(size));
					total+=milkshake.items_2(size);
					
					u1.setPayment(milkshake.Coolmint);
					
					stringlist.add(u1.getPayment());
					
					TotalPrice += milkshake.items_2(size);
				}
				else if(size == 2) {
					System.out.println("\nYour selection for Strawberry Milkshake item is successful ");				
				
					System.out.println("Current Bill: "+milkshake.items_2(size));
					total+=milkshake.items_2(size);
					
					u1.setPayment(milkshake.Strawberry);
					
					stringlist.add(u1.getPayment());
					
					TotalPrice += milkshake.items_2(size);
				}			
				else if(size == 3) {
					System.out.println("\nYour selection for Blueberry Milkshake item is successful ");				
					
					System.out.println("Current Bill: "+milkshake.items_2(size));
					total+=milkshake.items_2(size);
					
					u1.setPayment(milkshake.Blueberry);
					
					stringlist.add(u1.getPayment());
					
					TotalPrice += milkshake.items_2(size);
				}
				else if(size == 4) {
					System.out.println("\nYour selection for brownie Milkshake item is successful ");				
					
					System.out.println("Current Bill: "+milkshake.items_2(size));
					total+=milkshake.items_2(size);
					
					u1.setPayment(milkshake.brownie);
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
			
			//printing the bill for Milkshake Service
			System.out.println("\n\n Milkshake Service Bill");
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
