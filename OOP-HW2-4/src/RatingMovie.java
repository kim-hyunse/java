public class RatingMovie
{
	
	private String moviename;//��ȭ �̸�
	private String rating;//��û ���
	private double averageReview;//��� ���� ����
	private int terrible;//1��
	private int bad;//2��
	private int ok;//3��
	private int good;//4��
	private int great;//5��


	
	public void addRating(int newReview)//�� ���� �߰�
	
	{
		switch (newReview)//�� ���� case �з�
		{
			case 1: //���� 1��
				terrible++;
				break;
			case 2: //���� 2��
				bad++;
				break;
			case 3: //���� 3��
				ok++;
				break;
			case 4: //���� 4��
				good++;
				break;
			case 5: //���� 5��
				great++;
				break;
			default: //�� �� ���� ���
				System.out.println("wrong range");
				break;
		}
	}


	public void writeOutput()//��� ���
	{	averageReview = Math.round(((terrible*1) + (bad*2) + (ok*3) + (good*4) + (great*5))/(terrible+bad+ok+good+great));
		System.out.println("Name: " + getName());//��ȭ �̸�  
		System.out.println("Rating: " + getRating());//��ȭ ��û ���
		System.out.println("Average Review " + averageReview);//��� ����
		System.out.println(terrible + " people have rated this movie as terrible.");//1���� ���� ��� ��
		System.out.println(bad + " people have rated this movie as bad.");//2���� ���� ��� ��
		System.out.println(ok  + " people have rated this movie as OK.");//3���� ���� ��� ��
		System.out.println(good + " people have rated this movie as good.");//4���� ���� ��� ��
		System.out.println(great + " people have rated this movie as great.");//5���� ���� ��� ��
	}

	public void setMovie(String newName, String newRating)//��ȭ ���� ����
	{
		moviename = newName;//��ȭ �̸�
		rating = newRating;//�������
	}


	public String getName()
	{
		return moviename;//��ȭ �̸� ������
	}

	public String getRating()//������� ������
	{
		return rating;
	}
	
	 public boolean equals(RatingMovie otherObject)//���� ��ȭ�� ���� �� �´��� Ȯ��(��ȭ �̸� üũ)
	{
	return(this.moviename.equals(otherObject.moviename));
	}

 }