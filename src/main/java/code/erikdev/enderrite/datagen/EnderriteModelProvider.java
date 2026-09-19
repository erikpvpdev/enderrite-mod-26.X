package code.erikdev.enderrite.datagen;

import code.erikdev.enderrite.EnderriteMod;
import code.erikdev.enderrite.block.EnderriteBlocks;
import code.erikdev.enderrite.item.EnderriteItems;
import code.erikdev.enderrite.item.ModArmorMaterials;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
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
        blockModels.createTrivialCube(EnderriteBlocks.LIBRARIAN_TOME.get());
        blockModels.createTrivialCube(EnderriteBlocks.CRACKED_END_STONE_BRICKS.get());
        blockModels.createRotatedPillarWithHorizontalVariant(
                EnderriteBlocks.END_STONE_PILLARS.get(),
                TexturedModel.COLUMN_ALT,
                TexturedModel.COLUMN_HORIZONTAL_ALT
        );
        blockModels.woodProvider(EnderriteBlocks.CHORUS_LOG.get()).logWithHorizontal(EnderriteBlocks.CHORUS_LOG.get()).wood(EnderriteBlocks.CHORUS_WOOD.get());
        blockModels.woodProvider(EnderriteBlocks.STRIPPED_CHORUS_LOG.get()).logWithHorizontal(EnderriteBlocks.STRIPPED_CHORUS_LOG.get()).wood(EnderriteBlocks.STRIPPED_CHORUS_WOOD.get());
        blockModels.createTintedLeaves(EnderriteBlocks.CHORUS_LEAVES.get(), TexturedModel.LEAVES, -12012265);
        blockModels.family(EnderriteBlocks.CHORUS_PLANKS.get())
                .stairs(EnderriteBlocks.CHORUS_STAIRS.get())
                .slab(EnderriteBlocks.CHORUS_SLAB.get())
                .pressurePlate(EnderriteBlocks.CHORUS_PRESSURE_PLATE.get())
                .button(EnderriteBlocks.CHORUS_BUTTON.get())
                .fence(EnderriteBlocks.CHORUS_FENCE.get())
                .fenceGate(EnderriteBlocks.CHORUS_FENCE_GATE.get())
                .door(EnderriteBlocks.CHORUS_DOOR.get())
                .trapdoor(EnderriteBlocks.CHORUS_TRAPDOOR.get());

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