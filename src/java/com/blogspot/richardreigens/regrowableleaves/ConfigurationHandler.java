package com.blogspot.richardreigens.regrowableleaves;

import com.blogspot.richardreigens.regrowableleaves.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;

import java.io.File;

/**
 * Created by LiLRichy on 12/26/2015.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;

    public static int leafRegrowthRate;
    public static int lightRequiredToGrow;
    public static boolean debugMode;


    public static void init(File configFile)
    {
        //Create config file if none exists
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        String GENERAL_SETTINGS = "General Settings";

        leafRegrowthRate = configuration.getInt("leafRegrowthRate", GENERAL_SETTINGS, 3, 0, 10, "Rate that leaves will regrow. Lower number is faster.");
        lightRequiredToGrow = configuration.getInt("lightRequiredToGrow", GENERAL_SETTINGS,4,0,13, "Light level required for leaves to start regrowing. 0 = no light required.");
        debugMode = configuration.getBoolean("debugMode", GENERAL_SETTINGS, false, "Enable this to show blocks and output debug text into console.");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }

    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equalsIgnoreCase(Reference.MOD_ID)) {
            //Reload Config
            loadConfiguration();
        }
    }
}
