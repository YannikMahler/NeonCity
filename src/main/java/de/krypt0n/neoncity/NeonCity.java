package de.krypt0n.neoncity;

import de.krypt0n.neoncity.block.ModBlocks;
import de.krypt0n.neoncity.item.ModItemGroups;
import de.krypt0n.neoncity.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NeonCity implements ModInitializer {
	public static final String MOD_ID = "neoncity";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}