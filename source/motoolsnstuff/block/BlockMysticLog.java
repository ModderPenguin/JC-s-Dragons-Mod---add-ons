package motoolsnstuff.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMysticLog extends Block
{
    @SideOnly(Side.CLIENT)
    private Icon[] field_94387_c;

    public BlockMysticLog(int par1)
    {
        super(par1, Material.wood);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return par1;
    }
    
    private Icon sides, bottom, top;
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
    {
            this.sides = par1IconRegister.registerIcon("MTNS:MysticWoodSide");
            this.bottom = par1IconRegister.registerIcon("MTNS:MysticWoodTop");
            this.top = par1IconRegister.registerIcon("MTNS:MysticWoodTop");
    }
	
	public Icon getBlockTextureFromSideAndMetadata(int i, int j)
    {
		if (i == 0) {
			return bottom;
		}
        if (i == 1) {
        	return top;
        } else {
        	return sides;
        }
    }
}
