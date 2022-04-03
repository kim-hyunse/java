
public class Operator {
	public static void main(String[] args) {
		
		int x=10;
		System.out.println("test 1 " + x * 3 * 2.0);//1
		System.out.println("test 2 " + x * 3 + 2.0);//2
		//System.out.println("test 3 " + x * 3 - 2.0);//3
		//1번에서는 x*3*2가 다 계산되어서 한 번에 문자열로 바뀌기 때문에 60.0이 출력됨
		//2번에서는 3*10이 계산되고 바로 문자열에 저장되고, 그 이후에 +2.0 연산을 하기 때문에 302.0 이렇게 저장됨
		//3번에서는 x*3이 이미 문자열에 저장되었는데, 문자열에서는 빼기 연산을 수행할 수 없으므로 에러메시지가 나옴ㄴ
	}

}
