
package net.mcreator.bebraroflpov.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AK47AmmoItem extends Item {
	public AK47AmmoItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
