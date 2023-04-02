package waffles_publisher;

public class Waffles_PublisherImplementation implements Waffles_PublisherInterface {
	
	@Override
	public int items_1(int item) {
		// TODO Auto-generated method stub
		if(item== 1){
			System.out.println("BrusselsWaffle:1 Piece");
			return Waffles_PublisherInterface.BrusselsWaffle;
		}
		else if(item == 2){
			System.out.println("LiegeWaffle:1 Piece");
			return Waffles_PublisherInterface.LiegeWaffle;
		}	
		else if(item == 3){
			System.out.println("AmericanWaffle:1 Piece");
			return Waffles_PublisherInterface.AmericanWaffle;
		}
		else if(item == 4){
			System.out.println("PotatoWaffle:1 Piece");
			return Waffles_PublisherInterface.PotatoWaffle;
		}
		else {
			System.out.println("Invalid");
			return 0;
		}
	}

	@Override
	public void ListCakes_1() {
		// TODO Auto-generated method stub
		System.out.println(" 1 : BrusselsWaffle 1 Piece: "+Waffles_PublisherInterface.BrusselsWaffle+".00 lkr");
		System.out.println(" 2 : LiegeWaffle 1 Piece: "+Waffles_PublisherInterface.LiegeWaffle+".00 lkr");
		System.out.println(" 3 : AmericanWaffle 1 Piece: "+Waffles_PublisherInterface.AmericanWaffle+".00 lkr");
		System.out.println(" 4 : PotatoWaffle 1 Piece: "+Waffles_PublisherInterface.PotatoWaffle+".00 lkr");
	}




	@Override
	public int items_2(int item) {
		if(item== 1){
			System.out.println("PandanWaffle:1 Piece");
			return Waffles_PublisherInterface.PandanWaffle;
		}
		else if(item == 2){
			System.out.println("HotdogWaffle:1 Piece");
			return Waffles_PublisherInterface.HotdogWaffle;
		}	
		else if(item == 3){
			System.out.println("FlemishWaffle:1 Piece");
			return Waffles_PublisherInterface.FlemishWaffle;
		}
		else if(item == 4){
			System.out.println("VeganWaffles:1 Piece");
			return Waffles_PublisherInterface.VeganWaffles;
		}
		else {
			System.out.println("Invalid");
			return 0;
		}
	}

	@Override
	public void ListCakes_2() {
		// TODO Auto-generated method stub
		System.out.println(" 1 : PandanWaffle 1 Piece: "+Waffles_PublisherInterface.PandanWaffle+".00 lkr");
		System.out.println(" 2 : HotdogWaffle 1 Piece: "+Waffles_PublisherInterface.HotdogWaffle+".00 lkr");
		System.out.println(" 3 : FlemishWaffle 1 Piece: "+Waffles_PublisherInterface.FlemishWaffle+".00 lkr");
		System.out.println(" 4 : VeganWaffles 1 Piece: "+Waffles_PublisherInterface.VeganWaffles+".00 lkr");
	

	}	
}
