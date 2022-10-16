package net.jankoy.practicemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jankoy.practicemod.PracticeMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ZIRCIUM = registerItem("zircium",
            new Item(new FabricItemSettings().group(ModItemGroup.ZIRCIUM)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PracticeMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PracticeMod.LOGGER.debug("Registering Mod Items for " + PracticeMod.MOD_ID);
    }
}
