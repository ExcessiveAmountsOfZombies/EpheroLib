package com.epherical.epherolib;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class EpheroLibFabric implements ModInitializer {


    @Override
    public void onInitialize() {
        CommonPlatform.create(new FabricPlatform());
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {

        });

    }
}
