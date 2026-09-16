package code.erikdev.enderrite.datagen;

import code.erikdev.enderrite.EnderriteMod;
import code.erikdev.enderrite.block.EnderriteBlocks;
import code.erikdev.enderrite.item.EnderriteItems;
import code.erikdev.enderrite.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.references.BlockItemId;
import net.minecraft.references.BlockItemIds;
import net.minecraft.references.ItemIds;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, EnderriteMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ItemIds.IRON_INGOT)
                .add(BlockItemIds.REDSTONE_DUST.item())
                .add(ItemIds.COPPER_INGOT)
                .add(EnderriteItems.getRK(EnderriteItems.ENDERRITE.get()));

        tag(ModTags.Items.ENDERRITE_REPAIRABLE)
                .add(EnderriteItems.getRK(EnderriteItems.ENDERRITE.get()));

        tag(ItemTags.SWORDS).add(EnderriteItems.getRK(EnderriteItems.ENDERRITE_SWORD.get()));
        tag(ItemTags.PICKAXES).add(EnderriteItems.getRK(EnderriteItems.ENDERRITE_PICKAXE.get()));
        tag(ItemTags.SHOVELS).add(EnderriteItems.getRK(EnderriteItems.ENDERRITE_SHOVEL.get()));
        tag(ItemTags.AXES).add(EnderriteItems.getRK(EnderriteItems.ENDERRITE_AXE.get()));
        tag(ItemTags.HOES).add(EnderriteItems.getRK(EnderriteItems.ENDERRITE_HOE.get()));
        tag(ItemTags.SPEARS).add(EnderriteItems.getRK(EnderriteItems.ENDERRITE_SPEAR.get()));

        tag(ItemTags.HEAD_ARMOR).add(EnderriteItems.getRK(EnderriteItems.ENDERRITE_HELMET.get()));
        tag(ItemTags.CHEST_ARMOR).add(EnderriteItems.getRK(EnderriteItems.ENDERRITE_CHESTPLATE.get()));
        tag(ItemTags.LEG_ARMOR).add(EnderriteItems.getRK(EnderriteItems.ENDERRITE_LEGGINGS.get()));
        tag(ItemTags.FOOT_ARMOR).add(EnderriteItems.getRK(EnderriteItems.ENDERRITE_BOOTS.get()));

        tag(ItemTags.PLANKS)
                .add(EnderriteItems.getRK(EnderriteBlocks.CHORUS_PLANKS.asItem()));

        tag(ItemTags.LOGS_THAT_BURN)
                .add(EnderriteItems.getRK(EnderriteBlocks.CHORUS_LOG.asItem()))
                .add(EnderriteItems.getRK(EnderriteBlocks.CHORUS_WOOD.asItem()));

        tag(ModTags.Items.CHORUS_LOGS)
                .add(EnderriteItems.getRK(EnderriteBlocks.CHORUS_LOG.asItem()))
                .add(EnderriteItems.getRK(EnderriteBlocks.CHORUS_WOOD.asItem()));
    }
}