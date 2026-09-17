package code.erikdev.enderrite.datagen;

import code.erikdev.enderrite.EnderriteMod;
import code.erikdev.enderrite.block.EnderriteBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, EnderriteMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(EnderriteBlocks.getRK(EnderriteBlocks.ENDERRITE_BLOCK.get()))
                .add(EnderriteBlocks.getRK(EnderriteBlocks.RAW_ENDERRITE_BLOCK.get()))
                .add(EnderriteBlocks.getRK(EnderriteBlocks.ENDERRITE_ORE.get()))
                .add(EnderriteBlocks.getRK(EnderriteBlocks.CRACKED_END_STONE_BRICKS.get()))
                .add(EnderriteBlocks.getRK(EnderriteBlocks.END_STONE_PILLARS.get()));


        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(EnderriteBlocks.getRK(EnderriteBlocks.ENDERRITE_ORE.get()))
                .add(EnderriteBlocks.getRK(EnderriteBlocks.LIBRARIAN_TOME.get()));

        tag(BlockTags.LEAVES)
                .add(EnderriteBlocks.CHORUS_LEAVES.getKey());
        tag(BlockTags.PLANKS)
                .add(EnderriteBlocks.CHORUS_PLANKS.getKey());
        tag(BlockItemTags.LOGS_THAT_BURN.block())
                .add(EnderriteBlocks.CHORUS_LOG.getKey())
                .add(EnderriteBlocks.CHORUS_WOOD.getKey());
        tag(BlockTags.STAIRS)
                .add(EnderriteBlocks.getRK(EnderriteBlocks.CHORUS_STAIRS.get()));
        tag(BlockTags.SLABS)
                .add(EnderriteBlocks.getRK(EnderriteBlocks.CHORUS_SLAB.get()));
        tag(BlockTags.PRESSURE_PLATES)
                .add(EnderriteBlocks.getRK(EnderriteBlocks.CHORUS_PRESSURE_PLATE.get()));
        tag(BlockTags.BUTTONS)
                .add(EnderriteBlocks.getRK(EnderriteBlocks.CHORUS_BUTTON.get()));

        tag(BlockTags.FENCES).add(EnderriteBlocks.getRK(EnderriteBlocks.CHORUS_FENCE.get()));
        tag(BlockTags.FENCE_GATES).add(EnderriteBlocks.getRK(EnderriteBlocks.CHORUS_FENCE_GATE.get()));

        tag(BlockTags.DOORS).add(EnderriteBlocks.getRK(EnderriteBlocks.CHORUS_DOOR.get()));
        tag(BlockTags.TRAPDOORS).add(EnderriteBlocks.getRK(EnderriteBlocks.CHORUS_TRAPDOOR.get()));
    }
}