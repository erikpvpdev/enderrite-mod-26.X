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

    public static final Supplier<CreativeModeTab> ENDERRITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("enderrite_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(EnderriteItems.ENDERRITE.get()))
                    .title(Component.translatable("itemGroup.enderrite"))
                    .withTabsBefore(CreativeModeTabs.INGREDIENTS)
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(EnderriteItems.ENDERRITE);
                        output.accept(EnderriteItems.RAW_ENDERRITE);
                        output.accept(EnderriteBlocks.ENDERRITE_BLOCK);
                        output.accept(EnderriteBlocks.RAW_ENDERRITE_BLOCK);
                        output.accept(EnderriteBlocks.LIBRARIAN_TOME);

                        output.accept(EnderriteBlocks.ENDERRITE_ORE);

                        output.accept(EnderriteItems.ENDERRITE_SWORD);
                        output.accept(EnderriteItems.ENDERRITE_PICKAXE);
                        output.accept(EnderriteItems.ENDERRITE_SHOVEL);
                        output.accept(EnderriteItems.ENDERRITE_AXE);

                        output.accept(EnderriteItems.ENDERRITE_HOE);
                        output.accept(EnderriteItems.ENDERRITE_SPEAR);


                        output.accept(EnderriteItems.ENDERRITE_HELMET);
                        output.accept(EnderriteItems.ENDERRITE_CHESTPLATE);
                        output.accept(EnderriteItems.ENDERRITE_LEGGINGS);
                        output.accept(EnderriteItems.ENDERRITE_BOOTS);



                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}