package code.erikdev.enderrite.datagen;

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
        //builder(NeoForgeDataMaps.STRIPPABLES)
        //                .add(ModBlocks.DRIFTWOOD_LOG, new Strippable(ModBlocks.STRIPPED_DRIFTWOOD_LOG.get()), false)
        //                .add(ModBlocks.DRIFTWOOD_WOOD, new Strippable(ModBlocks.STRIPPED_DRIFTWOOD_WOOD.get()), false);
    }
}