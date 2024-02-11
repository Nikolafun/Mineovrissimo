
package net.mcreator.bebraroflpov.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.bebraroflpov.init.BebraRoflPovModTabs;

public class HitlerItem extends Item {
	public HitlerItem() {
		super(new Item.Properties().tab(BebraRoflPovModTabs.TAB_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
