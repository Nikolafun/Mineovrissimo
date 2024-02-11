
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bebraroflpov.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BebraRoflPovModTabs {
	public static CreativeModeTab TAB_CREATIVE_TAB;

	public static void load() {
		TAB_CREATIVE_TAB = new CreativeModeTab("tabcreative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BebraRoflPovModBlocks.HITLERBLOCK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
