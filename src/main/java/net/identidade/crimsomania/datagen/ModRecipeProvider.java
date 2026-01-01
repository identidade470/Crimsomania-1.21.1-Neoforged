package net.identidade.crimsomania.datagen;

import net.identidade.crimsomania.Block.ModBlocks;
import net.identidade.crimsomania.Item.ModItems;
import net.identidade.crimsomania.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLOODY_PLANKS.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.BLOODY_SAP_BOTTLE.get())
                .unlockedBy("has_bloody_sap", has(ModItems.BLOODY_SAP_BOTTLE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BLOODY_PLANKS.get(), 4)
                .requires(ModTags.Items.BLOODY_LOGS)
                .unlockedBy("has_bloody_log", has(ModTags.Items.BLOODY_LOGS)).save(recipeOutput, "crimsomania:bloody_planks_from_log");

        stairBuilder(ModBlocks.BLOODY_STAIRS.get(), Ingredient.of(ModBlocks.BLOODY_PLANKS)).group("bloody_planks")
                .unlockedBy("has_bloody_planks", has(ModBlocks.BLOODY_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOODY_SLAB.get(), ModBlocks.BLOODY_PLANKS.get());

        fenceBuilder(ModBlocks.BLOODY_FENCE.get(), Ingredient.of(ModBlocks.BLOODY_PLANKS)).group("bloody_planks")
                .unlockedBy("has_bloody_planks", has(ModBlocks.BLOODY_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.BLOODY_FENCE_GATE.get(), Ingredient.of(ModBlocks.BLOODY_PLANKS)).group("bloody_planks")
                .unlockedBy("has_bloody_planks", has(ModBlocks.BLOODY_PLANKS)).save(recipeOutput);

        buttonBuilder(ModBlocks.BLOODY_BUTTON.get(), Ingredient.of(ModBlocks.BLOODY_PLANKS)).group("bloody_planks")
                .unlockedBy("has_bloody_planks", has(ModBlocks.BLOODY_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.BLOODY_PRESSURE_PLATE.get(), ModBlocks.BLOODY_PLANKS.get());

        doorBuilder(ModBlocks.BLOODY_DOOR.get(), Ingredient.of(ModBlocks.BLOODY_PLANKS)).group("bloody_planks")
                .unlockedBy("has_bloody_planks", has(ModBlocks.BLOODY_PLANKS)).save(recipeOutput);
        trapdoorBuilder(ModBlocks.BLOODY_TRAPDOOR.get(), Ingredient.of(ModBlocks.BLOODY_PLANKS)).group("bloody_planks")
                .unlockedBy("has_bloody_planks", has(ModBlocks.BLOODY_PLANKS)).save(recipeOutput);

        woodFromLogs(recipeOutput, ModBlocks.BLOODY_WOOD.get(), ModBlocks.BLOODY_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_BLOODY_WOOD.get(), ModBlocks.STRIPPED_BLOODY_LOG.get());
    }
}
