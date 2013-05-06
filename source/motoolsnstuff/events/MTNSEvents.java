package motoolsnstuff.events;

import jcdragons.client.entity.EntityEbby;
import jcdragons.client.entity.EntityGolddy;
import jcdragons.client.entity.EntityGrenny;
import jcdragons.client.entity.EntitySilvvy;
import motoolsnstuff.common.MTNSBase;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class MTNSEvents {
	@ForgeSubscribe
	public void onEbbyJoinWorld(EntityJoinWorldEvent event) {
		if (event.entity instanceof EntityEbby) {
			EntityEbby ebby = (EntityEbby)event.entity;
			ebby.tasks.addTask(1, new EntityAITempt(ebby, 0.3F, MTNSBase.wand.itemID, false));
		}
	}
	@ForgeSubscribe
	public void onSilvvyJoinWorld(EntityJoinWorldEvent event) {
		if (event.entity instanceof EntitySilvvy) {
			EntitySilvvy silvvy = (EntitySilvvy)event.entity;
			silvvy.tasks.addTask(1, new EntityAITempt(silvvy, 0.3F, MTNSBase.wand.itemID, false));
		}
	}
	@ForgeSubscribe
	public void onGolddyJoinWorld(EntityJoinWorldEvent event) {
		if (event.entity instanceof EntityGolddy) {
			EntityGolddy golddy = (EntityGolddy)event.entity;
			golddy.tasks.addTask(1, new EntityAITempt(golddy, 0.3F, MTNSBase.wand.itemID, false));
		}
	}
	@ForgeSubscribe
	public void onGrennyJoinWorld(EntityJoinWorldEvent event) {
		if (event.entity instanceof EntityGrenny) {
			EntityGrenny grenny = (EntityGrenny)event.entity;
			grenny.tasks.addTask(1, new EntityAITempt(grenny, 0.3F, MTNSBase.wand.itemID, false));
		}
	}
}
