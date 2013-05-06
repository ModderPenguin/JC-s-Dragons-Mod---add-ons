package dragoncore.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "DragonCore", name = "DragonCore", version = "1.13_0DC")
public class DragonCore {
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {}
    
    @Init
    public void init(FMLInitializationEvent event) {}
    
    @PostInit
    public void postInit(FMLInitializationEvent event) {}
}
