package com.rafacost3d.usrg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public abstract class BaseGenerator extends HorizontalBlock {

    private static final VoxelShape RENDER_SHAPE = VoxelShapes.combineAndSimplify(
            makeCuboidShape(0.0D,  0.0D, 0.0D, 16.0D,  4.0D, 16.0D),
            makeCuboidShape(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D),
            IBooleanFunction.OR);

    public BaseGenerator(int lightLevel) {
        super(Properties.create(Material.GLASS) // Material.GLASS is required to help with the neighbor block rendering through the glass
                .sound(SoundType.STONE)
                .hardnessAndResistance(2.0f)
                .setLightLevel((light) -> lightLevel)
        );
    }

    @Override
    public VoxelShape getRenderShape(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return RENDER_SHAPE;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public PushReaction getPushReaction(BlockState state) {
        return PushReaction.BLOCK;
    }
}
