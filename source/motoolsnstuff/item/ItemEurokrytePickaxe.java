package motoolsnstuff.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemEurokrytePickaxe extends ItemMTNSPickaxe {

	public ItemEurokrytePickaxe(int par1, EnumMTNSToolMaterial material) {
		super(par1, material);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	@Override
	public void updateIcons(IconRegister iconRegister)
	{
		 iconIndex = iconRegister.registerIcon("MTNS:EurokrytePickaxe");
	}
}
