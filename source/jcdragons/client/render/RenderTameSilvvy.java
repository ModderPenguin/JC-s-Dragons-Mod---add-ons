package jcdragons.client.render;

import jcdragons.client.entity.EntitySilvvy;
import jcdragons.client.model.ModelBabyDragon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderTameSilvvy extends RenderLiving
{
	protected ModelBabyDragon model;
    public RenderTameSilvvy(ModelBabyDragon modelBabyDragon, float par2)
    {
        super(modelBabyDragon, par2);
        model = (ModelBabyDragon)mainModel;
    }

    public void renderTameSilvy(EntitySilvvy par1EntityTameSilvy, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityTameSilvy, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderTameSilvy((EntitySilvvy)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderTameSilvy((EntitySilvvy)par1Entity, par2, par4, par6, par8, par9);
    }
}
