package com.blogspot.richardreigens.regrowableleaves.blocks;


import com.blogspot.richardreigens.regrowableleaves.ConfigurationHandler;
import net.minecraft.block.BlockAir;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by LiLRichy on 12/26/2015.
 */
public class DarkOakLeafAirBlock extends BlockAir {

    public DarkOakLeafAirBlock() {
        super();
        this.setTickRandomly(true);
        this.setBlockName("DarkOakLeafAir");
    }

    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.isRemote) {

            if (random.nextInt(10) > ConfigurationHandler.leafRegrowthRate && world.getBlockLightValue(x,y,z) >=ConfigurationHandler.lightRequiredToGrow) {
                world.setBlock(x, y, z, Blocks.leaves2, 1, 3);
            }
        }
    }
}
