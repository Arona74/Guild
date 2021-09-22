package dev.fulmineo.guild.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.text.MutableText;
import net.minecraft.text.TranslatableText;

public class QuestProfession {
	public String name;
	public String icon;
	public int guildMasterLevel;
	public String levelsPool;
	public String[] taskPools;
	public String[] rewardPools;
	public List<QuestPoolData> tasks = new ArrayList<>();
	public List<QuestPoolData> rewards = new ArrayList<>();

	public void addTaskPool(QuestPool pool){
		tasks.addAll(Arrays.asList(pool.data));
	}

	public void addRewardPool(QuestPool pool){
		rewards.addAll(Arrays.asList(pool.data));
	}

	public MutableText getTranslatedName() {
		return new TranslatableText(getTranslationKey(this.name));
	}

	public static String getTranslationKey(String name) {
		return "profession."+name.replace(":", ".");
	}
}
