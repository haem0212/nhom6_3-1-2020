package com.example.Giuxe;

import javax.persistence.*;

@Entity
@Table(name = "giuxe")
public class Giuxe {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Integer maXe;
public String tenXe;
public String Tenchu;
public String bienso;

public Giuxe() {
	super();
}


public Giuxe(Integer maXe, String tenXe, String tenchu, String bienso) {
	super();
	this.maXe = maXe;
	this.tenXe = tenXe;
	this.Tenchu = tenchu;
	this.bienso = bienso;
}


public Integer getMaXe() {
	return maXe;
}
public void setMaXe(Integer maXe) {
	this.maXe = maXe;
}
public String getTenXe() {
	return tenXe;
}
public void setTenXe(String tenXe) {
	this.tenXe = tenXe;
}
public String getTenchu() {
	return Tenchu;
}
public void setTenchu(String tenchu) {
	Tenchu = tenchu;
}
public String getBienso() {
	return bienso;
}
public void setBienso(String bienso) {
	this.bienso = bienso;
}
}
