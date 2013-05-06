package motoolsnstuff.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class ItemAslophogisHoe extends ItemMTNSHoe {
	public ItemAslophogisHoe(int ItemID, EnumMTNSToolMaterial material) {
		super(ItemID, material);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	@Override
	public void updateIcons(IconRegister iconRegister)
	{
		 iconIndex = iconRegister.registerIcon("MTNS:AslophogisHoe");
	}
	
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
    {
		DamageSource source = DamageSource.causePlayerDamage(player);
		player.attackEntityFrom(source, 2);
        return false;
    }
	
	public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z, EntityPlayer player)
    {
		DamageSource source = DamageSource.causePlayerDamage(player);
		player.attackEntityFrom(source, 2);
        return false;
    }
	
	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.rare;
	}
}
