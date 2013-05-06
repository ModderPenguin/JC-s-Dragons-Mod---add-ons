package motoolsnstuff.block;

import java.util.Random;

import motoolsnstuff.common.MTNSBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSparkleDirt extends Block {
	public BlockSparkleDirt(int id) {
		super(id, Material.ground);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	public void registerIcons(IconRegister par1IconRegister)
	{
		blockIcon = par1IconRegister.registerIcon("MTNS:SparkleDirt");
	}
	
	public int idDropped(int i, Random random, int j) {
		return MTNSBase.sparkleDirt.blockID;
	}
	
	public int quantityDropped(Random random) {
		return 1;
	}
}