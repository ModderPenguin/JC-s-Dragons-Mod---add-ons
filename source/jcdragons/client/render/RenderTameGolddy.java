package jcdragons.client.render;

import jcdragons.client.entity.EntityGolddy;
import jcdragons.client.model.ModelBabyDragon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderTameGolddy extends RenderLiving
{
	protected ModelBabyDragon model;
    public RenderTameGolddy(ModelBabyDragon par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
        model = (ModelBabyDragon)mainModel;
    }

    public void renderTameGoldDragon(EntityGolddy par1EntityTameGoldDragon, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityTameGoldDragon, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderTameGoldDragon((EntityGolddy)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderTameGoldDragon((EntityGolddy)par1Entity, par2, par4, par6, par8, par9);
    }
}
