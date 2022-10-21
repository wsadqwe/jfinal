/**
 * 
 */
package com.niit.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author    Matr1x
 * @ProjectName  H_ch1_CS1_save
 * @Manba     >>>Thinking twice,Code Once>>
 * @Description   
 * @Date     Sep 2, 2022  3:14:12 PM
 */
@Entity(name="cs_kun3")
public class Ikun {
	@Id
//	@Column(name="cs1_kid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int kid;
//	@Column(name="cs1_name")
	private String iName;
	public int getKid() {
		return kid;
	}
	public String getiName() {
		return iName;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	public Ikun(int kid, String iName) {
		super();
		this.kid = kid;
		this.iName = iName;
	}
	public Ikun() {}
	

}
