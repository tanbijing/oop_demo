package com.qingke.lol;

public abstract class Hero {
	protected int blood;
	protected int currentBlood;
	public String name;
	protected int attackPower;
	
	public Hero(String heroName,int heroBlood,int heroAttack){
		name = heroName;
		this.setBlood(heroBlood);
		this.setCurrentBlood(heroBlood);
		this.setAttackPower(heroAttack);
	}

	public int getBlood() {
		return blood;
	}

	protected void setBlood(int blood) {
		this.blood = blood;
	}

	public int getCurrentBlood() {
		return currentBlood;
	}

	protected void setCurrentBlood(int currentBlood) {
		this.currentBlood = currentBlood;
	}

	public int getAttackPower() {
		return attackPower;
	}

	protected void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public boolean isGameOver(){
		return this.currentBlood<=0;
	}
	
	
	public String toString() {
		return "Hero [blood=" + blood + ", currentBlood=" + currentBlood + ", name=" + name + ", attackPower="
				+ attackPower + "]";
	}
	
	public abstract boolean hit(Hero hero,Skill kill);
	public abstract boolean beHit(int blood);
	
}
