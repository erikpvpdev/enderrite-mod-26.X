package code.erikdev.enderrite.block;

import code.erikdev.enderrite.EnderriteMod;
import code.erikdev.enderrite.item.EnderriteItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class EnderriteBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(EnderriteMod.MOD_ID);

    public static final DeferredBlock<Block> ENDERRITE_BLOCK = registerBlock("enderrite_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));
    public static final DeferredBlock<Block> RAW_ENDERRITE_BLOCK = registerBlock("raw_enderrite_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));

    public static final DeferredBlock<Block> ENDERRITE_ORE = registerBlock("enderrite_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 4), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        EnderriteItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}