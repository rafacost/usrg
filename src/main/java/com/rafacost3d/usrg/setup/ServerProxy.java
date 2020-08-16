package com.rafacost3d.usrg.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy {

    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only run on client baby!");
    }
}
