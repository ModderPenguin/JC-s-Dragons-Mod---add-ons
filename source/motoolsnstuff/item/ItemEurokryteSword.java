package motoolsnstuff.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class ItemEurokryteSword extends ItemMTNSSword {

	public ItemEurokryteSword(int par1, EnumMTNSToolMaterial material) {
		super(par1, material);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	@Override
	public void updateIcons(IconRegister iconRegister)
	{
		 iconIndex = iconRegister.registerIcon("MTNS:EurokryteSword");
	}
}
