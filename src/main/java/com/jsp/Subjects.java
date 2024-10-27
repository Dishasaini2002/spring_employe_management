package com.jsp;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Subjects {

	
	public int getSuid() {
		return suid;
	}
	public void setSuid(int suid) {
		this.suid = suid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public int getSubdays() {
		return subdays;
	}
	public void setSubdays(int subdays) {
		this.subdays = subdays;
	}
	public List<Students> getStudents() {
		return students;
	}
	public void setStudents(List<Students> students) {
		this.students = students;
	}
	@Id
	private int suid;
	private String subname;
	private int subdays;
	@ManyToMany
	
	@JoinTable(joinColumns=@JoinColumn(name="subject_id"),inverseJoinColumns=@JoinColumn(name="student_id"))
	
	
	private List<Students> students;
	
	
}
