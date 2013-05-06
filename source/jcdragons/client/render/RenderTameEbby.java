package jcdragons.client.render;

import jcdragons.client.entity.EntityEbby;
import jcdragons.client.model.ModelBabyDragon;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderTameEbby extends RenderLiving
{
	
	protected ModelBabyDragon modelBabyDragon;
	 
    public RenderTameEbby(ModelBabyDragon babyDragon, float par2) {
		super(babyDragon, par2);
		this.modelBabyDragon = (ModelBabyDragon)this.mainModel;
        this.setRenderPassModel(this.mainModel);
	}

	public void renderTameEbby(EntityEbby par1EntityTameEbby, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityTameEbby, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderTameEbby((EntityEbby)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderTameEbby((EntityEbby)par1Entity, par2, par4, par6, par8, par9);
    }
}
