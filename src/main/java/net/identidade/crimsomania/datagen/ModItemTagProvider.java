package net.identidade.crimsomania.datagen;

import net.identidade.crimsomania.Block.ModBlocks;
import net.identidade.crimsomania.Crimsomania;
import net.identidade.crimsomania.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Crimsomania.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.BLOODY_LOGS)
                .add(ModBlocks.STRIPPED_BLOODY_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BLOODY_LOG.asItem())
                .add(ModBlocks.BLOODY_WOOD.asItem())
                .add(ModBlocks.BLOODY_LOG.asItem());

        tag(ItemTags.PLANKS)
                .add(ModBlocks.BLOODY_PLANKS.asItem());
    }
}
