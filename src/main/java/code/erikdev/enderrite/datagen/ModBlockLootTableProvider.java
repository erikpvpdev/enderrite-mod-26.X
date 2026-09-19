package code.erikdev.enderrite.datagen;

import code.erikdev.enderrite.block.EnderriteBlocks;
import code.erikdev.enderrite.item.EnderriteItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(EnderriteBlocks.ENDERRITE_BLOCK.get());
        dropSelf(EnderriteBlocks.RAW_ENDERRITE_BLOCK.get());
        dropSelf(EnderriteBlocks.LIBRARIAN_TOME.get());
        dropSelf(EnderriteBlocks.CHORUS_PLANKS.get());
        dropSelf(EnderriteBlocks.CHORUS_LOG.get());
        dropSelf(EnderriteBlocks.CHORUS_WOOD.get());
        dropSelf(EnderriteBlocks.STRIPPED_CHORUS_LOG.get());
        dropSelf(EnderriteBlocks.STRIPPED_CHORUS_WOOD.get());
        dropSelf(EnderriteBlocks.CHORUS_STAIRS.get());
        add(EnderriteBlocks.CHORUS_SLAB.get(), this::createSlabItemTable);

        dropSelf(EnderriteBlocks.CHORUS_PRESSURE_PLATE.get());
        dropSelf(EnderriteBlocks.CHORUS_BUTTON.get());
        dropSelf(EnderriteBlocks.CHORUS_FENCE.get());
        dropSelf(EnderriteBlocks.CHORUS_FENCE_GATE.get());
        dropSelf(EnderriteBlocks.CHORUS_TRAPDOOR.get());
        dropSelf(EnderriteBlocks.CHORUS_DOOR.get());
        dropSelf(EnderriteBlocks.END_STONE_PILLARS.get());
        dropSelf(EnderriteBlocks.CRACKED_END_STONE_BRICKS.get());

        add(EnderriteBlocks.ENDERRITE_ORE.get(),
                createOreDrop(EnderriteBlocks.ENDERRITE_ORE.get(), EnderriteItems.RAW_ENDERRITE.get()));

        add(EnderriteBlocks.CHORUS_LEAVES.get(), block -> createLeavesDrops(block, EnderriteBlocks.CHORUS_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));

    }

    protected LootTable.Builder createMultipleOreDrops(Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(block,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return EnderriteBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}