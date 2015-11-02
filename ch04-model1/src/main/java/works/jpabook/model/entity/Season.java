package works.jpabook.model.entity;

public enum Season {

	spring("March through May"),
    summer("June through August"),
    fall("September through November"),
    winter("December through February");
	
	private String desc;
	
    Season(String desc){
        this.desc = desc;
    }
    
    public String getDesc(){
    	return this.desc;
    }
    
	
}
