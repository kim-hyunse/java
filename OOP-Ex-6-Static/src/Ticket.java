
public class Ticket {

	private static int numTicketSold=0;
	private int ticketNum;
	
	public Ticket() {
		
		numTicketSold++;
		ticketNum=numTicketSold;
		
	}
	
	
	public static int getNumberSold() {

	return 	numTicketSold;
		
		//Static�ȿ� Static �ƴ� ���� �θ��� �� �Ұ���. �׷��� numTicketSold�� static�ƴϸ� �� �θ���?
	}
	
	public int getTicketNumber() {
		
		return ticketNum;
	}
	
	public String getInfo() {

	return "ticket #"+ticketNum+" "	+numTicketSold+" ticket(s) sold";
	}
	
}
