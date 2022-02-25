 
public class Bussinessman implements Socialworker, Richman  {
       
	
		
	
	
	
	@Override
	public void earnmoney() {
		System.out.println( "Earning money");
	}

	@Override
	public void party() {
		System.out.println("having fun");
	}

	@Override
	public void donation() {
		System.out.println("giving donation");
		
	}

	@Override
	public void helpToothers() {
		System.out.println("Helping others");
		
		
	}
	
public static void main(String[] args) {
	Bussinessman  b= new Bussinessman();
	b.helpToothers();
	b.donation();
	b.earnmoney();
	b.party();
}

}
	
