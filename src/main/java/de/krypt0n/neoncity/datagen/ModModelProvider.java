package de.krypt0n.neoncity.datagen;

import de.krypt0n.neoncity.block.ModBlocks;
import de.krypt0n.neoncity.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;



public class ModModelProvider extends FabricModelProvider {


    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Neon Lamps
        BlockStateModelGenerator.BlockTexturePool bluePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_NEON_LAMP);
        BlockStateModelGenerator.BlockTexturePool dbluePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_BLUE_NEON_LAMP);
        BlockStateModelGenerator.BlockTexturePool greenPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_NEON_LAMP);
        BlockStateModelGenerator.BlockTexturePool magentaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_NEON_LAMP);
        BlockStateModelGenerator.BlockTexturePool orangePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_NEON_LAMP);
        BlockStateModelGenerator.BlockTexturePool pinkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_NEON_LAMP);
        BlockStateModelGenerator.BlockTexturePool redPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_NEON_LAMP);
        BlockStateModelGenerator.BlockTexturePool whitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_NEON_LAMP);
        BlockStateModelGenerator.BlockTexturePool yellowPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_NEON_LAMP);

        //Neon Buttons
        bluePool.button(ModBlocks.BLUE_BUTTON);
        dbluePool.button(ModBlocks.DARK_BLUE_BUTTON);
        greenPool.button(ModBlocks.GREEN_BUTTON);
        magentaPool.button(ModBlocks.MAGENTA_BUTTON);
        orangePool.button(ModBlocks.ORANGE_BUTTON);
        pinkPool.button(ModBlocks.PINK_BUTTON);
        redPool.button(ModBlocks.RED_BUTTON);
        whitePool.button(ModBlocks.WHITE_BUTTON);
        yellowPool.button(ModBlocks.YELLOW_BUTTON);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.Logo, Models.GENERATED);
    }
}
