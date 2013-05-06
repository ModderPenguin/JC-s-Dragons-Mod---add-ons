package motoolsnstuff.common;

import motoolsnstuff.block.BlockAslophogisBlock;
import motoolsnstuff.block.BlockAslophogisOre;
import motoolsnstuff.block.BlockDragoniteBlock;
import motoolsnstuff.block.BlockDragoniteOre;
import motoolsnstuff.block.BlockEurokryteBlock;
import motoolsnstuff.block.BlockEurokryteOre;
import motoolsnstuff.block.BlockMysticLeaves;
import motoolsnstuff.block.BlockMysticLog;
import motoolsnstuff.block.BlockMysticSapling;
import motoolsnstuff.block.BlockSparkleDirt;
import motoolsnstuff.block.BlockSparkleGrass;
import motoolsnstuff.events.MTNSEvents;
import motoolsnstuff.item.EnumMTNSToolMaterial;
import motoolsnstuff.item.ItemAslophogisAxe;
import motoolsnstuff.item.ItemAslophogisCrystal;
import motoolsnstuff.item.ItemAslophogisHoe;
import motoolsnstuff.item.ItemAslophogisPickaxe;
import motoolsnstuff.item.ItemAslophogisShovel;
import motoolsnstuff.item.ItemAslophogisSword;
import motoolsnstuff.item.ItemDragoniteAxe;
import motoolsnstuff.item.ItemDragoniteHoe;
import motoolsnstuff.item.ItemDragoniteIngot;
import motoolsnstuff.item.ItemDragonitePickaxe;
import motoolsnstuff.item.ItemDragoniteShovel;
import motoolsnstuff.item.ItemDragoniteSword;
import motoolsnstuff.item.ItemEurokryteAxe;
import motoolsnstuff.item.ItemEurokryteCrystal;
import motoolsnstuff.item.ItemEurokryteHoe;
import motoolsnstuff.item.ItemEurokrytePickaxe;
import motoolsnstuff.item.ItemEurokryteShovel;
import motoolsnstuff.item.ItemEurokryteSword;
import motoolsnstuff.item.ItemMysticApple;
import motoolsnstuff.item.ItemWand;
import motoolsnstuff.worldgen.WorldGeneratorDragonBros;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "mtns", name = "Mo' Tools'n'stuff", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MTNSBase {	
	@SidedProxy(clientSide = "motoolsnstuff.common.ClientProxyMTNS",
			serverSide = "motoolsnstuff.common.CommonProxyMTNS")
	public static ClientProxyMTNS proxy = new ClientProxyMTNS();
	
	// blocks
		public static Block aslophogisBlock;
		public static Block aslophogisOre;
		public static Block dragoniteBlock;
		public static Block dragoniteOre;
		public static Block eurokryteBlock;
		public static Block eurokryteOre;
		public static Block mysticLog;
		public static Block mysticLeaves;
		public static Block mysticSapling;
		public static Block sparkleGrass;
		public static Block sparkleDirt;
	// block id's
		int aslophogisBlockID;
		int aslophogisOreID;
		int dragoniteBlockID = 502;
		int dragoniteOreID = 503;
		int eurokryteBlockID;
		int eurokryteOreID;
		int mysticLogID;
		int mysticLeavesID;
		int mysticSaplingID;
		int sparkleGrassID = 159;
		int sparkleDirtID = 160;
	// items
		public static Item aslophogisCrystal;
		public static Item aslophogisAxe;
		public static Item aslophogisHoe;
		public static Item aslophogisPickaxe;
		public static Item aslophogisShovel;
		public static Item aslophogisSword;
		public static Item eurokryteCrystal;
		public static Item eurokryteAxe;
		public static Item eurokryteHoe;
		public static Item eurokrytePickaxe;
		public static Item eurokryteShovel;
		public static Item eurokryteSword;
		public static Item dragoniteIngot;
		public static Item dragoniteAxe;
		public static Item dragoniteHoe;
		public static Item dragonitePickaxe;
		public static Item dragoniteShovel;
		public static Item dragoniteSword;
		public static Item dragoniteBucket;
		public static Item appleMystic;
		public static Item wand;
	// item id's
		int aslophogisCrystalID;
		int aslophogisAxeID;
		int aslophogisHoeID;
		int aslophogisPickaxeID;
		int aslophogisShovelID;
		int aslophogisSwordID;
		int eurokryteCrystalID;
		int eurokryteAxeID;
		int eurokryteHoeID;
		int eurokrytePickaxeID;
		int eurokryteShovelID;
		int eurokryteSwordID;
		int dragoniteIngotID;
		int dragoniteAxeID;
		int dragoniteHoeID;
		int dragonitePickaxeID;
		int dragoniteShovelID;
		int dragoniteSwordID;
		int dragoniteBucketID;
		int appleMysticID;
		int wandID;
		
	// enum materials
		
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		// blocks
		aslophogisBlockID = config.get(config.CATEGORY_BLOCK, "Aslophogis Block ID", 500).getInt();
		aslophogisOreID = config.get(config.CATEGORY_BLOCK, "Aslophogis Ore ID", 501).getInt();
		eurokryteBlockID = config.get(config.CATEGORY_BLOCK, "Eurokryte Block ID", 504).getInt();
		eurokryteOreID = config.get(config.CATEGORY_BLOCK, "Eurokryte Ore ID", 505).getInt();
		mysticLogID = config.get(config.CATEGORY_BLOCK, "Mystic Log ID", 506).getInt();
		mysticLeavesID = config.get(config.CATEGORY_BLOCK, "Mystic Leaves ID", 507).getInt();
		mysticSaplingID = config.get(config.CATEGORY_BLOCK, "Mystic Sapling ID", 508).getInt();
		// items
		aslophogisCrystalID = config.get(config.CATEGORY_ITEM, "Aslophogis Crystal ID", 3000).getInt();
		aslophogisAxeID = config.get(config.CATEGORY_ITEM, "Aslophogis Axe ID", 3001).getInt();
		aslophogisHoeID = config.get(config.CATEGORY_ITEM, "Aslophogis Hoe ID", 3002).getInt();
		aslophogisPickaxeID = config.get(config.CATEGORY_ITEM, "Aslophogis Pickaxe ID", 3003).getInt();
		aslophogisShovelID = config.get(config.CATEGORY_ITEM, "Aslophogis Shovel ID", 3004).getInt();
		aslophogisSwordID = config.get(config.CATEGORY_ITEM, "Aslophogis Sword ID", 3005).getInt();
		eurokryteCrystalID = config.get(config.CATEGORY_ITEM, "Eurokryte Crystal ID", 3010).getInt();
		eurokryteAxeID = config.get(config.CATEGORY_ITEM, "Eurokryte Axe ID", 3011).getInt();
		eurokryteHoeID = config.get(config.CATEGORY_ITEM, "Eurokryte Hoe ID", 3012).getInt();
		eurokrytePickaxeID = config.get(config.CATEGORY_ITEM, "Eurokryte Pickaxe ID", 3013).getInt();
		eurokryteShovelID = config.get(config.CATEGORY_ITEM, "Eurokryte Shovel ID", 3014).getInt();
		eurokryteSwordID = config.get(config.CATEGORY_ITEM, "Eurokryte Sword ID", 3015).getInt();
		dragoniteIngotID = config.get(config.CATEGORY_ITEM, "Dragonite Ingot ID", 3020).getInt();
		dragoniteAxeID = config.get(config.CATEGORY_ITEM, "Dragonite Axe ID", 3021).getInt();
		dragoniteHoeID = config.get(config.CATEGORY_ITEM, "Dragonite Hoe ID", 3022).getInt();
		dragonitePickaxeID = config.get(config.CATEGORY_ITEM, "Dragonite Pickaxe ID", 3023).getInt();
		dragoniteShovelID = config.get(config.CATEGORY_ITEM, "Dragonite Shovel ID", 3024).getInt();
		dragoniteSwordID = config.get(config.CATEGORY_ITEM, "Dragonite Sword ID", 3025).getInt();
		dragoniteBucketID = config.get(config.CATEGORY_ITEM, "Dragonite Bucket ID", 3026).getInt();
		appleMysticID = config.get(config.CATEGORY_ITEM, "Mystic Apple ID", 4001).getInt();
		wandID = config.get(config.CATEGORY_ITEM, "Dragon Wand ID", 2085).getInt();
		
		config.save();
			}
			
	@Init
	public void load(FMLInitializationEvent event) {
		proxy.init();
		
		if(Loader.isModLoaded("jcdragons")) {
			MinecraftForge.EVENT_BUS.register(new MTNSEvents());
			FMLLog.severe("Could not find modid jcdragons, skipping.");
			
		}
		
		// blocks
			aslophogisBlock = new BlockAslophogisBlock(aslophogisBlockID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("aslophogisBlock");
			aslophogisOre = new BlockAslophogisOre(aslophogisOreID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("aslophogisOre");
			eurokryteBlock = new BlockEurokryteBlock(eurokryteBlockID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("eurokryteBlock");
			eurokryteOre = new BlockEurokryteOre(eurokryteOreID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("eurokryteOre");
			dragoniteBlock = new BlockDragoniteBlock(dragoniteBlockID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("dragoniteBlock");
			dragoniteOre = new BlockDragoniteOre(dragoniteOreID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("dragoniteOre");
			mysticLog = new BlockMysticLog(mysticLogID).setHardness(1.5F).setResistance(0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("mysticLog");
			mysticLeaves = new BlockMysticLeaves(mysticLeavesID).setHardness(1.5F).setResistance(0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("mysticLeaves");
			mysticSapling = new BlockMysticSapling(mysticSaplingID).setHardness(1.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("mysticSapling");
			sparkleGrass = new BlockSparkleGrass(sparkleGrassID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("sparkleGrass");
			sparkleDirt = new BlockSparkleDirt(sparkleDirtID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("sparkleDirt");
		// items
			aslophogisCrystal = new ItemAslophogisCrystal(aslophogisCrystalID).setUnlocalizedName("aslophogisCrystal");
			aslophogisAxe = new ItemAslophogisAxe(aslophogisAxeID, EnumMTNSToolMaterial.ASLOPHOGIS).setUnlocalizedName("aslophogisAxe");
			aslophogisHoe = new ItemAslophogisHoe(aslophogisHoeID, EnumMTNSToolMaterial.ASLOPHOGIS).setUnlocalizedName("aslophogisHoe");
			aslophogisPickaxe = new ItemAslophogisPickaxe(aslophogisPickaxeID, EnumMTNSToolMaterial.ASLOPHOGIS).setUnlocalizedName("aslophogisPickaxe");
			aslophogisShovel = new ItemAslophogisShovel(aslophogisShovelID, EnumMTNSToolMaterial.ASLOPHOGIS).setUnlocalizedName("aslophogisShovel");
			aslophogisSword = new ItemAslophogisSword(aslophogisSwordID, EnumMTNSToolMaterial.ASLOPHOGIS).setUnlocalizedName("aslophogisSword");
			eurokryteCrystal = new ItemEurokryteCrystal(eurokryteCrystalID).setUnlocalizedName("eurokryteCrystal");
			eurokryteAxe = new ItemEurokryteAxe(eurokryteAxeID, EnumMTNSToolMaterial.EUROKRYTE).setUnlocalizedName("eurokryteAxe");
			eurokryteHoe = new ItemEurokryteHoe(eurokryteHoeID, EnumMTNSToolMaterial.EUROKRYTE).setUnlocalizedName("eurokryteHoe");
			eurokrytePickaxe = new ItemEurokrytePickaxe(eurokrytePickaxeID, EnumMTNSToolMaterial.EUROKRYTE).setUnlocalizedName("eurokrytePickaxe");
			eurokryteShovel = new ItemEurokryteShovel(eurokryteShovelID, EnumMTNSToolMaterial.EUROKRYTE).setUnlocalizedName("eurokryteShovel");
			eurokryteSword = new ItemEurokryteSword(eurokryteSwordID, EnumMTNSToolMaterial.EUROKRYTE).setUnlocalizedName("eurokryteSword");
			dragoniteIngot = new ItemDragoniteIngot(dragoniteIngotID).setUnlocalizedName("dragoniteIngot");
			dragoniteAxe = new ItemDragoniteAxe(dragoniteAxeID, EnumMTNSToolMaterial.DRAGONITE).setUnlocalizedName("dragoniteAxe");
			dragoniteHoe = new ItemDragoniteHoe(dragoniteHoeID, EnumMTNSToolMaterial.DRAGONITE).setUnlocalizedName("dragoniteHoe");
			dragonitePickaxe = new ItemDragonitePickaxe(dragonitePickaxeID, EnumMTNSToolMaterial.DRAGONITE).setUnlocalizedName("dragonitePickaxe");
			dragoniteShovel = new ItemDragoniteShovel(dragoniteShovelID, EnumMTNSToolMaterial.DRAGONITE).setUnlocalizedName("dragoniteShovel");
			dragoniteSword = new ItemDragoniteSword(dragoniteSwordID, EnumMTNSToolMaterial.DRAGONITE).setUnlocalizedName("dragoniteSword");
			appleMystic = new ItemMysticApple(appleMysticID).setUnlocalizedName("appleMystic");
			wand = new ItemWand(wandID).setUnlocalizedName("wand");
		
		gameRegisters();
		languageRegisters();
		craftingRecipeRegisters();
		smeltingRecipeRegisters();
	}
			
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public void gameRegisters() {
		GameRegistry.registerBlock(aslophogisBlock);
		GameRegistry.registerBlock(aslophogisOre);
		GameRegistry.registerBlock(eurokryteBlock);
		GameRegistry.registerBlock(eurokryteOre);
		GameRegistry.registerBlock(dragoniteBlock);
		GameRegistry.registerBlock(dragoniteOre);
		GameRegistry.registerBlock(mysticLog);
		GameRegistry.registerBlock(mysticLeaves);
		GameRegistry.registerBlock(mysticSapling);
		GameRegistry.registerBlock(sparkleGrass);
		GameRegistry.registerBlock(sparkleDirt);
		
		GameRegistry.registerWorldGenerator(new WorldGeneratorDragonBros());
	}
		
	public void languageRegisters() {
		// blocks
		LanguageRegistry.addName(aslophogisBlock, "Aslophogis Block");
		LanguageRegistry.addName(aslophogisOre, "Aslophogis Ore");
		LanguageRegistry.addName(eurokryteBlock, "Eurokryte Block");
		LanguageRegistry.addName(eurokryteOre, "Eurokryte Ore");
		LanguageRegistry.addName(dragoniteBlock, "Dragonite Block");
		LanguageRegistry.addName(dragoniteOre, "Dragonite Ore");
		LanguageRegistry.addName(mysticLog, "Mystic Wood");
		LanguageRegistry.addName(mysticLeaves, "Mystic Leaves");
		LanguageRegistry.addName(mysticSapling, "Mystic Sapling");
		LanguageRegistry.addName(sparkleGrass, "Sparkle Grass");
		LanguageRegistry.addName(sparkleDirt, "Sparkle Dirt");
		// items
		LanguageRegistry.addName(aslophogisCrystal, "Aslophogis Crystal");
		LanguageRegistry.addName(aslophogisAxe, "Aslophogis Axe");
		LanguageRegistry.addName(aslophogisHoe, "Aslophogis Hoe");
		LanguageRegistry.addName(aslophogisPickaxe, "Aslophogis Pickaxe");
		LanguageRegistry.addName(aslophogisShovel, "Aslophogis Shovel");
		LanguageRegistry.addName(aslophogisSword, "Aslophogis Sword");
		LanguageRegistry.addName(eurokryteCrystal, "Eurokryte Crystal");
		LanguageRegistry.addName(eurokryteAxe, "Eurokryte Axe");
		LanguageRegistry.addName(eurokryteHoe, "Eurokryte Hoe");
		LanguageRegistry.addName(eurokrytePickaxe, "Eurokryte Pickaxe");
		LanguageRegistry.addName(eurokryteShovel, "Eurokryte Shovel");
		LanguageRegistry.addName(eurokryteSword, "Eurokryte Sword");
		LanguageRegistry.addName(dragoniteIngot, "Dragonite Ingot");
		LanguageRegistry.addName(dragoniteAxe, "Dragonite Axe");
		LanguageRegistry.addName(dragoniteHoe, "Dragonite Hoe");
		LanguageRegistry.addName(dragonitePickaxe, "Dragonite Pickaxe");
		LanguageRegistry.addName(dragoniteShovel, "Dragonite Shovel");
		LanguageRegistry.addName(dragoniteSword, "Dragonite Sword");
		LanguageRegistry.addName(appleMystic, "Mystic Apple");
		LanguageRegistry.addName(wand, "Dragon Wand");
	}
	
	public void craftingRecipeRegisters() {
		// tool recipes
		// aslophogis
			GameRegistry.addRecipe(new ItemStack(aslophogisAxe, 1), new Object[] {
				"XX ", "XI ", " I ", Character.valueOf('X'), this.aslophogisCrystal, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(aslophogisAxe, 1), new Object[] {
				" XX", " IX", " I ", Character.valueOf('X'), this.aslophogisCrystal, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(aslophogisHoe, 1), new Object[] {
				"XX ", " I ", " I ", Character.valueOf('X'), this.aslophogisCrystal, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(aslophogisHoe, 1), new Object[] {
				" XX", " I ", " I ", Character.valueOf('X'), this.aslophogisCrystal, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(aslophogisPickaxe, 1), new Object[] {
				"XXX", " I ", " I ", Character.valueOf('X'), this.aslophogisCrystal, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(aslophogisShovel, 1), new Object[] {
				"X", "I", "I", Character.valueOf('X'), this.aslophogisCrystal, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(aslophogisSword, 1), new Object[] {
				"X", "X", "I", Character.valueOf('X'), this.aslophogisCrystal, Character.valueOf('I'), Item.stick
			});
		// eurokryte
			GameRegistry.addRecipe(new ItemStack(eurokryteAxe, 1), new Object[] {
				"XX ", "XI ", " I ", Character.valueOf('X'), this.eurokryteCrystal, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(eurokryteAxe, 1), new Object[] {
				" XX", " IX", " I ", Character.valueOf('X'), this.eurokryteCrystal, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(eurokryteHoe, 1), new Object[] {
				"XX ", " I ", " I ", Character.valueOf('X'), this.eurokryteCrystal, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(eurokryteHoe, 1), new Object[] {
				" XX", " I ", " I ", Character.valueOf('X'), this.eurokryteCrystal, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(eurokrytePickaxe, 1), new Object[] {
				"XXX", " I ", " I ", Character.valueOf('X'), this.eurokryteCrystal, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(eurokryteShovel, 1), new Object[] {
				"X", "I", "I", Character.valueOf('X'), this.eurokryteCrystal, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(eurokryteSword, 1), new Object[] {
				"X", "X", "I", Character.valueOf('X'), this.eurokryteCrystal, Character.valueOf('I'), Item.stick
			});
		// dragonite
			GameRegistry.addRecipe(new ItemStack(dragoniteAxe, 1), new Object[] {
				"XX ", "XI ", " I ", Character.valueOf('X'), this.dragoniteIngot, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(dragoniteAxe, 1), new Object[] {
				" XX", " IX", " I ", Character.valueOf('X'), this.dragoniteIngot, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(dragoniteHoe, 1), new Object[] {
				"XX ", " I ", " I ", Character.valueOf('X'), this.dragoniteIngot, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(dragoniteHoe, 1), new Object[] {
				" XX", " I ", " I ", Character.valueOf('X'), this.dragoniteIngot, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(dragonitePickaxe, 1), new Object[] {
				"XXX", " I ", " I ", Character.valueOf('X'), this.dragoniteIngot, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(dragoniteShovel, 1), new Object[] {
				"X", "I", "I", Character.valueOf('X'), this.dragoniteIngot, Character.valueOf('I'), Item.stick
			});
			GameRegistry.addRecipe(new ItemStack(dragoniteSword, 1), new Object[] {
				"X", "X", "I", Character.valueOf('X'), this.dragoniteIngot, Character.valueOf('I'), Item.stick
			});
		// block recipes
		// aslophogis
			GameRegistry.addRecipe(new ItemStack(aslophogisBlock, 1), new Object[] {
				"XXX", "XXX", "XXX", Character.valueOf('X'), this.aslophogisCrystal
			});
		// eurokryte
			GameRegistry.addRecipe(new ItemStack(eurokryteBlock, 1), new Object[] {
				"XXX", "XXX", "XXX", Character.valueOf('X'), this.eurokryteCrystal
			});
		// dagonite
			GameRegistry.addRecipe(new ItemStack(dragoniteBlock, 1), new Object[] {
				"XXX", "XXX", "XXX", Character.valueOf('X'), this.dragoniteIngot
			});
		// items
			GameRegistry.addRecipe(new ItemStack(wand, 1), new Object[] {
				"DED", " S ", " A ", Character.valueOf('D'), this.dragoniteIngot, Character.valueOf('E'), this.eurokryteCrystal,
				Character.valueOf('A'), this.aslophogisCrystal, Character.valueOf('S'), Item.stick
			});
	}
			
	public void smeltingRecipeRegisters() {
		GameRegistry.addSmelting(this.dragoniteOre.blockID, new ItemStack(this.dragoniteIngot, 1), 10F);
	}
}
