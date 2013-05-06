package motoolsnstuff.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class ItemEurokryteAxe extends ItemMTNSAxe {

	public ItemEurokryteAxe(int par1, EnumMTNSToolMaterial material) {
		super(par1, material);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	@Override
	public void updateIcons(IconRegister iconRegister)
	{
		 iconIndex = iconRegister.registerIcon("MTNS:EurokryteAxe");
	}
}
