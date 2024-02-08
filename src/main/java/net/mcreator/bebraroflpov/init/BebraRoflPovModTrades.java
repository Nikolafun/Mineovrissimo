
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.bebraroflpov.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BebraRoflPovModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == BebraRoflPovModVillagerProfessions.EVREITRADE.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(BebraRoflPovModItems.HAMASHEAD.get(), 16),

					new ItemStack(BebraRoflPovModItems.EVREESHIGATOR.get()), 10, 5, 0.05f));
		}
	}
}
