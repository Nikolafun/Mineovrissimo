
package net.mcreator.bebraroflpov.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.bebraroflpov.init.BebraRoflPovModTabs;

public class DvorecvgelendshikeItem extends RecordItem {
	public DvorecvgelendshikeItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bebra_rofl_pov:govnida")), new Item.Properties().tab(BebraRoflPovModTabs.TAB_CREATIVE_TAB).stacksTo(1).rarity(Rarity.RARE), 4);
	}
}
