package jcdragons.creative.tabs;

import jcdragons.common.JCDMBase;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class TabDBM extends CreativeTabs
{
        public TabDBM(int par1, String par2Str)
        {
                super(par1, par2Str);
        }
        
        @SideOnly(Side.CLIENT)
        public int getTabIconItemIndex()
        {
                return JCDMBase.dragonTear.itemID;//items
        }
   
        public String getTranslatedTabLabel()
        {
         return "Dragon Bros Mod";
        }
}