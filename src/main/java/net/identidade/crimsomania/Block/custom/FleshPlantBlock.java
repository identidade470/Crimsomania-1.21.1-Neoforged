package net.identidade.crimsomania.Block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class FleshPlantBlock extends Block {

    private static final VoxelShape SHAPE_Y = Block.box(2, 0, 2, 14, 16, 14);
    private static final VoxelShape SHAPE_X = Block.box(0, 2, 2, 16, 14, 14);
    private static final VoxelShape SHAPE_Z = Block.box(2, 2, 0, 14, 14, 16);

    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public FleshPlantBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(
                this.defaultBlockState().setValue(FACING, Direction.UP)
        );
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(FACING, context.getClickedFace());
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            case DOWN -> SHAPE_Y;
            case UP -> SHAPE_Y;
            case WEST -> SHAPE_X;
            case EAST -> SHAPE_X;
            case NORTH -> SHAPE_Z;
            case SOUTH -> SHAPE_Z;
        };
    }
}
