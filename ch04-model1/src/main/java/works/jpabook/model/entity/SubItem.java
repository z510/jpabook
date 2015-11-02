package works.jpabook.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by holyeye on 2014. 3. 11..
 */

@Entity
public class SubItem {
	
	@Id @GeneratedValue
	@Column(name="ITEM_ID")
	private Long id;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SubItem [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

	
	
	
   
}
