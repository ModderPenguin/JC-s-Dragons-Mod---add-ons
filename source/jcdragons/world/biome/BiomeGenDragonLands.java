package jcdragons.world.biome;

import jcdragons.client.entity.EntityEbby;
import jcdragons.client.entity.EntityGolddy;
import jcdragons.client.entity.EntityGrenny;
import jcdragons.client.entity.EntitySilvvy;
import jcdragons.common.JCDMBase;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenDragonLands extends BiomeGenBase
{
       public BiomeGenDragonLands(int par1)
       {
             super(par1);
		   this.setBiomeName("Dragon Lands");
		   this.setDisableRain();
		   this.setTemperatureRainfall(1F, 0F);
		   this.setMinMaxHeight(1F, 1F);
		   this.topBlock = (byte) Block.blockLapis.blockID;
		   this.fillerBlock = (byte) Block.blockLapis.blockID;
		   
		   this.spawnableCreatureList.clear();
		   this.spawnableCaveCreatureList.clear();
		   this.spawnableMonsterList.clear();
		   this.spawnableWaterCreatureList.clear();
       }
}