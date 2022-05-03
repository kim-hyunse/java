
public class FindSecond {



	public static void main(String[] args) {
	String example=" Hello, my good friend!";//문자열 입력
	String example1=example.trim();//앞에 빈칸 제거
	int index=example1.indexOf(" ");//띄어쓰기가 첨 나오는 문자열 위치 index에 저장
	String example2=example1.substring(index);//띄어쓰기 뒷내용부터 example2에 저장
	String example3=example2.trim();//앞에 띄어쓰기 제거
	int index2=example3.indexOf(" ");//index2에 example3에서 처음 띄어쓰기 나오는 문자열 위치 저장
	String second=example3.substring(0,index2);//0(자른 문자열이 처음 시작되는 지점)부터 띄어쓰기까지 출력
	
	
	

	System.out.println(second);
	

}

}
