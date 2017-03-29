package com.qingke.lol.start;

import java.util.Random;
import java.util.Scanner;

import com.qingke.lol.Hero;
import com.qingke.lol.LolHero;
import com.qingke.lol.Skill;
import com.qingke.lol.SkillType;

public class OpenLol {
	public static Hero[] heroArr;
	
	public static void main(String[] args){
		LolHero tom = new LolHero("tom",100,10);
		LolHero cat = new LolHero("cat",100,10);
		heroArr = new Hero[2];
		heroArr[0] = tom;
		heroArr[1] = cat;
		
		fire();
		
		System.out.println((tom.isGameOver() ? cat.name : tom.name)+"胜利,游戏结束！");
	}
	
	private static void fire(){
		Scanner in=new Scanner(System.in);
		while(true){
			Random ra =new Random();
			int hitHeroIndex = ra.nextInt(2);
			int beHitHeroIndex = hitHeroIndex==1 ? 0:1;
			System.out.println(heroArr[hitHeroIndex].name+"发起攻击：");
			String type = in.nextLine();
			
			heroArr[hitHeroIndex].hit(heroArr[beHitHeroIndex],new SkillType().getSkill(type));
			
			if (heroArr[beHitHeroIndex].isGameOver()) break;
			Skill[] skill = Skill.values();
			int skillIndex = ra.nextInt(skill.length);
			heroArr[beHitHeroIndex].hit(heroArr[hitHeroIndex],skill[skillIndex]);
			System.out.println("=============================");
			if (heroArr[hitHeroIndex].isGameOver()) break;
		}
		in.close();
	}
}
