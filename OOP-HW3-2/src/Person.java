
public class Person {

	private static String name;//이름
	private static int age;//나이

	
	public Person() {
		name="No name yet";//생성자 초기화 값
		age=0;
	}
	public Person(String myname,int myage) {
		name=myname;
	    	age=myage;//다른 생성자, 이름 나이 넣어주는 생성자
	}
	
	public String getName(){
		
		return name;//이름 반환 getter
	}
	
	public int getAge(){
		
		return age;//나이 반환 getter
	}
	
	public static void setName(String myname) {
		name=myname;//이름 설정
		
	}
	public static void setName(String lastn,String firstn) {
		name=lastn+firstn;//이름 설정, 성과 이름 따로 
	
		
	}
	public static void setAge(int myage) {
		age=myage;//나이 설정
	}
	
	public static Person createAdult() {//어른 특별한 instance
		//Person adult = new Person();
		//Person.setName("A adult");//이름 지정
		//adult.setAge(21);//나이 지정
		Person adult = new Person("A adult",21);
		return adult;
	}
	
	
	public static Person createToddler() {//toddler 특별한 instance
		//Person toddler = new Person();
		//toddler.setName("A toddler");//이름 지정
		//toddler.setAge(2);//나이 지정
		Person toddler = new Person("A toddler",2);
		return toddler;
		
	}
	public static Person createPreschooler() {//preschooler 특별한 instance
		//Person preschooler = new Person();
		//preschooler.setName("A preschooler");//이름 지정
		//preschooler.setAge(5);//나이 지정
		Person preschooler = new Person("A preschooler",5);
		return preschooler;
	}
	public static Person createAdolescent() {//adolescent 특별한 instance
		//Person adolescent = new Person();
		//adolescent.setName("A adolescent");//이름 지정
		//adolescent.setAge(9);//나이 지정
		Person preschooler = new Person("A adolescent",9);
		return adolescent;
	

}
	public static Person createTeenager() {//Teenager 특별한 instance
		//Person Teenager = new Person();
		//Teenager.setName("A Teenager");//이름  지정
		//Teenager.setAge(15);//나이 지정
		Person Teenager = new Person("A Teenager",15);
		return Teenager;
}
	
	
	public static void main(String[] args) {
		 Person y = new Person();
		 System.out.println("Testing the default constructor");//기본 생성자 체크
		 System.out.println("Oject has name " + y.getName() + " and age " + y.getAge());
		 System.out.println("\nCreating each of the specialized instances");//특별한 instance 체크
		 Person x;
		 x = Person.createToddler();//toddler
		 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
		 x = Person.createPreschooler();//preschooler
		 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
	
		 x = Person.createAdolescent();//adolescent
		 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
		 x = Person.createTeenager();//teen
		 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
		 x = Person.createAdult();//adult
		 System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
		 System.out.println("\nTesting set - Name should be Bobby with age 10");
		 x.setName("Bobby");
		 x.setAge(10);//10살 바비 세팅
		 System.out.println("Oject has name " + x.getName() + " and age " + x.getAge());
		 System.out.println("\nTesting the alternate set method - name change to Jane Doe");
		 x.setName("Jane", "Doe");//static이 제대로 작동하는 지 호가인하기 위해 값 변경
		 x.setAge(10);
		 System.out.println("Oject has name " + x.getName() + " and age " + x.getAge());
		 }
	
	
	
}
