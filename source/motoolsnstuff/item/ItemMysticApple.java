package motoolsnstuff.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMysticApple extends Item {
	public ItemMysticApple(int par1) {
		super(par1);
        this.setCreativeTab(CreativeTabs.tabFood);
	}
	
	@Override
	public void updateIcons(IconRegister iconRegister)
	{
		 this.iconIndex = iconRegister.registerIcon("MTNS:MysticApple");
	}
}
