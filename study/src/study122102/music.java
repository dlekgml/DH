package study122102;

public class music {
	
	static int count=0; // 클래스 변수, 명시적초기화로 0 저장

	String singer;
	String title;
	int playing_time;
	
	music(){} // 기본 생성자메서드
	music(String 가수, String 제목){ // 매개변수가 있는 생성자 메서드
		this.singer=가수;
		this.title=제목;		
	}
	music(String singer, String title, int time){ // 매개변수가 있는 생성자 메서드
		this(singer,title); // 생성자메서드 실행하라는 것
		this.playing_time=time;
	}
	
	@Override
	public String toString() {
		return "가수 : "+singer+" - "+title+"("+transform()+")";
	}
	String transform() {
		int min = playing_time/100;
		int sec = playing_time%100; 
		
		return min+":"+sec; // 리턴있으면 void -> String 으로 바꾸기
	}
}

//	int a=456;
//	Integer.toString(a).charAt(0) //substring(0,1);
	