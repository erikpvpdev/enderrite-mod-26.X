package code.erikdev.enderrite.block;

import code.erikdev.enderrite.EnderriteMod;
import code.erikdev.enderrite.block.custom.ModFlammableRotatedPillarBlock;
import code.erikdev.enderrite.item.EnderriteItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
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
                    .requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS)));

    public static final DeferredBlock<Block> ENDERRITE_ORE = registerBlock("enderrite_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 4), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> LIBRARIAN_TOME = registerBlock("librarian_tome",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> END_STONE_PILLARS = registerBlock("end_stone_pillar",
            properties -> new RotatedPillarBlock(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> CHORUS_LOG = registerBlock("chorus_log",
            properties -> new ModFlammableRotatedPillarBlock(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2f).sound(SoundType.CHERRY_WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> CHORUS_WOOD = registerBlock("chorus_wood",
            properties -> new ModFlammableRotatedPillarBlock(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2f).sound(SoundType.CHERRY_WOOD).ignitedByLava()));


    public static final DeferredBlock<Block> CHORUS_PLANKS = registerBlock("chorus_planks",
            properties -> new Block(properties.mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final DeferredBlock<Block> CHORUS_LEAVES = registerBlock("chorus_leaves",
            properties -> new UntintedParticleLeavesBlock(0.01f, ParticleTypes.CHERRY_LEAVES,
                    properties.mapColor(MapColor.METAL).strength(0.2F).randomTicks().sound(SoundType.GRASS)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).ignitedByLava().pushReaction(PushReaction.DESTROY)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final DeferredBlock<Block> CHORUS_STAIRS = registerBlock("chorus_stairs",
            properties -> new StairBlock(EnderriteBlocks.CHORUS_PLANKS.get().defaultBlockState(),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHORUS_SLAB = registerBlock("chorus_slab",
            properties -> new SlabBlock(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> CHORUS_PRESSURE_PLATE = registerBlock("chorus_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.CHERRY, properties
                    .mapColor(MapColor.COLOR_BLUE).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                    .requiresCorrectToolForDrops().noCollision().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> CHORUS_BUTTON = registerBlock("chorus_button",
            properties -> new ButtonBlock(BlockSetType.CHERRY, 20, properties
                    .noCollision().strength(0.5F).pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> CHORUS_FENCE = registerBlock("chorus_fence",
            properties -> new FenceBlock(properties.strength(2F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHORUS_FENCE_GATE = registerBlock("chorus_fence_gate",
            properties -> new FenceGateBlock(WoodType.CHERRY, properties.strength(2F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> CHORUS_DOOR = registerBlock("chorus_door",
            properties -> new DoorBlock(BlockSetType.CHERRY, properties.strength(2F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD).noOcclusion()));
    public static final DeferredBlock<Block> CHORUS_TRAPDOOR = registerBlock("chorus_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.CHERRY, properties.strength(2F)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD).noOcclusion()));

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

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