
public class Ticket {

	private static int numTicketSold=0;
	private int ticketNum;
	
	public Ticket() {
		
		numTicketSold++;
		ticketNum=numTicketSold;
		
	}
	
	
	public static int getNumberSold() {

	return 	numTicketSold;
		
		//Static안에 Static 아닌 변수 부르는 거 불가능. 그래서 numTicketSold도 static아니면 못 부를듯?
	}
	
	public int getTicketNumber() {
		
		return ticketNum;
	}
	
	public String getInfo() {

	return "ticket #"+ticketNum+" "	+numTicketSold+" ticket(s) sold";
	}
	
}
