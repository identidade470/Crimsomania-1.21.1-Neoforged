package net.identidade.crimsomania.Block.custom;

import net.identidade.crimsomania.Block.ModBlocks;
import net.identidade.crimsomania.Item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;

public class BloodyLogBlock extends RotatedPillarBlock {

    public static final BooleanProperty HAS_SAP = BooleanProperty.create("has_sap");

    public BloodyLogBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(BlockStateProperties.AXIS, Direction.Axis.Y).setValue(HAS_SAP, false));
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {

        if (itemAbility == ItemAbilities.AXE_STRIP) {
            return ModBlocks.STRIPPED_BLOODY_LOG.get().defaultBlockState()
                    .setValue(RotatedPillarBlock.AXIS, state.getValue(RotatedPillarBlock.AXIS));
        }


        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {

        if (!stack.is(Items.GLASS_BOTTLE)) return ItemInteractionResult.FAIL;
        if (!state.getValue(BloodyLogBlock.HAS_SAP)) return ItemInteractionResult.FAIL;

        if (!level.isClientSide) {
            player.addItem(ModItems.BLOODY_SAP_BOTTLE.toStack());
            stack.shrink(1);

            level.setBlockAndUpdate(pos, state.setValue(BloodyLogBlock.HAS_SAP, false));

            level.playSound(null, pos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1f, 1f);
        }

        return ItemInteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(HAS_SAP);
    }
}
