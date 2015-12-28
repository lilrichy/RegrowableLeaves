package com.blogspot.richardreigens.regrowableleaves.blocks;


import com.blogspot.richardreigens.regrowableleaves.ConfigurationHandler;
import net.minecraft.block.BlockAir;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by LiLRichy on 12/26/2015.
 */
public class BlockLeafAir extends BlockAir {
    final int META_OFFSET = 5;

    public BlockLeafAir() {
        super();
        this.setTickRandomly(true);
        this.setBlockName("LeafAir");
    }

    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.isRemote) {

            int metaToSet = world.getBlockMetadata(x, y, z);

            if (random.nextInt(10) > ConfigurationHandler.leafRegrowthRate && world.getBlockLightValue(x, y, z) >= ConfigurationHandler.lightRequiredToGrow) {
                if (metaToSet >= META_OFFSET) {
                    world.setBlock(x, y, z, Blocks.leaves2, metaToSet - META_OFFSET + 8, 3);
                } else world.setBlock(x, y, z, Blocks.leaves, metaToSet + 8, 3);
            }
        }
    }
}
