package code.erikdev.enderrite.tags;

import code.erikdev.enderrite.EnderriteMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.trading.VillagerTrade;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTABLES = createTag("metal_detectables");

        public static final TagKey<Block> NEEDS_ENDERRITE_TOOL = createTag("needs_enderrite_tool");
        public static final TagKey<Block> INCORRECT_FOR_ENDERRITE_TOOL = createTag("incorrect_for_enderrite_tool");


        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(EnderriteMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        public static final TagKey<Item> ENDERRITE_REPAIRABLE = createTag("enderrite_repairable");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(EnderriteMod.MOD_ID, name));
        }
    }
}