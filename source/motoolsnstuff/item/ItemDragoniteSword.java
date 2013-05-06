package motoolsnstuff.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemDragoniteSword extends ItemMTNSSword {

	public ItemDragoniteSword(int par1, EnumMTNSToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@Override
	public void updateIcons(IconRegister register) {
		this.iconIndex = register.registerIcon("MTNS:DragoniteSword");
	}
}
