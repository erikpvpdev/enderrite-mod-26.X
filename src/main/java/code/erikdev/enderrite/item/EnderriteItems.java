package code.erikdev.enderrite.item;

import code.erikdev.enderrite.EnderriteMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EnderriteItems {


    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EnderriteMod.MOD_ID);

    public static final DeferredItem<Item> ENDERRITE = ITEMS.registerSimpleItem("enderrite_ingot");
    public static final DeferredItem<Item> RAW_ENDERRITE = ITEMS.registerSimpleItem("raw_enderrite");


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
