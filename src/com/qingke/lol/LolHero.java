package com.qingke.lol;

import java.util.Random;

public class LolHero extends Hero {
	public LolHero(String heroName, int heroBlood,int heroAttack) {
		super(heroName, heroBlood,heroAttack);
		
	}

	@Override
	public boolean hit(Hero hero,Skill kill) {
		hero.beHit(kill.blood);
		return true;
	}

	@Override
	public boolean beHit(int blood) {
		this.currentBlood -= blood;
		System.out.println(this.name+"受到"+blood+"点伤害,剩余血量："+this.currentBlood);
		return true;
	}

	@Override
	public String toString() {
		return "LolHero [blood=" + blood + ", currentBlood=" + currentBlood + ", name=" + name + ", attackPower="
				+ attackPower + "]";
	}
	
	
}
