package net.jankoy.practicemod;

import net.fabricmc.api.ModInitializer;
import net.jankoy.practicemod.block.ModBlocks;
import net.jankoy.practicemod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PracticeMod implements ModInitializer {
	public static final String MOD_ID = "practicemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
