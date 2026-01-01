package net.identidade.crimsomania.datagen;

import net.identidade.crimsomania.Block.ModBlocks;
import net.identidade.crimsomania.Crimsomania;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Crimsomania.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
//        blockWithItem(ModBlocks.BLOODY_LOG);
//        blockWithItem(ModBlocks.BLOODY_MOUTH)

        blockWithItem(ModBlocks.BLOODY_PLANKS);
        blockWithItem(ModBlocks.FLESH_BLOCK);
        blockWithItem(ModBlocks.PULSAR_BULB);

        stairsBlock(ModBlocks.BLOODY_STAIRS.get(), blockTexture(ModBlocks.BLOODY_PLANKS.get()));
        slabBlock(ModBlocks.BLOODY_SLAB.get(), blockTexture(ModBlocks.BLOODY_PLANKS.get()), blockTexture(ModBlocks.BLOODY_PLANKS.get()));
        buttonBlock(ModBlocks.BLOODY_BUTTON.get(), blockTexture(ModBlocks.BLOODY_PLANKS.get()));
        fenceBlock(ModBlocks.BLOODY_FENCE.get(), blockTexture(ModBlocks.BLOODY_PLANKS.get()));
        fenceGateBlock(ModBlocks.BLOODY_FENCE_GATE.get(), blockTexture(ModBlocks.BLOODY_PLANKS.get()));
        pressurePlateBlock(ModBlocks.BLOODY_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BLOODY_PLANKS.get()));

        logBlock(ModBlocks.STRIPPED_BLOODY_LOG.get());
        axisBlock(ModBlocks.BLOODY_WOOD.get(), modLoc("block/bloody_log"), modLoc("block/bloody_log"));
        axisBlock(ModBlocks.STRIPPED_BLOODY_WOOD.get(), modLoc("block/stripped_bloody_log"), modLoc("block/stripped_bloody_log"));

        doorBlockWithRenderType(ModBlocks.BLOODY_DOOR.get(), modLoc("block/bloody_door_bottom"), modLoc("block/bloody_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.BLOODY_TRAPDOOR.get(), modLoc("block/bloody_trapdoor"), true, "cutout");

        blockItem(ModBlocks.BLOODY_LOG);
        blockItem(ModBlocks.STRIPPED_BLOODY_LOG);
        blockItem(ModBlocks.STRIPPED_BLOODY_WOOD);
        blockItem(ModBlocks.BLOODY_WOOD);
        blockItem(ModBlocks.BLOODY_PRESSURE_PLATE);
        blockItem(ModBlocks.BLOODY_STAIRS);
        blockItem(ModBlocks.BLOODY_SLAB);
        blockItem(ModBlocks.BLOODY_FENCE_GATE);
        blockItem(ModBlocks.BLOODY_TRAPDOOR, "_bottom");
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("crimsomania:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("crimsomania:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
