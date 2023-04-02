package milkshake_publisher;

public class Milkshake_PublisherImplementation implements Milkshake_PublisherInterface {
	
	@Override
	public int items_1(int item) {
		// TODO Auto-generated method stub
		if(item== 1){
			System.out.println("DoubleChocolate:400ml");
			return Milkshake_PublisherInterface.DoubleChocolate;
		}
		else if(item == 2){
			System.out.println("Chocolate:400ml");
			return Milkshake_PublisherInterface.Chocolate;
		}	
		else if(item == 3){
			System.out.println("Vanilla:400ml");
			return Milkshake_PublisherInterface.Vanilla;
		}
		else if(item == 4){
			System.out.println("WhiteChocolate:400ml");
			return Milkshake_PublisherInterface.WhiteChocolate;
		}
		else {
			System.out.println("Invalid");
			return 0;
		}
	}

	@Override
	public void ListCakes_1() {
		// TODO Auto-generated method stub
		System.out.println(" 1 : DoubleChocolate 400ml: "+Milkshake_PublisherInterface.DoubleChocolate+".00 lkr");
		System.out.println(" 2 : Chocolate 400ml: "+Milkshake_PublisherInterface.Chocolate+".00 lkr");
		System.out.println(" 3 : Vanilla 400ml: "+Milkshake_PublisherInterface.Vanilla+".00 lkr");
		System.out.println(" 4 : WhiteChocolate 400ml: "+Milkshake_PublisherInterface.WhiteChocolate+".00 lkr");
	}




	@Override
	public int items_2(int item) {
		if(item== 1){
			System.out.println("Coolmint:400ml");
			return Milkshake_PublisherInterface.Coolmint;
		}
		else if(item == 2){
			System.out.println("Strawberry:400ml");
			return Milkshake_PublisherInterface.Strawberry;
		}	
		else if(item == 3){
			System.out.println("Blueberry:400ml");
			return Milkshake_PublisherInterface.Blueberry;
		}
		else if(item == 4){
			System.out.println("brownie:400ml");
			return Milkshake_PublisherInterface.brownie;
		}
		else {
			System.out.println("Invalid");
			return 0;
		}
	}

	@Override
	public void ListCakes_2() {
		// TODO Auto-generated method stub
		System.out.println(" 1 : Coolmint 400ml: "+Milkshake_PublisherInterface.Coolmint+".00 lkr");
		System.out.println(" 2 : Strawberry 400ml: "+Milkshake_PublisherInterface.Strawberry+".00 lkr");
		System.out.println(" 3 : Blueberry 400ml: "+Milkshake_PublisherInterface.Blueberry+".00 lkr");
		System.out.println(" 4 : brownie 400ml: "+Milkshake_PublisherInterface.brownie+".00 lkr");
	

	}	
}
