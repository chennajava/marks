package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "hall_ticket_no")
	private long hallTicketNo;

	@NotNull
	@Size(min = 4, max = 15, message = "Name should have atleast 4 characters")
	private String studentName;

	@NotNull
	@Size(min = 1, max = 100, message = "numbers should be positive only")
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	private int sub5;
	private float percentage;
	private String result;

	public long getHallTicketNo() {
		return hallTicketNo;
	}

	public void setHallTicketNo(long hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}

	@Column(name = "student_name", nullable = false)
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Column(nullable = false)
	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	public int getSub4() {
		return sub4;
	}

	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}

	public int getSub5() {
		return sub5;
	}

	public void setSub5(int sub5) {
		this.sub5 = sub5;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
