package code.erikdev.enderrite.datagen;

import code.erikdev.enderrite.EnderriteMod;
import code.erikdev.enderrite.block.EnderriteBlocks;
import code.erikdev.enderrite.item.EnderriteItems;
import code.erikdev.enderrite.item.ModArmorMaterials;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;

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

        blockModels.createLantern(
                EnderriteBlocks.SPORE_LANTERN.get()
        );

        blockModels.createTrivialBlock(
                EnderriteBlocks.END_GRASS.get(),
                TexturedModel.createDefault(
                        block -> new TextureMapping()
                                .put(
                                        TextureSlot.TOP,
                                        new Material(
                                                Identifier.fromNamespaceAndPath(
                                                        EnderriteMod.MOD_ID,
                                                        "block/end_grass_top"
                                                )
                                        )
                                )
                                .put(
                                        TextureSlot.SIDE,
                                        new Material(
                                                Identifier.fromNamespaceAndPath(
                                                        EnderriteMod.MOD_ID,
                                                        "block/end_grass_side"
                                                )
                                        )
                                )
                                .put(
                                        TextureSlot.BOTTOM,
                                        new Material(
                                                Identifier.fromNamespaceAndPath(
                                                        EnderriteMod.MOD_ID,
                                                        "block/end_grass_bottom"
                                                )
                                        )
                                ),
                        ModelTemplates.CUBE_BOTTOM_TOP
                )
        );

        blockModels.createCrossBlock(
                EnderriteBlocks.GRASS.get(),
                BlockModelGenerators.PlantType.NOT_TINTED
        );
        itemModels.generateFlatItem(
                EnderriteBlocks.GRASS.asItem(),
                ModelTemplates.FLAT_ITEM
        );
        blockModels.createCrossBlock(
                EnderriteBlocks.END_SPORE.get(),
                BlockModelGenerators.PlantType.NOT_TINTED
        );
        itemModels.generateFlatItem(
                EnderriteBlocks.END_SPORE.asItem(),
                ModelTemplates.FLAT_ITEM
        );blockModels.createCrossBlock(
                EnderriteBlocks.CHORUS_ROOTS.get(),
                BlockModelGenerators.PlantType.NOT_TINTED
        );
        itemModels.generateFlatItem(
                EnderriteBlocks.CHORUS_ROOTS.asItem(),
                ModelTemplates.FLAT_ITEM
        );


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