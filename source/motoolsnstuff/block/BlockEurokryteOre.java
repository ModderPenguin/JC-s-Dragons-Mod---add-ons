package motoolsnstuff.block;

import java.util.Random;

import motoolsnstuff.common.MTNSBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockEurokryteOre extends Block {

	public BlockEurokryteOre(int id) {
		super(id, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("MTNS:EurokryteOre");
	}
	
	public int idDropped(int par1, Random random, int par2) {
		return MTNSBase.eurokryteCrystal.itemID;
	}
	
	public int quantityDropped(Random random) {
		return 1;
	}
}
