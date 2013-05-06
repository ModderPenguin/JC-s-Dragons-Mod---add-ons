package momagicnstuffstaves.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemWindStaff extends Item {
	
	public ItemWindStaff(int itemID) {
		super(itemID);
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@Override
	public void updateIcons(IconRegister par1IconRegister)
    {
		this.iconIndex = par1IconRegister.registerIcon("MMNSS:WindStaff");
    } 
}