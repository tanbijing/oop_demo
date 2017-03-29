package com.qingke.lol;

public enum Skill {
	Q(10),W(20),E(30),R(40),N(5);
	public int blood;
	private Skill(int killBlood){
		blood = killBlood;
	}
}
