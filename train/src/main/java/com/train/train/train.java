package com.train.train;

import javax.persistence.*;

@Entity
@Table(name = "train")
public class train {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Integer mave;
public String matau;
public int soghe;
public int ngaydi;
public int ngayden;
public int giodi;
public int gioden;
public int price;

public train() {
	super();
}
public train(Integer mave, String matau, int soghe, int ngaydi, int ngayden, int giodi, int gioden, int price) {
	super();
	this.mave = mave;
	this.matau = matau;
	this.soghe = soghe;
	this.ngaydi = ngaydi;
	this.ngayden = ngayden;
	this.giodi = giodi;
	this.gioden = gioden;
	this.price = price;
}
public Integer getMave() {
	return mave;
}
public void setMave(Integer mave) {
	this.mave = mave;
}
public String getMatau() {
	return matau;
}
public void setMatau(String matau) {
	this.matau = matau;
}
public int getSoghe() {
	return soghe;
}
public void setSoghe(int soghe) {
	this.soghe = soghe;
}
public int getNgaydi() {
	return ngaydi;
}
public void setNgaydi(int ngaydi) {
	this.ngaydi = ngaydi;
}
public int getNgayden() {
	return ngayden;
}
public void setNgayden(int ngayden) {
	this.ngayden = ngayden;
}
public int getGiodi() {
	return giodi;
}
public void setGiodi(int giodi) {
	this.giodi = giodi;
}
public int getGioden() {
	return gioden;
}
public void setGioden(int gioden) {
	this.gioden = gioden;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
