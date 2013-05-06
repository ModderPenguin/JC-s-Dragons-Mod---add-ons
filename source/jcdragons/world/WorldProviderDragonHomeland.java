package jcdragons.world;

import jcdragons.common.JCDMBase;
import jcdragons.world.gen.ChunkProviderDragonHomeland;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderDragonHomeland extends WorldProvider
{
 public void registerWorldChunkManager()
 {
  this.worldChunkMgr = new WorldChunkManagerHell(JCDMBase.dragonHomeland, 0.8F, 0.1F);
  this.dimensionId = JCDMBase.dragonHomelandID;
 }
 
 public String getDimensionName() 
 {
  return "Dragon Homeland";
 }
 
 public boolean canRespawnHere()
 {
  return true;
 }
 
 public String getSaveFolder()
    {
        return "Dragon_Homeland";
    }
 
 @Override
 public IChunkProvider createChunkGenerator()
 {
  return new ChunkProviderDragonHomeland(worldObj, worldObj.getSeed(), true);
 }
}