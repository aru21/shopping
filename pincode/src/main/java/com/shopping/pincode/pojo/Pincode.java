package com.shopping.pincode.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pincode")
public class Pincode {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int pincodeId;
	String city ;
	boolean isAvaiable ;
	
	@Column(length = 6,unique = true,nullable = false)
	Integer pincode;
	
	
	public int getPincodeId() {
		return pincodeId;
	}
	public void setPincodeId(int pincodeId) {
		this.pincodeId = pincodeId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isAvaiable() {
		return isAvaiable;
	}
	public void setAvaiable(boolean isAvaiable) {
		this.isAvaiable = isAvaiable;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	
	public Pincode() {
		super();
	}
	
	@Override
	public String toString() {
		return "Pincode [pincodeId=" + pincodeId + ", city=" + city + ", isAvaiable=" + isAvaiable + ", pincode="
				+ pincode + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + (isAvaiable ? 1231 : 1237);
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		result = prime * result + pincodeId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pincode other = (Pincode) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (isAvaiable != other.isAvaiable)
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		if (pincodeId != other.pincodeId)
			return false;
		return true;
	}
	
	
	
	
}
