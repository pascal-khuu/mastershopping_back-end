package co.simplon.mastershopping.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FABRICS")
public class Fabric {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(name = "fabrics_name")
	private String fabricName;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFabricName() {
		return fabricName;
	}

	public void setFabricName(String fabricName) {
		this.fabricName = fabricName;
	}

	@Override
	public String toString() {
		return "Fabric [Id=" + Id + ", fabricName=" + fabricName + "]";
	}

}
