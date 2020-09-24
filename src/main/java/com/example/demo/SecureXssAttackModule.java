package com.example.demo;

import javax.persistence.Entity;

@Entity
public class SecureXssAttackModule {

	private int oauth;
	private String passcode;
	private float key;
	public int getOauth() {
		return oauth;
	}
	public void setOauth(int oauth) {
		this.oauth = oauth;
	}
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	public float getKey() {
		return key;
	}
	public void setKey(float key) {
		this.key = key;
	}
	@Override
	public String toString() {
		return "SecureXssAttackModule [oauth=" + oauth + ", passcode=" + passcode + ", key=" + key + "]";
	}
	
}
