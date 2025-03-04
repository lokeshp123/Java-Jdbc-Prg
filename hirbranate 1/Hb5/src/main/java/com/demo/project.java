package com.demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class project {
	@Id
	
	private int pid;
	@Column(name="Project_Name")
	private String projectname;
	@ManyToMany
	private List<Empone>empones;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public List<Empone> getEmpones() {
		return empones;
	}
	public void setEmpones(List<Empone> empones) {
		this.empones = empones;
	}
	public project(int pid, String projectname, List<Empone> empones) {
		super();
		this.pid = pid;
		this.projectname = projectname;
		this.empones = empones;
	}
	public project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
