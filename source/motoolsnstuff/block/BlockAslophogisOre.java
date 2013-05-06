package motoolsnstuff.block;

import java.util.Random;

import motoolsnstuff.common.MTNSBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockAslophogisOre extends Block {

	public BlockAslophogisOre(int id) {
		super(id, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
	         this.blockIcon = par1IconRegister.registerIcon("MTNS:AslophogisOre");
	}
	
	public int idDropped(int par1, Random random, int par2) {
		return MTNSBase.aslophogisCrystal.itemID;
	}
	
	public int quantityDropped(Random random) {
		return 1;
	}
	
	public void onBlockHarvested(World par1World, int par2, int par3, int par4, int par5, EntityPlayer player) {
		DamageSource source = DamageSource.causePlayerDamage(player);
		player.attackEntityFrom(source, 6);
    }
}
