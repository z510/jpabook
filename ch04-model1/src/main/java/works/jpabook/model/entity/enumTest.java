package works.jpabook.model.entity;

public class enumTest {
	public static void main(String args[]){
		//System.out.println(Gender.MALE);
		
		forFemale(Gender.MALE);
		
		for(Gender g : Gender.values()){
		    System.out.println(g);
		}
		
		String dbVal = "MALE";
		if((Gender.MALE).equals(Gender.valueOf(dbVal))){
			System.out.println("DB MALE OK");
		};
		
	}
	
	public static void forFemale(Gender d){
		
		switch(d){
		
		case MALE: System.out.println("No"); break;
		case FEMALE: System.out.println("OK"); break;
		default : System.out.println("Nonoe"); break;
		
		}
	}
	
	
}
