package net.identidade.crimsomania.datagen;

import net.identidade.crimsomania.Block.ModBlocks;
import net.identidade.crimsomania.Item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
//        dropSelf(ModBlocks.BLOODY_LOG.get());

        add(ModBlocks.BLOODY_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLOODY_SLAB.get()));

        add(ModBlocks.BLOODY_DOOR.get(),
                block -> createDoorTable(ModBlocks.BLOODY_DOOR.get()));

        dropSelf(ModBlocks.BLOODY_LOG.get());
        dropSelf(ModBlocks.BLOODY_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_BLOODY_LOG.get());
        dropSelf(ModBlocks.STRIPPED_BLOODY_WOOD.get());
        dropSelf(ModBlocks.BLOODY_PLANKS.get());
        dropSelf(ModBlocks.BLOODY_STAIRS.get());
        dropSelf(ModBlocks.BLOODY_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BLOODY_BUTTON.get());
        dropSelf(ModBlocks.BLOODY_FENCE.get());
        dropSelf(ModBlocks.BLOODY_FENCE_GATE.get());
        dropSelf(ModBlocks.BLOODY_TRAPDOOR.get());
        dropSelf(ModBlocks.FLESH_BLOCK.get());
        dropSelf(ModBlocks.PULSAR_BULB.get());

        dropOther(ModBlocks.FLESH_PLANT.get(), ModItems.RAW_FLESH_PLANT.get());

//        add(ModBlocks.BLOODY_MOUTH.get(),
//                block -> createSilkTouchOnlyTable(ModBlocks.BLOODY_MOUTH.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
