package de.krypt0n.neoncity.item;

import de.krypt0n.neoncity.NeonCity;
import de.krypt0n.neoncity.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup Neon_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NeonCity.MOD_ID, "neon"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.neon"))
                    .icon(() -> new ItemStack(ModItems.Logo)).entries((displayContext, entries) -> {
                        //1st Row
                        entries.add(ModBlocks.BLUE_NEON_LAMP);
                        entries.add(ModBlocks.DARK_BLUE_NEON_LAMP);
                        entries.add(ModBlocks.GREEN_NEON_LAMP);
                        entries.add(ModBlocks.MAGENTA_NEON_LAMP);
                        entries.add(ModBlocks.ORANGE_NEON_LAMP);
                        entries.add(ModBlocks.PINK_NEON_LAMP);
                        entries.add(ModBlocks.RED_NEON_LAMP);
                        entries.add(ModBlocks.WHITE_NEON_LAMP);
                        entries.add(ModBlocks.YELLOW_NEON_LAMP);
                        //2nd Row
                        entries.add(ModBlocks.BLUE_ROD);
                        entries.add(ModBlocks.DARK_BLUE_ROD);
                        entries.add(ModBlocks.GREEN_ROD);
                        entries.add(ModBlocks.MAGENTA_ROD);
                        entries.add(ModBlocks.ORANGE_ROD);
                        entries.add(ModBlocks.PINK_ROD);
                        entries.add(ModBlocks.RED_ROD);
                        entries.add(ModBlocks.WHITE_ROD);
                        entries.add(ModBlocks.YELLOW_ROD);


                        entries.add(ModBlocks.BLUE_BUTTON);
                        entries.add(ModBlocks.DARK_BLUE_BUTTON);
                        entries.add(ModBlocks.GREEN_BUTTON);
                        entries.add(ModBlocks.MAGENTA_BUTTON);
                        entries.add(ModBlocks.ORANGE_BUTTON);
                        entries.add(ModBlocks.PINK_BUTTON);
                        entries.add(ModBlocks.RED_BUTTON);
                        entries.add(ModBlocks.WHITE_BUTTON);
                        entries.add(ModBlocks.YELLOW_BUTTON);

                    }).build());

    public static void registerItemGroups() {
        NeonCity.LOGGER.info("Registering Item Groups for " + NeonCity.MOD_ID);
    }
}
