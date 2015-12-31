package com.blogspot.richardreigens.regrowableleaves;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.world.BlockEvent;


/**
 * Created by LiLRichy on 12/26/2015.
 */
public class EventHandler {

    @SubscribeEvent
    public void BreakEvent(BlockEvent.BreakEvent e) {
        int x = e.x;
        int y = e.y;
        int z = e.z;

        // LogHelper.info(e.blockMetadata);
        if (e.block == Blocks.leaves) 
        {
            e.world.setBlock(x, y, z, regrowableleaves.blockLeafAir, e.blockMetadata % 4, 3);
            e.setCanceled(true);
        }
        else if (e.block == Blocks.leaves2)
        {
            e.world.setBlock(x, y, z, regrowableleaves.blockLeafAir, (e.blockMetadata % 4) + 5, 3);
            e.setCanceled(true);
        }
    }
}
