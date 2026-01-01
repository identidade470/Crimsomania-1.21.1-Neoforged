package net.identidade.crimsomania.util;

import net.identidade.crimsomania.Crimsomania;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> BLOODY_LOGS = createTag("bloody_logs");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Crimsomania.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> BLOODY_LOGS = createTag("bloody_logs");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Crimsomania.MOD_ID, name));
        }
    }
}
