package de.krypt0n.neoncity.block;

import de.krypt0n.neoncity.NeonCity;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.EndRodBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLUE_NEON_LAMP = registerBlocks("blue_neon_lamp",
            new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).luminance(state -> 20)));
    public static final Block GREEN_NEON_LAMP = registerBlocks("green_neon_lamp",
            new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).luminance(state -> 20)));
    public static final Block MAGENTA_NEON_LAMP = registerBlocks("magenta_neon_lamp",
            new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).luminance(state -> 20)));
    public static final Block ORANGE_NEON_LAMP = registerBlocks("orange_neon_lamp",
            new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).luminance(state -> 20)));
    public static final Block PINK_NEON_LAMP = registerBlocks("pink_neon_lamp",
            new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).luminance(state -> 20)));
    public static final Block RED_NEON_LAMP = registerBlocks("red_neon_lamp",
            new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).luminance(state -> 20)));
    public static final Block WHITE_NEON_LAMP = registerBlocks("white_neon_lamp",
            new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).luminance(state -> 20)));
    public static final Block YELLOW_NEON_LAMP = registerBlocks("yellow_neon_lamp",
            new Block(FabricBlockSettings.copy(Blocks.SEA_LANTERN).luminance(state -> 20)));

    public static final Block BLUE_ROD = registerBlocks("blue_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD).luminance(state -> 20)));
    public static final Block GREEN_ROD = registerBlocks("green_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD).luminance(state -> 20)));
    public static final Block MAGENTA_ROD = registerBlocks("magenta_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD).luminance(state -> 20)));
    public static final Block ORANGE_ROD = registerBlocks("orange_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD).luminance(state -> 20)));
    public static final Block PINK_ROD = registerBlocks("pink_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD).luminance(state -> 20)));
    public static final Block RED_ROD = registerBlocks("red_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD).luminance(state -> 20)));
    public static final Block WHITE_ROD = registerBlocks("white_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD).luminance(state -> 20)));
    public static final Block YELLOW_ROD = registerBlocks("yellow_rod",
            new EndRodBlock(FabricBlockSettings.copy(Blocks.END_ROD).luminance(state -> 20)));


    private static Block registerBlocks(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NeonCity.MOD_ID, name),
                block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NeonCity.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {

        NeonCity.LOGGER.info("Registering Modblocks");
    }
}