package com.example.regrowableleaves.blocks;


import net.minecraft.block.BlockAir;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import utility.LogHelper;

import java.util.Random;

/**
 * Created by LiLRichy on 12/26/2015.
 */
public class acaciaLeafAirBlock extends BlockAir {


    public acaciaLeafAirBlock() {
        super();


        this.setTickRandomly(true);
        this.setBlockName("BirchLeafAir");
    }

    @Override
    public boolean isOpaqueCube() {
        return true;
    }


    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.isRemote) {
            LogHelper.info("ticking");

            if (random.nextInt(5) > 0) {
                world.setBlock(x, y, z, Blocks.leaves, 0, 3);
                LogHelper.info("Should replace a oak Leaf" );
            }


//            if (world.getBlockLightValue(x, y + 1, z) < 4 && world.getBlockLightOpacity(x, y + 1, z) > 2)
//            {
//                world.setBlock(x, y, z, Blocks.leaves,meta,3);
//            }
//            else if (world.getBlockLightValue(x, y + 1, z) >= 9)
//            {
//                for (int l = 0; l < 4; ++l)
//                {
//                    int i1 = x + random.nextInt(3) - 1;
//                    int j1 = y + random.nextInt(5) - 3;
//                    int k1 = z + random.nextInt(3) - 1;
//
//                    if (world.getBlock(i1, j1, k1) == ModBlocks.leafAirBlock && world.getBlockMetadata(i1, j1, k1) == meta
//                            && world.getBlockLightValue(i1, j1 + 1, k1) >= 4 && world.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
//                    {
//                        world.setBlock(i1, j1, k1, Blocks.leaves,meta,3);
//                    }
//                }
//            }
        }
    }

}
