package net.identidade.crimsomania.Item;

import net.identidade.crimsomania.Block.custom.ModFoodProperties;
import net.identidade.crimsomania.Crimsomania;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Crimsomania.MOD_ID);

    public static final DeferredItem<Item> RAW_FLESH_PLANT = ITEMS.register("raw_flesh_plant",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FLESH_PLANT_MEAT)));

    public static final DeferredItem<Item> BLOODY_SAP_BOTTLE = ITEMS.register("bloody_sap_bottle",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
