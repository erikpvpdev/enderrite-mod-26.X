package code.erikdev.enderrite.datagen;

import code.erikdev.enderrite.EnderriteMod;
import code.erikdev.enderrite.block.EnderriteBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
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
                .add(EnderriteBlocks.getRK(EnderriteBlocks.ENDERRITE_ORE.get()));

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(EnderriteBlocks.getRK(EnderriteBlocks.ENDERRITE_ORE.get()));
    }
}