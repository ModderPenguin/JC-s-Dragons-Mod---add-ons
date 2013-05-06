package motoolsnstuff.block;

import java.util.Random;

import motoolsnstuff.common.MTNSBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockSparkleGrass extends Block {
public BlockSparkleGrass(int id) {
		super(id, Material.ground);
		this.setTickRandomly(true);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	private Icon sides, bottom, top;
	
	public void registerIcons(IconRegister par1IconRegister)
	{
            this.sides = par1IconRegister.registerIcon("MTNS:SparkleGrassSide");
            this.bottom = par1IconRegister.registerIcon("MTNS:SparkleGrassBottom");
            this.top = par1IconRegister.registerIcon("MTNS:SparkleGrassTop");
    }
	
	public Icon getBlockTextureFromSideAndMetadata(int i, int j)
    {
		if (i == 0) {
			return bottom;
		}
        if (i == 1) {
        	return top;
        } else {
        	return sides;
        }
    }
	
	public int idDropped(int i, Random random, int j) {
		return MTNSBase.sparkleDirt.blockID;
	}
	
	public int quantityDropped(Random random) {
		return 1;
	}
	
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            if (par1World.getBlockLightValue(par2, par3 + 1, par4) < 4 && par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2)
            {
                par1World.setBlock(par2, par3, par4, Block.dirt.blockID);
            }
            else if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = par2 + par5Random.nextInt(3) - 1;
                    int j1 = par3 + par5Random.nextInt(5) - 3;
                    int k1 = par4 + par5Random.nextInt(3) - 1;
                    int l1 = par1World.getBlockId(i1, j1 + 1, k1);

                    if (par1World.getBlockId(i1, j1, k1) == MTNSBase.sparkleDirt.blockID && par1World.getBlockLightValue(i1, j1 + 1, k1) >= 4 && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, MTNSBase.sparkleGrass.blockID);
                    }
                }
            }
        }
    }
}
