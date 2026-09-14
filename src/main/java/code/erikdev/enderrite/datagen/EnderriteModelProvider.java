package code.erikdev.enderrite.datagen;

import code.erikdev.enderrite.EnderriteMod;
import code.erikdev.enderrite.block.EnderriteBlocks;
import code.erikdev.enderrite.item.EnderriteItems;
import code.erikdev.enderrite.item.ModArmorMaterials;
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

        itemModels.generateFlatItem(EnderriteItems.ENDERRITE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(EnderriteItems.ENDERRITE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(EnderriteItems.ENDERRITE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(EnderriteItems.ENDERRITE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(EnderriteItems.ENDERRITE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateSpear(EnderriteItems.ENDERRITE_SPEAR.get());

        itemModels.generateTrimmableItem(EnderriteItems.ENDERRITE_HELMET.get(), ModArmorMaterials.ENDERRITE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(EnderriteItems.ENDERRITE_CHESTPLATE.get(), ModArmorMaterials.ENDERRITE_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModels.generateTrimmableItem(EnderriteItems.ENDERRITE_LEGGINGS.get(), ModArmorMaterials.ENDERRITE_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModels.generateTrimmableItem(EnderriteItems.ENDERRITE_BOOTS.get(), ModArmorMaterials.ENDERRITE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);


    }
}