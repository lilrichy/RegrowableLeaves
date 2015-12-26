package com.example.regrowableleaves.init;

import com.example.regrowableleaves.blocks.leafAirBlock;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by richa on 12/26/2015.
 */
public class ModBlocks {

    public static final leafAirBlock leafAirBlock = new leafAirBlock();

    public static void init() {

        GameRegistry.registerBlock(leafAirBlock, "LeafAir");
    }
}
