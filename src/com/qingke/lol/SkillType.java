package com.qingke.lol;

import java.util.Scanner;

public class SkillType {
	public Skill getSkill(String skillType){
		Skill skill;
		switch(skillType){
			case "Q":
				skill = Skill.Q;
				break;
			case "W":
				skill = Skill.W;
				break;
			case "E":
				skill = Skill.E;
				break;
			case "R":
				skill = Skill.R;
				break;
			default:
				skill = Skill.N;
				break;
		}
		return skill;
	}
}
