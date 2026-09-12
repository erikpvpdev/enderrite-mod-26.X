package code.erikdev.enderrite.creativemodetab;

import code.erikdev.enderrite.EnderriteMod;
import code.erikdev.enderrite.block.EnderriteBlocks;
import code.erikdev.enderrite.item.EnderriteItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EnderriteCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EnderriteMod.MOD_ID);

    public static final Supplier<CreativeModeTab> AZURITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("enderrite_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(EnderriteItems.ENDERRITE.get()))
                    .title(Component.translatable("itemGroup.enderrite"))
                    .withTabsBefore(CreativeModeTabs.INGREDIENTS)
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(EnderriteItems.ENDERRITE);
                        output.accept(EnderriteItems.RAW_ENDERRITE);
                        output.accept(EnderriteBlocks.ENDERRITE_BLOCK);
                        output.accept(EnderriteBlocks.RAW_ENDERRITE_BLOCK);

                        output.accept(EnderriteBlocks.ENDERRITE_ORE);


                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}