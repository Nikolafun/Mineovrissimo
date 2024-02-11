
package net.mcreator.bebraroflpov.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.bebraroflpov.init.BebraRoflPovModTabs;

public class AK47AmmoItem extends Item {
	public AK47AmmoItem() {
		super(new Item.Properties().tab(BebraRoflPovModTabs.TAB_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
