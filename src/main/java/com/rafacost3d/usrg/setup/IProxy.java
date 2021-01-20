package com.rafacost3d.usrg.setup;

import net.minecraft.world.World;

public interface IProxy {

    void init();
    World getClientWorld();
}
