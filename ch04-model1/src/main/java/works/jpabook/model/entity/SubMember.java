package works.jpabook.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SubMember {
	
	@Id @GeneratedValue
	@Column(name ="MEMBER_ID")
	private Long id;
	
	
}
