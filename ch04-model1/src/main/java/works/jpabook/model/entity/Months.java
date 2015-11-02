package works.jpabook.model.entity;

public enum Months {
	jen("1",Season.winter,"물병")
	,feb("2",Season.winter,"물병")
	,mar("3",Season.spring,"물고기")
	,apr("4",Season.spring,"양")
	,may("5",Season.spring,"황소")
	,jun("6",Season.summer,"쌍둥이");
	
	private String month;
	private Season season;
	private String star;
	
	Months(String month, Season season, String star){
		this.month = month;
		this.season = season;
		this.star = star;	
		
	}
	
	public String getMonth(){
		return this.month;
	}
	
	public String getSeason(){
		return this.season.getDesc();
	}
	
	public String getStar(){
		return this.star;
	}
	
	public String getDesc(){
		return this.getSeason()+"사이에  태어나서"+this.getStar()+" 자리 네요";
	}
}
