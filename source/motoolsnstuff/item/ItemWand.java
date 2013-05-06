package motoolsnstuff.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemWand extends Item {
	
	public ItemWand(int itemID) {
		super(itemID);
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	@Override
	public void updateIcons(IconRegister iconRegister)
	{
		 this.iconIndex = iconRegister.registerIcon("MTNS:Wand");
	}
	
	public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }
}