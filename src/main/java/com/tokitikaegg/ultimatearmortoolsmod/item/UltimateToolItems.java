package com.tokitikaegg.ultimatearmortoolsmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class UltimateToolItems {
    public static final SwordItem ULTIMATE_SWORD = new SwordItem(ToolMaterial.DIAMOND, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ToolItem ULTIMATE_PICKAXE = new ToolItem(ToolMaterial.DIAMOND, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem ULTIMATE_AXE = new ToolItem(ToolMaterial.DIAMOND, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem ULTIMATE_SHOVEL = new ToolItem(ToolMaterial.DIAMOND, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem ULTIMATE_HOE = new ToolItem(ToolMaterial.DIAMOND, new Item.Settings().group(ItemGroup.TOOLS));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("ultimatearmortoolsmod", "ultimate_sword"), ULTIMATE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("ultimatearmortoolsmod", "ultimate_pickaxe"), ULTIMATE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("ultimatearmortoolsmod", "ultimate_axe"), ULTIMATE_AXE);
        Registry.register(Registry.ITEM, new Identifier("ultimatearmortoolsmod", "ultimate_shovel"), ULTIMATE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("ultimatearmortoolsmod", "ultimate_hoe"), ULTIMATE_HOE);
    }
}