package net.identidade.crimsomania.datagen;

import net.identidade.crimsomania.Block.ModBlocks;
import net.identidade.crimsomania.Crimsomania;
import net.identidade.crimsomania.Item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Crimsomania.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.BLOODY_SAP_BOTTLE.get());
        basicItem(ModItems.RAW_FLESH_PLANT.get());

        buttonItem(ModBlocks.BLOODY_BUTTON, ModBlocks.BLOODY_PLANKS);
        fenceItem(ModBlocks.BLOODY_FENCE, ModBlocks.BLOODY_PLANKS);

        basicItem(ModBlocks.BLOODY_DOOR.asItem());
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(Crimsomania.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(Crimsomania.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(Crimsomania.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
