package motoolsnstuff.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemDragoniteIngot extends Item {

	public ItemDragoniteIngot(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public void updateIcons(IconRegister iconregister) { 
		this.iconIndex = iconregister.registerIcon("MTNS:DragoniteIngot");
	}
}
