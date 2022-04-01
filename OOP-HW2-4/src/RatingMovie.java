public class RatingMovie
{
	
	private String moviename;//영화 이름
	private String rating;//시청 등급
	private double averageReview;//평균 리뷰 점수
	private int terrible;//1점
	private int bad;//2점
	private int ok;//3점
	private int good;//4점
	private int great;//5점


	
	public void addRating(int newReview)//새 리뷰 추가
	
	{
		switch (newReview)//새 리뷰 case 분류
		{
			case 1: //별점 1점
				terrible++;
				break;
			case 2: //별점 2점
				bad++;
				break;
			case 3: //별점 3점
				ok++;
				break;
			case 4: //별점 4점
				good++;
				break;
			case 5: //별점 5점
				great++;
				break;
			default: //그 외 범위 벗어남
				System.out.println("wrong range");
				break;
		}
	}


	public void writeOutput()//결과 출력
	{	averageReview = Math.round(((terrible*1) + (bad*2) + (ok*3) + (good*4) + (great*5))/(terrible+bad+ok+good+great));
		System.out.println("Name: " + getName());//영화 이름  
		System.out.println("Rating: " + getRating());//영화 시청 등급
		System.out.println("Average Review " + averageReview);//평균 별점
		System.out.println(terrible + " people have rated this movie as terrible.");//1점에 평가한 사람 수
		System.out.println(bad + " people have rated this movie as bad.");//2점에 평가한 사람 수
		System.out.println(ok  + " people have rated this movie as OK.");//3점에 평가한 사람 수
		System.out.println(good + " people have rated this movie as good.");//4점에 평가한 사람 수
		System.out.println(great + " people have rated this movie as great.");//5점에 평가한 사람 수
	}

	public void setMovie(String newName, String newRating)//영화 정보 세팅
	{
		moviename = newName;//영화 이름
		rating = newRating;//관람등급
	}


	public String getName()
	{
		return moviename;//영화 이름 얻어오기
	}

	public String getRating()//관람등급 얻어오기
	{
		return rating;
	}
	
	 public boolean equals(RatingMovie otherObject)//같은 영화에 대한 평가 맞는지 확인(영화 이름 체크)
	{
	return(this.moviename.equals(otherObject.moviename));
	}

 }