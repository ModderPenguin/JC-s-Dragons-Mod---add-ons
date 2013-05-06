package jcdragons.world.gen;

import jcdragons.common.JCDMBase;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;

public class WorldTypeDBM extends WorldType {
	public WorldTypeDBM(int par1, String par2Str) {
		super(par1, par2Str);
	}
	
	public String getTranslateName() {
		return "Dragon Lands";
	}
	
	public WorldChunkManager getChunkManager(World var1) {
		return new WorldChunkManagerHell(JCDMBase.dragonLands, 0.5F, 0.5F);
	}
}