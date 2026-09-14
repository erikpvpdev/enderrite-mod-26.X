package code.erikdev.enderrite.item;

import code.erikdev.enderrite.EnderriteMod;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

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


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
