package i_collection;

import java.util.ArrayList;

public class CollectionsFramework {

	public static void main(String[] args) {
		/*
		 * << CollectionsFramework >>
		 * - Collections	: 다수의 데이터
		 * - Framework		: 표준화된 프로그래밍 방식
		 * 
		 * << List >>
		 * - Vector			: ArrayList의 구버전
		 * - ArrayList*		: 저장순서 유지, 중복 허용	// 장점 : 읽는게 빠르다. 단점 : 추가삭제가 오래걸린다.
		 * - LinkedList		: 데이터 추가 및 삭제시간 단축	// 장점 : 추가삭제가 빠르다.	단점 : 읽는게 느리다.
		 * - Stack			: LIFO(Last In First Out)
		 * - Queue			: FIFO(First In First Out)
		 * 
		 * << Set >>
		 * - HashSet		: 중복 허용 안함, 저장순서 유지 안함
		 * - TreeSet		: 정렬, 검색 기능 향상
		 * 
		 * << Map >>
		 * - HashTable		: HashMap의 구버전
		 * - HashMap*		: 키(key)와 값(value)을 한쌍으로 저장
		 * - TreeMap		: 정렬, 검색 기능 향상
		 */
		
		ArrayList<ArrayList<Double>> score = new ArrayList<ArrayList<Double>>();
		
		ArrayList<Object> students = new ArrayList<Object>();
		ArrayList<String> subject = new ArrayList<String>();

		students.add("오동규");
		students.add("박재욱");
		students.add("오제민");
		students.add("전보영");
		students.add("유지상");
		students.add("박신규");
		students.add("진주호");
		students.add("지원희");
		students.add("한승희");
		students.add("안정현");
		students.add("이이슬");
		students.add("이정은");
		students.add("이선욱");
		students.add("조건희");
		students.add("최효은");
		students.add("김혜정");
		students.add("김명성");
		students.add("신유진");
		students.add("조윤호");
		students.add("조아라");
		students.add("백운영");
		students.add("최도혁");
		students.add("김영호");
		students.add("박희제");
		students.add("현솔비");

			

		subject.add("Java");
		subject.add("Oracle");
		subject.add("HTML");
		subject.add("JQuery");
		subject.add("JSP");

		int sum = 0;
		double avg = 0;
			
			for(int i = 0; i < students.size(); i++){
				ArrayList<Double> scores = new ArrayList<Double>();
				
				scores.add(1.0);
				
				for(int j = 0; i < subject.size(); j++){
					
					double score2 = (double)(Math.random() * 51) + 50;
				}
				score.add(scores);
				System.out.println(score);
			}
	}
}
