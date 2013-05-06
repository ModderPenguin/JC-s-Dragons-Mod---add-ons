package momagicnstuffspellbooks.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemIceBook extends Item {
	
	public ItemIceBook(int itemID) {
		super(itemID);
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@Override
	public void updateIcons(IconRegister iconRegister)
	{
		 iconIndex = iconRegister.registerIcon("MMNSSB:IceBook");
	}
}