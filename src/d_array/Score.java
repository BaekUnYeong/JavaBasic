package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 Java, Oracle, HTML, JQuery, JSP 점수를
		 * 50 ~ 100까지 랜덤으로 생성시켜주시고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 
		 * 석차	이름	Java	Oracle	HTML	JQuery	JSP	총점	평균
		 * 1	오동규	100		100		100		100		100	500		100
		 * 1	박재운	100		100		100		100		100	500		100
		 * 1	오제민	100		100		100		100		100	500		100
		 * 1	오동규	100		100		100		100		100	500		100
		 * 1	오동규	100		100		100		100		100	500		100
		 * 1	오동규	100		100		100		100		100	500		100
		 * 
		 */
		
		String[] name =  {"오동규", "박재욱", "오제민", "전보영", "유지상",
						"박신규", "진주호", "지원희", "한승희", "안정현",
						"이이슬", "이정은", "이선욱", "조건희", "최효은",
						"김혜정", "김명성", "신유진", "조윤호", "조아라",
						"백운영", "최도혁", "김영호", "박희제", "현솔비"};
		
		String[] subject = {"Java", "Oracle", "HTML", "JQuery", "JSP"};
		
		double[][] score = new double [name.length][subject.length + 3];

			for(int i = 0; i < score.length; i++){
				score[i][0] = 1;
				for(int j = 2; j < subject.length; j++){
					score[i][j] = (int)(Math.random() * 51) + 50;
					}
				}

			for(int i = 0; i < score.length; i++){
				for(int j = 0; j < subject.length; j++){
					score[i][score[i].length - 2] += score[i][j + 1];
				}
				score[i][score[i].length - 1] = (int)((double)score[i][score[i].length - 2]
					/ subject.length * 100 + 0.5) / 100d;
			}
				
		}


	}


