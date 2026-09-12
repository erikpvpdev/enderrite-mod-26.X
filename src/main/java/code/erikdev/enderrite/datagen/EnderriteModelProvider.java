package code.erikdev.enderrite.datagen;

import code.erikdev.enderrite.EnderriteMod;
import code.erikdev.enderrite.block.EnderriteBlocks;
import code.erikdev.enderrite.item.EnderriteItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class EnderriteModelProvider extends ModelProvider {
    public EnderriteModelProvider(PackOutput output) {
        super(output, EnderriteMod.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(EnderriteItems.ENDERRITE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EnderriteItems.RAW_ENDERRITE.get(), ModelTemplates.FLAT_ITEM);

        blockModels.createTrivialCube(EnderriteBlocks.ENDERRITE_BLOCK.get());
        blockModels.createTrivialCube(EnderriteBlocks.RAW_ENDERRITE_BLOCK.get());
        blockModels.createTrivialCube(EnderriteBlocks.ENDERRITE_ORE.get());


    }
}