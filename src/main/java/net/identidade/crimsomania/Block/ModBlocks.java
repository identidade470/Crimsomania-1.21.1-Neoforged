package net.identidade.crimsomania.Block;

import net.identidade.crimsomania.Block.custom.FleshPlantBlock;
import net.identidade.crimsomania.Block.custom.BloodyLogBlock;
import net.identidade.crimsomania.Block.custom.BloodyWoodBlock;
import net.identidade.crimsomania.Crimsomania;
import net.identidade.crimsomania.Item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Crimsomania.MOD_ID);

//    public static final DeferredBlock<Block> BLOODY_MOUTH = registerBlock("bloody_mouth",
//            () -> new BloodyMouthBlock(BlockBehaviour.Properties.of()
//                    .strength(1.5f)
//                    .sound(SoundType.HONEY_BLOCK)));
//
    public static final DeferredBlock<RotatedPillarBlock> BLOODY_LOG = registerBlock("bloody_log",
            () -> new BloodyLogBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<RotatedPillarBlock> BLOODY_WOOD = registerBlock("bloody_wood",
            () -> new BloodyWoodBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_BLOODY_LOG = registerBlock("stripped_bloody_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_BLOODY_WOOD = registerBlock("stripped_bloody_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<Block> BLOODY_PLANKS = registerBlock("bloody_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0f, 3.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<StairBlock> BLOODY_STAIRS = registerBlock("bloody_stairs",
            () -> new StairBlock(ModBlocks.BLOODY_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_RED)
                            .strength(2.0f)
                            .sound(SoundType.WOOD)
                            .ignitedByLava()));
    public static final DeferredBlock<SlabBlock> BLOODY_SLAB = registerBlock("bloody_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(2.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<ButtonBlock> BLOODY_BUTTON = registerBlock("bloody_button",
            () -> new ButtonBlock(BlockSetType.CRIMSON, 20,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_RED)
                            .strength(2.0f)
                            .sound(SoundType.WOOD)
                            .noCollission()
                            .ignitedByLava()));

    public static final DeferredBlock<FenceBlock> BLOODY_FENCE = registerBlock("bloody_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(2.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final DeferredBlock<FenceGateBlock> BLOODY_FENCE_GATE = registerBlock("bloody_fence_gate",
            () -> new FenceGateBlock(WoodType.CRIMSON,BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(2.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<DoorBlock> BLOODY_DOOR = registerBlock("bloody_door",
            () -> new DoorBlock(BlockSetType.CRIMSON, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(2.0f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
                    .ignitedByLava()));

    public static final DeferredBlock<TrapDoorBlock> BLOODY_TRAPDOOR = registerBlock("bloody_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.CRIMSON, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(2.0f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
                    .ignitedByLava()));

    public static final DeferredBlock<PressurePlateBlock> BLOODY_PRESSURE_PLATE = registerBlock("bloody_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.CRIMSON, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(2.0f)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<FleshPlantBlock> FLESH_PLANT = registerBlock("flesh_plant",
            () -> new FleshPlantBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .sound(SoundType.HONEY_BLOCK)
                    .noOcclusion()
                    .strength(2.0f)));

    public static final DeferredBlock<Block> FLESH_BLOCK = registerBlock("flesh_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .sound(SoundType.HONEY_BLOCK)
                    .strength(2.0f)));

    public static final DeferredBlock<Block> PULSAR_BULB = registerBlock("pulsar_bulb",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .sound(SoundType.HONEY_BLOCK)
                    .lightLevel(state -> 14)
                    .strength(2.0f)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
