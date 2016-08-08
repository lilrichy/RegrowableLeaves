package com.blogspot.richardreigens.regrowableleaves.blocks.bopLeavesPages;

import net.minecraft.util.IStringSerializable;

/**
 * Created by LiLRichy on 2/11/2016.
 */
public class BOPPage_3 {

    public enum EnumType implements IStringSerializable {

        HELLBARK(0, "hellbark"),
        FLOWERING(1, "flowering"),
        JACARANDA(2, "jacaranda"),
        SACRED_OAK(3, "sacred_oak");

        private static final BOPPage_3.EnumType[] META_LOOKUP = new BOPPage_3.EnumType[values().length];

        static {
            for (BOPPage_3.EnumType BOPTrees$enumtype : values()) {
                META_LOOKUP[BOPTrees$enumtype.getID()] = BOPTrees$enumtype;
            }
        }

        private int ID;
        private String name;

        EnumType(int ID, String name) {
            this.ID = ID;
            this.name = name;
        }

        public static BOPPage_3.EnumType byMetadata(int meta) {
            if (meta < 0 || meta >= META_LOOKUP.length) {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        @Override
        public String getName() {
            return name;
        }

        public int getID() {
            return ID;
        }

        @Override
        public String toString() {
            return getName();
        }
    }
}
