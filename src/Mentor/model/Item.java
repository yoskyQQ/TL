package Mentor.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity @Table(name = "itemBank")
@Component
public class Item {
	
	@Id @Column(name = "STUDENTID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String studentId;
	
	@Column(name = "ITEMNAME")
	private String itemName;
	
	@Column(name = "ITEMID")
	private int itemId;
	
	@Column(name = "ITEMSCORE")
	private int itemScore;

	public int getItemScore() {
		return itemScore;
	}

	public void setItemScore(int itemScore) {
		this.itemScore = itemScore;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


}
