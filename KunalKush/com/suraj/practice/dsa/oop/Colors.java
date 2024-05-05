package com.suraj.practice.dsa.oop;
/**
 * ENUM practice
 */
public enum Colors {
	RED,BLUE,GREEN,BLACK,WHITE;
	
	
	public String getDefaultOrNot() {
		if(this == RED || this == BLUE || this == GREEN) {
			return "default";
		}else {
			return "Not Default";
		}
	}

}
