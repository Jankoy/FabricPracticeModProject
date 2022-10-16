package net.jankoy.practicemod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jankoy.practicemod.PracticeMod;
import net.jankoy.practicemod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block ZIRCIUM_BLOCK = registerBlock("zircium_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ZIRCIUM);
    public static final Block ZIRCIUM_ORE = registerBlock("zircium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.ZIRCIUM);
    public static final Block DEEPSLATE_ZIRCIUM_ORE = registerBlock("deepslate_zircium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.ZIRCIUM);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(PracticeMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(PracticeMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        PracticeMod.LOGGER.debug("Registering Mod Blocks for " + PracticeMod.MOD_ID);
    }
}
