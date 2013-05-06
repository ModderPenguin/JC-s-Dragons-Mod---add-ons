package jcdragons.common;

import java.awt.Color;

import jcdragons.client.entity.EntityEbby;
import jcdragons.client.entity.EntityGolddy;
import jcdragons.client.entity.EntityGrenny;
import jcdragons.client.entity.EntitySilvvy;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.EntityRegistry;

public class CommonProxyJCDM implements IGuiHandler {
	
	public void registerRenderThings() {}
	
	public void init() {
		registerRenderThings();
		
		EntityRegistry.registerGlobalEntityID(EntityEbby.class, "BrownTameDragon", EntityRegistry.findGlobalUniqueEntityId(), 0x645655, (new Color(172, 50, 49)).getRGB());
		EntityRegistry.registerGlobalEntityID(EntitySilvvy.class, "SilverTameDragon", EntityRegistry.findGlobalUniqueEntityId(), 0xe7e7e7, (new Color(190, 200, 232)).getRGB());
		EntityRegistry.registerGlobalEntityID(EntityGolddy.class, "GoldTameDragon", EntityRegistry.findGlobalUniqueEntityId(),  0xEEBB3C, (new Color(195, 70, 14)).getRGB());
		EntityRegistry.registerGlobalEntityID(EntityGrenny.class, "GreenTameDragon", EntityRegistry.findGlobalUniqueEntityId(), 0x13ED80, (new Color(73, 48, 172)).getRGB());
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		return null;
	}
}
