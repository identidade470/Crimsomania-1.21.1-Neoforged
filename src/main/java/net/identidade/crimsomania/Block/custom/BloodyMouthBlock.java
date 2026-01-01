package net.identidade.crimsomania.Block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BloodyMouthBlock extends Block {
    public BloodyMouthBlock(Properties properties) {
        super(properties);
    }

    public static final VoxelShape SHAPE = Block.box(
            2.0D, 0.0D, 2.0D,      // min
            14.0D, 5.0D, 14.0D     // max
    );

    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        entity.makeStuckInBlock(state, new Vec3((double)0.9F, (double)1.5F, (double)0.9F));

        if (entity instanceof LivingEntity) {
            entity.hurt(level.damageSources().generic(), 1.0F);
        }

        super.entityInside(state, level, pos, entity);
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
}
