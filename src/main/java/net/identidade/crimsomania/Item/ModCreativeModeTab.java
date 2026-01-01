package net.identidade.crimsomania.Item;

import net.identidade.crimsomania.Block.ModBlocks;
import net.identidade.crimsomania.Crimsomania;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Crimsomania.MOD_ID);

    public static final Supplier<CreativeModeTab> MONSTROUS_COOKERY_TAB = CREATIVE_MODE_TAB.register("base",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.BLOODY_PLANKS.get()))
                    .title(Component.translatable("creativetab.crimsomania.base"))
                    .displayItems((itemDisplayParameters, output) -> {
//                        output.accept(ModBlocks.BLOODY_MOUTH);
                        output.accept(ModBlocks.BLOODY_LOG);
                        output.accept(ModBlocks.BLOODY_WOOD);
                        output.accept(ModBlocks.STRIPPED_BLOODY_LOG);
                        output.accept(ModBlocks.STRIPPED_BLOODY_WOOD);
                        output.accept(ModBlocks.BLOODY_PLANKS);
                        output.accept(ModBlocks.BLOODY_STAIRS);
                        output.accept(ModBlocks.BLOODY_SLAB);
                        output.accept(ModBlocks.BLOODY_FENCE);
                        output.accept(ModBlocks.BLOODY_FENCE_GATE);
                        output.accept(ModBlocks.BLOODY_DOOR);
                        output.accept(ModBlocks.BLOODY_TRAPDOOR);
                        output.accept(ModBlocks.BLOODY_PRESSURE_PLATE);
                        output.accept(ModBlocks.BLOODY_BUTTON);
                        output.accept(ModBlocks.PULSAR_BULB);
                        output.accept(ModBlocks.FLESH_PLANT);
                        output.accept(ModBlocks.FLESH_BLOCK);

                        output.accept(ModItems.RAW_FLESH_PLANT);
                        output.accept(ModItems.BLOODY_SAP_BOTTLE);
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
