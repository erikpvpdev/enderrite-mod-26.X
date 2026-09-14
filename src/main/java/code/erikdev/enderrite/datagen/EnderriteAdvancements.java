package code.erikdev.enderrite.datagen;

import code.erikdev.enderrite.EnderriteMod;
import code.erikdev.enderrite.item.EnderriteItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.predicates.ItemPredicate;
import net.minecraft.advancements.triggers.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraft.data.advancements.AdvancementSubProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class EnderriteAdvancements extends AdvancementProvider {
    public EnderriteAdvancements(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, List.of(new TutorialModAdvancements()));
    }

    public static class TutorialModAdvancements implements AdvancementSubProvider {
        @Override
        public void generate(HolderLookup.Provider registries, Consumer<AdvancementHolder> output) {
            var items = registries.lookupOrThrow(Registries.ITEM);

            AdvancementHolder root = Advancement.Builder.advancement()
                    .display(
                            EnderriteItems.ENDERRITE,
                            Component.translatable("advancements.enderrite.root.title"),
                            Component.translatable("advancements.enderrite.root.description"),
                            Identifier.withDefaultNamespace("block/enderrite_block"),
                            AdvancementType.TASK,
                            false,
                            false,
                            false
                    )
                    .addCriterion("has_enderrite", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, EnderriteItems.ENDERRITE.asItem())))
                    .save(output, Identifier.fromNamespaceAndPath(EnderriteMod.MOD_ID, "enderrite/root"));

            AdvancementHolder Root = Advancement.Builder.advancement()
                    .display(
                            EnderriteItems.ENDERRITE_SWORD,
                            Component.translatable("advancements.enderrite.sword.title"),
                            Component.translatable("advancements.enderrite.sword.description"),
                            Identifier.withDefaultNamespace("block/enderrite_block"),
                            AdvancementType.TASK,
                            false,
                            false,
                            false
                    )
                    .addCriterion("has_enderrite", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(items, EnderriteItems.ENDERRITE.asItem())))
                    .save(output, Identifier.fromNamespaceAndPath(EnderriteMod.MOD_ID, "enderrite/sword"));

        }
    }
}
