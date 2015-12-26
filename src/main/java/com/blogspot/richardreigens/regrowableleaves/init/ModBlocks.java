package com.blogspot.richardreigens.regrowableleaves.init;


import com.blogspot.richardreigens.regrowableleaves.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by LiLRichy on 12/26/2015.
 */
public class ModBlocks {

    public static final OakLeafAirBlock oakLeafAirBlock = new OakLeafAirBlock();
    public static final BirchLeafAirBlock birchLeafAirBlock = new BirchLeafAirBlock();
    public static final SpruceLeafAirBlock spruceleafAirBlock = new SpruceLeafAirBlock();
    public static final AcaciaLeafAirBlock acaciaLeafAirBlock = new AcaciaLeafAirBlock();
    public static final JungleLeafAirBlock jungleLeafAirBlock = new JungleLeafAirBlock();
    public static final DarkOakLeafAirBlock darkOakLeafAirBlock = new DarkOakLeafAirBlock();

    public static void init() {

        GameRegistry.registerBlock(oakLeafAirBlock, "OakLeafAir");
        GameRegistry.registerBlock(birchLeafAirBlock, "BirchLeafAir");
        GameRegistry.registerBlock(spruceleafAirBlock, "SpruceLeafAir");
        GameRegistry.registerBlock(acaciaLeafAirBlock, "AcaciaLeafAir");
        GameRegistry.registerBlock(jungleLeafAirBlock, "JungleLeafAir");
        GameRegistry.registerBlock(darkOakLeafAirBlock, "DarkOakLeafAir");

    }
}
