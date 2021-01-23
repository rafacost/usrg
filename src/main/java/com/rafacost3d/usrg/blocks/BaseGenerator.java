package com.rafacost3d.usrg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class BaseGenerator extends Block {

    private static final VoxelShape RENDER_SHAPE = VoxelShapes.combineAndSimplify(
            makeCuboidShape(0.0D,  0.0D, 0.0D, 16.0D,  4.0D, 16.0D),
            makeCuboidShape(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D),
            IBooleanFunction.OR);

    public BaseGenerator() {
        super(Properties.create(Material.GLASS)
                .sound(SoundType.STONE)
                .hardnessAndResistance(2.0f));
    }

    @Override
    public VoxelShape getRenderShape(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return RENDER_SHAPE;
    }
}
