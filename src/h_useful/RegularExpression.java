package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	뒷 문자로 시자
		 * $	앞 문자로 종료
		 * .	임의의 문자(줄바꿈 제외)
		 * *	앞 문자가 0개 이상
		 * +	앞 문자가 1개 이상
		 * ?	앞 문자가 없거나 1개
		 * []	문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌 것)
		 * {}	앞 문자의 개수({2} : {2,4} : 2개 이상 4개 이하)
		 * ()	그룹화(1개의 문자처럼 인식)
		 * |	OR 연산
		 * \s	공백, 탭, 줄바꿈
		 * \S	공백, 탭, 줄바꿈이 아닌 문자
		 * \w	알파벳이나 숫자
		 * \W	알파벳이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 * (?i)	뒷 문자의 대소문자 구분 안함
		 * \	정규표현식에서 사용되는 특수문자 표현
		 */
		
//		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";
//		String regex = ".*";
		
//		Pattern p = Pattern.compile(regex);
//		
//		Matcher m = p.matcher(str);
		
//		System.out.println(m.matches());
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		
		String str = "dns_6615";
		String str2 = "010-5917-4763";
		String str3 = "cjstk12343@naver.com";
		String strId = "\\w{6,12}";
		String strTel = "[0-9]{12,13}";
		String strMail = "\\w+@[a-z](.com)";
		
		Pattern pid = Pattern.compile(strId);
		Pattern pt = Pattern.compile(strTel);
		Pattern pm = Pattern.compile(strMail);
		
		Matcher m = pid.matcher(str);
		Matcher m2 = pt.matcher(str2);
		Matcher m3 = pm.matcher(str3);
		
		System.out.println(m.matches());
		System.out.println(m2.matches());
		System.out.println(m3.matches());
		
		
	}

}
