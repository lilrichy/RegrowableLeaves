package com.blogspot.richardreigens.regrowableleaves.blocks.minecraftLevesBlock;


import com.blogspot.richardreigens.regrowableleaves.ConfigurationHandler;
import com.blogspot.richardreigens.regrowableleaves.LogHelper;
import net.minecraft.block.BlockAir;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by LiLRichy on 12/26/2015.
 */
public class BlockLeafAir extends BlockAir {
    public static final PropertyEnum<BlockProperties.EnumType> TYPE = PropertyEnum.create("type", BlockProperties.EnumType.class);
    final int META_OFFSET = 5;

    public BlockLeafAir() {
        super();
        this.setTickRandomly(true);
        this.setUnlocalizedName("LeafAir");
        this.setRegistryName("BlockLeafAir");
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        if (ConfigurationHandler.generalSettings.debugMode)
            return EnumBlockRenderType.MODEL;
        else
            return EnumBlockRenderType.INVISIBLE;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(TYPE, BlockProperties.EnumType.byMetadata(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(TYPE).getID();
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, TYPE);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isRemote) {
            int metaToSet = state.getBlock().getMetaFromState(state);
            if (rand.nextInt(10) > ConfigurationHandler.generalSettings.leafRegrowthRate && worldIn.getLight(pos) >= ConfigurationHandler.generalSettings.lightRequiredToGrow) {
                if (ConfigurationHandler.generalSettings.debugMode) LogHelper.info("BlockLeafAir Tick");
                if (metaToSet >= META_OFFSET)
                    worldIn.setBlockState(pos, Blocks.LEAVES2.getStateFromMeta(state.getBlock().getMetaFromState(state) - META_OFFSET + 8));
                else
                    worldIn.setBlockState(pos, Blocks.LEAVES.getStateFromMeta(state.getBlock().getMetaFromState(state) + 8));
            }
        }
    }
}

