package com.example.regrowableleaves.blocks;


import com.example.regrowableleaves.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by richa on 12/26/2015.
 */
public class leafAirBlock extends BlockAir {

    public leafAirBlock()
    {
        super();
        this.setTickRandomly(true);
        this.setBlockName("LeafAir");
    }

    public void updateTick(World world, int x, int y, int z, Random random)
    {
        if (!world.isRemote)
        {
            if (world.getBlockLightValue(x, y + 1, z) < 4 && world.getBlockLightOpacity(x, y + 1, z) > 2)
            {
                world.setBlock(x, y, z, Blocks.leaves);
            }
            else if (world.getBlockLightValue(x, y + 1, z) >= 9)
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = x + random.nextInt(3) - 1;
                    int j1 = y + random.nextInt(5) - 3;
                    int k1 = z + random.nextInt(3) - 1;
                    Block block = world.getBlock(i1, j1 + 1, k1);

                    if (world.getBlock(i1, j1, k1) == ModBlocks.leafAirBlock && world.getBlockMetadata(i1, j1, k1) == 0 && world.getBlockLightValue(i1, j1 + 1, k1) >= 4 && world.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        world.setBlock(i1, j1, k1, Blocks.leaves);
                    }
                }
            }
        }
    }

}
