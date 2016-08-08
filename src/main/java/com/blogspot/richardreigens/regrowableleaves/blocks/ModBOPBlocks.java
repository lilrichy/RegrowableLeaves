package com.blogspot.richardreigens.regrowableleaves.blocks;

import com.blogspot.richardreigens.regrowableleaves.blocks.bopLeavesAirBlocks.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

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

    public static void register() {
        GameRegistry.register(BLOCK_BOP_LEAF_AIR_0);
        GameRegistry.register(BLOCK_BOP_LEAF_AIR_1);
        GameRegistry.register(BLOCK_BOP_LEAF_AIR_2);
        GameRegistry.register(BLOCK_BOP_LEAF_AIR_3);
        GameRegistry.register(BLOCK_BOP_LEAF_AIR_4);
        GameRegistry.register(BLOCK_BOP_LEAF_AIR_5);
    }
}