package jcdragons.common;

import jcdragons.block.BlockDragonPortal;
import jcdragons.block.BlockDragonRune;
import jcdragons.client.entity.EntityEbby;
import jcdragons.client.entity.EntityGolddy;
import jcdragons.client.entity.EntityGrenny;
import jcdragons.client.entity.EntitySilvvy;
import jcdragons.creative.tabs.TabDBM;
import jcdragons.item.ItemDragonTear;
import jcdragons.world.WorldProviderDragonHomeland;
import jcdragons.world.biome.BiomeGenDragonHomeland;
import jcdragons.world.biome.BiomeGenDragonLands;
import jcdragons.world.gen.WorldTypeDBM;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "jcdragon", name = "JC's Dragons Mod", version = "3.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class JCDMBase {	
	@SidedProxy(clientSide = "jcdragons.common.ClientProxyJCDM",
			serverSide = "jcdragons.common.CommonProxyJCDM")
	public static CommonProxyJCDM proxy;
	
	// world provider
		public static final WorldType DragonLands = new WorldTypeDBM(3, "DragonLands");
	// dimension
		public static int dragonDimensionID = 10;
	// biomes
		public static BiomeGenBase dragonHomeland;
		public static BiomeGenBase dragonLands;
	// biome id's
		public static int dragonLandsID = 30;
		public static int dragonHomelandID = 31;
	// creative tabs
		public static CreativeTabs tabDBM = new TabDBM(CreativeTabs.getNextID(), "DBM");
	// blocks
		public static Block dragonRune;
		public static Block dragonPortal;
	// block id's
		int dragonRuneID;
		int dragonPortalID;
	// items
		public static Item dragonTear;
	// item id's
		int dragonTearID;
		
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		// blocks
			dragonRuneID = config.get(config.CATEGORY_BLOCK, "Dragon Rune ID", 1000).getInt();
			dragonPortalID = config.get(config.CATEGORY_BLOCK, "Dragon Portal ID", 1001).getInt();
		// items
			dragonTearID = config.get(config.CATEGORY_ITEM, "Dragon Tear ID", 4000).getInt();
		
		config.save();
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		proxy.init();
		
		// dimensions
			DimensionManager.registerProviderType(dragonDimensionID, WorldProviderDragonHomeland.class, false);
			DimensionManager.registerDimension(dragonDimensionID, dragonDimensionID);
		// biomes
			dragonHomeland = new BiomeGenDragonHomeland(50);
			dragonLands = new BiomeGenDragonLands(51);
		// blocks
			dragonRune = new BlockDragonRune(dragonRuneID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("DragonRune");
			dragonPortal = new BlockDragonPortal(dragonPortalID).setHardness(10000000F).setResistance(1000000F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("DragonPortal");
		// items
			dragonTear = new ItemDragonTear(dragonTearID).setUnlocalizedName("DragonTear");
					
		gameRegisters();
		languageRegisters();
		mobSpawns();
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public void gameRegisters() {
		// blocks
			GameRegistry.registerBlock(dragonPortal);
			GameRegistry.registerBlock(dragonRune);
		// biomes
			GameRegistry.addBiome(dragonHomeland);
			GameRegistry.addBiome(dragonLands);
	}
	
	public void languageRegisters() {
		// blocks
			LanguageRegistry.addName(dragonPortal, "Dragon Portal");
			LanguageRegistry.addName(dragonRune, "Dragon Rune");
		// items
			LanguageRegistry.addName(dragonTear, "\u00a7ADragon Tear");
		// mobs
			LanguageRegistry.instance().addStringLocalization("entity.BrownTameDragon.name", "en_US", "Ebby");
			LanguageRegistry.instance().addStringLocalization("entity.SilverTameDragon.name", "en_US", "Silvvy");
			LanguageRegistry.instance().addStringLocalization("entity.GoldTameDragon.name", "en_US", "Golddy");
			LanguageRegistry.instance().addStringLocalization("entity.GreenTameDragon.name", "en_US", "Grenny");
	}
	
	public void mobSpawns() {
		EntityRegistry.addSpawn(EntityEbby.class, 1, 1, 2, EnumCreatureType.creature, JCDMBase.dragonLands);
		EntityRegistry.addSpawn(EntitySilvvy.class, 1, 1, 2, EnumCreatureType.creature, JCDMBase.dragonLands);
		EntityRegistry.addSpawn(EntityGolddy.class, 1, 1, 2, EnumCreatureType.creature, JCDMBase.dragonLands);
		EntityRegistry.addSpawn(EntityGrenny.class, 1, 1, 2, EnumCreatureType.creature, JCDMBase.dragonLands);
	}
}