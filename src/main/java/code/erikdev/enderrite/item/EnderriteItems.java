package code.erikdev.enderrite.item;

import code.erikdev.enderrite.EnderriteMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static code.erikdev.enderrite.block.EnderriteBlocks.SPORE_TORCH;
import static code.erikdev.enderrite.block.EnderriteBlocks.SPORE_WALL_TORCH;

public class EnderriteItems {


    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EnderriteMod.MOD_ID);

    public static final DeferredItem<Item> ENDERRITE = ITEMS.registerSimpleItem("enderrite_ingot");
    public static final DeferredItem<Item> RAW_ENDERRITE = ITEMS.registerSimpleItem("raw_enderrite");

    public static final DeferredItem<Item> ENDERRITE_SWORD = ITEMS.registerItem("enderrite_sword",
            properties -> new Item(properties.sword(ModToolTiers.ENDERRITE, 3, -2.4f)));
    public static final DeferredItem<Item> ENDERRITE_PICKAXE = ITEMS.registerItem("enderrite_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolTiers.ENDERRITE, 1, -2.8f)));
    public static final DeferredItem<Item> ENDERRITE_SHOVEL = ITEMS.registerItem("enderrite_shovel",
            properties -> new ShovelItem(ModToolTiers.ENDERRITE, 1.5f, -3.0f, properties));
    public static final DeferredItem<Item> ENDERRITE_AXE = ITEMS.registerItem("enderrite_axe",
            properties -> new AxeItem(ModToolTiers.ENDERRITE, 6, -3.2f, properties));
    public static final DeferredItem<Item> ENDERRITE_HOE = ITEMS.registerItem("enderrite_hoe",
            properties -> new HoeItem(ModToolTiers.ENDERRITE, 0, -3.0f, properties));
    public static final DeferredItem<Item> ENDERRITE_SPEAR = ITEMS.registerItem("enderrite_spear",
            properties -> new Item(properties.spear(ModToolTiers.ENDERRITE, 0.95f, 0.7f, 0.7f,
                    3.5f, 13f, 8.5f, 5.1f, 13.37f, 4.67f)));

    public static final DeferredItem<Item> ENDERRITE_HELMET = ITEMS.registerItem("enderrite_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ENDERRITE_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> ENDERRITE_CHESTPLATE = ITEMS.registerItem("enderrite_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ENDERRITE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> ENDERRITE_LEGGINGS = ITEMS.registerItem("enderrite_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ENDERRITE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> ENDERRITE_BOOTS = ITEMS.registerItem("enderrite_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.ENDERRITE_ARMOR_MATERIAL, ArmorType.BOOTS)));



    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
