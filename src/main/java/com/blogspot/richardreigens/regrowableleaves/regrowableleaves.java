package com.blogspot.richardreigens.regrowableleaves;

import com.blogspot.richardreigens.regrowableleaves.init.ModBlocks;
import com.blogspot.richardreigens.regrowableleaves.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import com.blogspot.richardreigens.regrowableleaves.utility.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class regrowableleaves {
    @Mod.Instance(Reference.MOD_ID)
    public static regrowableleaves instance;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Blocks Loading");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new com.blogspot.richardreigens.regrowableleaves.EventHandler());
    }
}
