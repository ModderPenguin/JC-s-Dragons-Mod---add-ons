package jcdragons.world.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenDragonHomeland extends BiomeGenBase
{
	public BiomeGenDragonHomeland(int par1) {
		super(par1);
		this.setBiomeName("Dragon Homeland");
		this.setDisableRain();
		this.setTemperatureRainfall(1F, 0F);
		this.setMinMaxHeight(-2.0F, -1.9F);
		this.topBlock = (byte) Block.sandStone.blockID;
		this.fillerBlock = (byte) Block.blockLapis.blockID;
	}
}