package com.tokitikaegg.ultimatearmortoolsmod.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class UltimateArmorItems {
    public static final ArmorItem ULTIMATE_HELMET = new ArmorItem(ArmorMaterial.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem ULTIMATE_CHESTPLATE = new ArmorItem(ArmorMaterial.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem ULTIMATE_LEGGINGS = new ArmorItem(ArmorMaterial.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem ULTIMATE_BOOTS = new ArmorItem(ArmorMaterial.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings().group(ItemGroup.COMBAT));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("ultimatearmortoolsmod", "ultimate_helmet"), ULTIMATE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("ultimatearmortoolsmod", "ultimate_chestplate"), ULTIMATE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("ultimatearmortoolsmod", "ultimate_leggings"), ULTIMATE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("ultimatearmortoolsmod", "ultimate_boots"), ULTIMATE_BOOTS);
    }
}