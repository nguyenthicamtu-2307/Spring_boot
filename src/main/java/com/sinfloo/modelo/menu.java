package com.sinfloo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblcategory")
public class menu {
	@Id
	@Column
	public int id;
	@Column (name="madm")
	public String madm;
	@Column
	public String tendm;
	
}
