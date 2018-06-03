package com.blogspot.richardreigens.regrowableleaves.blocks;

import com.blogspot.richardreigens.regrowableleaves.blocks.bopLeavesAirBlocks.*;
import com.blogspot.richardreigens.regrowableleaves.regrowableleaves;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by LiLRichy on 8/7/2016.
 */
public class ModBOPBlocks {
    public static final BlockBOPLeafAir_0 BLOCK_BOP_LEAF_AIR_0 = new BlockBOPLeafAir_0();
    public static final BlockBOPLeafAir_1 BLOCK_BOP_LEAF_AIR_1 = new BlockBOPLeafAir_1();
    public static final BlockBOPLeafAir_2 BLOCK_BOP_LEAF_AIR_2 = new BlockBOPLeafAir_2();
    public static final BlockBOPLeafAir_3 BLOCK_BOP_LEAF_AIR_3 = new BlockBOPLeafAir_3();
    public static final BlockBOPLeafAir_4 BLOCK_BOP_LEAF_AIR_4 = new BlockBOPLeafAir_4();
    public static final BlockBOPLeafAir_5 BLOCK_BOP_LEAF_AIR_5 = new BlockBOPLeafAir_5();
   
    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
    	 //We should only load these blocks if BOP is installed:
        if (regrowableleaves.isBOPInstalled) {
        	event.getRegistry().registerAll(BLOCK_BOP_LEAF_AIR_0, BLOCK_BOP_LEAF_AIR_1, BLOCK_BOP_LEAF_AIR_2, BLOCK_BOP_LEAF_AIR_3,BLOCK_BOP_LEAF_AIR_4,BLOCK_BOP_LEAF_AIR_5);
        }
    }
}