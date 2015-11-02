package works.jpabook.model.entity;

public class enumSeason {
	
	public static void main(String args[]){
		
		/**
		 * 화면에서 월을 선택하면 계절을 선택하고 해당 설명이 나오도록 한다 
		 * 예를 들어  3월을 선택하면 따뜻한 '봄'을 선택 하셨네요 .
		 */
		
		String myBirthMonth = "3";
		
		//System.out.println(getSeasonByMonth(myBirthMonth));
		
		myBirthMonth = "6";
		//System.out.println(getSeasonByMonth(myBirthMonth));
		
		
		/**
		 * 회원에게 별자리점을 서비스 할 수 있는 시스템을 개발 한다.
		 * 
		 */
		
		System.out.println(getStarByMonth("6").getDesc());
	}
	
	public static String getSeasonByMonth(String m){
    	switch (m){
    		case "1" : return Season.winter.getDesc();
    		case "2" : return Season.winter.getDesc();
    		case "3" : return Season.spring.getDesc();
    		case "4" : return Season.spring.getDesc();
    		case "5" : return Season.spring.getDesc();
    		case "6" : return Season.summer.getDesc();
    		default : return "";
    	}
    }
	
	public static Months getStarByMonth(String m){
    	switch (m){
    		case "1" : return Months.jen;
    		case "2" : return Months.feb;
    		case "3" : return Months.mar;
    		case "4" : return Months.apr;
    		case "5" : return Months.may;
    		case "6" : return Months.jun;
    		default : return Months.jen;
    	}
    }
}
