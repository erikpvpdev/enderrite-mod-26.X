package code.erikdev.enderrite.datagen;

import code.erikdev.enderrite.block.EnderriteBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Strippable;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    public ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {
        builder(NeoForgeDataMaps.STRIPPABLES)
                       .add(EnderriteBlocks.CHORUS_LOG, new Strippable(EnderriteBlocks.STRIPPED_CHORUS_LOG.get()), false)
                        .add(EnderriteBlocks.CHORUS_WOOD, new Strippable(EnderriteBlocks.STRIPPED_CHORUS_WOOD.get()), false);
    }
}