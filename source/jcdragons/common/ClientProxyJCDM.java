package jcdragons.common;

import jcdragons.client.entity.EntityEbby;
import jcdragons.client.entity.EntityGolddy;
import jcdragons.client.entity.EntityGrenny;
import jcdragons.client.entity.EntitySilvvy;
import jcdragons.client.model.ModelBabyDragon;
import jcdragons.client.render.RenderTameEbby;
import jcdragons.client.render.RenderTameGolddy;
import jcdragons.client.render.RenderTameGrenny;
import jcdragons.client.render.RenderTameSilvvy;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxyJCDM extends CommonProxyJCDM {
	@Override
	public void registerRenderThings()
	{
		//RenderingRegistry.registerEntityRenderingHandler(EntityMysticSlime.class, new RenderSlime(new ModelSlime(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityEbby.class, new RenderTameEbby(new ModelBabyDragon(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySilvvy.class, new RenderTameSilvvy(new ModelBabyDragon(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGolddy.class, new RenderTameGolddy(new ModelBabyDragon(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenny.class, new RenderTameGrenny(new ModelBabyDragon(), 0.5F));
	}
}