
public class Person {

	private static String name;//�̸�
	private static int age;//����

	
	public Person() {
		name="No name yet";//������ �ʱ�ȭ ��
		age=0;
	}
	public Person(String myname,int myage) {
		name=myname;
	    age=myage;//�ٸ� ������, �̸� ���� �־��ִ� ������
	}
	
	public String getName(){
		
		return name;//�̸� ��ȯ getter
	}
	
	public int getAge(){
		
		return age;//���� ��ȯ getter
	}
	
	public static void setName(String myname) {
		name=myname;//�̸� ����
		
	}
	public static void setName(String lastn,String firstn) {
		name=lastn+firstn;//�̸� ����, ���� �̸� ���� 
	
		
	}
	public static void setAge(int myage) {
		age=myage;//���� ����
	}
	
	public static Person createAdult() {//� Ư���� instance
		Person adult = new Person();
		Person.setName("A adult");//�̸� ����
		adult.setAge(21);//���� ����
		return adult;
	}
	
	
	public static Person createToddler() {//toddler Ư���� instance
		Person toddler = new Person();
		toddler.setName("A toddler");//�̸� ����
		toddler.setAge(2);//���� ����
		return toddler;
		
	}
	public static Person createPreschooler() {//preschooler Ư���� instance
		Person preschooler = new Person();
		preschooler.setName("A preschooler");//�̸� ����
		preschooler.setAge(5);//���� ����
		return preschooler;
	}
	public static Person createAdolescent() {//adolescent Ư���� instance
		Person adolescent = new Person();
		adolescent.setName("A adolescent");//�̸� ����
		adolescent.setAge(9);//���� ����
		return adolescent;
	

}
	public static Person createTeenager() {//Teenager Ư���� instance
		Person Teenager = new Person();
		Teenager.setName("A Teenager");//�̸�  ����
		Teenager.setAge(15);//���� ����
		return Teenager;
}
	
	
	public static void main(String[] args) {
		 Person y = new Person();
		 System.out.println("Testing the default constructor");//�⺻ ������ üũ
		 System.out.println("Oject has name " + y.getName() + " and age " + y.getAge());
		 System.out.println("\nCreating each of the specialized instances");//Ư���� instance üũ
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
		 x.setAge(10);//10�� �ٺ� ����
		 System.out.println("Oject has name " + x.getName() + " and age " + x.getAge());
		 System.out.println("\nTesting the alternate set method - name change to Jane Doe");
		 x.setName("Jane", "Doe");//static�� ����� �۵��ϴ� �� ȣ�����ϱ� ���� �� ����
		 x.setAge(10);
		 System.out.println("Oject has name " + x.getName() + " and age " + x.getAge());
		 }
	
	
	
}
