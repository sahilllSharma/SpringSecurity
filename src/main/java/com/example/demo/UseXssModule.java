package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class UseXssModule {
     
	@Autowired
	SecureXssAttackModule sxm;
	
	void preventAttack()
	{
		sxm.setKey(104);
		sxm.setPasscode("Sahil Sharma");
	}
	
}
