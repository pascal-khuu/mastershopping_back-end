package co.simplon.mastershopping.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FABRICS")
public class Fabrics {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(name = "fabrics_name")
	private String fabricsName;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFabricsName() {
		return fabricsName;
	}

	public void setFabricsName(String fabricsName) {
		this.fabricsName = fabricsName;
	}

	@Override
	public String toString() {
		return "Fabrics [Id=" + Id + ", fabricsName=" + fabricsName + "]";
	}

}
