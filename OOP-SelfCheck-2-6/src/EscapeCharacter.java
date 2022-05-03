
public class EscapeCharacter {

	public static void main(String[] args) {
		System.out.println("\"\tTest\\\\\rIt\'");
		System.out.println("\"\tTest\\\\\nIt\'");
		//차이 없음. \r은 \n이랑 기능 똑같지만 개발 환경에 따라서 달라지는 경우 있으므로 사용함, 근데 자바에선 차이 없음
	}

	
}
