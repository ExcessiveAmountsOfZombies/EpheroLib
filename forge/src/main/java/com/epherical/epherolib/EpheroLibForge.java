package com.epherical.epherolib;

import net.minecraftforge.fml.common.Mod;

@Mod(ModConstants.MOD_ID)
public class EpheroLibForge {

    private static EpheroLibForge mod;


    public EpheroLibForge() {
        mod = this;
        CommonPlatform.create(new ForgePlatform());
    }
}
