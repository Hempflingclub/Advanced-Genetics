package com.technovision.advancedgenetics.registry;

import com.technovision.advancedgenetics.AdvancedGenetics;
import com.technovision.advancedgenetics.item.ScalpelItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    private static final FabricItemSettings ITEM_SETTINGS = new FabricItemSettings().group(AdvancedGenetics.TAB);

    public static final ScalpelItem METAL_SCALPEL = new ScalpelItem(25);
    public static final ScalpelItem DIAMOND_SCALPEL = new ScalpelItem(150);
    public static final Item COW_MATTER = new Item(ITEM_SETTINGS);

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(AdvancedGenetics.MOD_ID, "metal_scalpel"), METAL_SCALPEL);
        Registry.register(Registry.ITEM, new Identifier(AdvancedGenetics.MOD_ID, "diamond_scalpel"), DIAMOND_SCALPEL);
        Registry.register(Registry.ITEM, new Identifier(AdvancedGenetics.MOD_ID, "cow_matter"), COW_MATTER);
    }
}
