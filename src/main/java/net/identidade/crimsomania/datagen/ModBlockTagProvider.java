package net.identidade.crimsomania.datagen;

import net.identidade.crimsomania.Block.ModBlocks;
import net.identidade.crimsomania.Crimsomania;
import net.identidade.crimsomania.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Crimsomania.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Blocks.BLOODY_LOGS)
                .add(ModBlocks.STRIPPED_BLOODY_WOOD.get())
                .add(ModBlocks.STRIPPED_BLOODY_LOG.get())
                .add(ModBlocks.BLOODY_WOOD.get())
                .add(ModBlocks.BLOODY_LOG.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.STRIPPED_BLOODY_WOOD.get())
                .add(ModBlocks.STRIPPED_BLOODY_LOG.get())
                .add(ModBlocks.BLOODY_LOG.get())
                .add(ModBlocks.BLOODY_WOOD.get())
                .add(ModBlocks.BLOODY_PLANKS.get());

        tag(BlockTags.PLANKS)
                .add(ModBlocks.BLOODY_PLANKS.get());

        tag(BlockTags.FENCES)
                .add(ModBlocks.BLOODY_FENCE.get());
        tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.BLOODY_FENCE.get());
        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.BLOODY_FENCE_GATE.get());
    }
}
