package net.identidade.crimsomania.Block.custom;

import net.identidade.crimsomania.Block.ModBlocks;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;

public class BloodyWoodBlock extends RotatedPillarBlock {
    public BloodyWoodBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {

        if (itemAbility == ItemAbilities.AXE_STRIP) {
            return ModBlocks.STRIPPED_BLOODY_WOOD.get().defaultBlockState()
                    .setValue(RotatedPillarBlock.AXIS, state.getValue(RotatedPillarBlock.AXIS));
        }

        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}
