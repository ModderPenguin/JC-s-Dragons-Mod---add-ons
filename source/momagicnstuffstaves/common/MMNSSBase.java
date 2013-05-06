package momagicnstuffstaves.common;

import momagicnstuffstaves.item.ItemEarthStaff;
import momagicnstuffstaves.item.ItemFireStaff;
import momagicnstuffstaves.item.ItemIceStaff;
import momagicnstuffstaves.item.ItemLightningStaff;
import momagicnstuffstaves.item.ItemWindStaff;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "mmnss", name = "Mo' Magic'n'stuff Staves", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MMNSSBase {	
	@SidedProxy(clientSide = "momagicnstuffstaves.common.ClientProxyMMNSS",
			serverSide = "momagicnstuffstaves.common.CommonProxyMMNSS")
	public static ClientProxyMMNSS proxy = new ClientProxyMMNSS();
	
	// items
		public static Item earthStaff;
		public static Item fireStaff;
		public static Item iceStaff;
		public static Item lightningStaff;
		public static Item windStaff;
	// item id's
		int earthStaffID;
		int fireStaffID;
		int iceStaffID;
		int lightningStaffID;
		int windStaffID;
		
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		// items
			earthStaffID = config.get(config.CATEGORY_ITEM, "Earth Staff ID", 2080).getInt();
			fireStaffID = config.get(config.CATEGORY_ITEM, "Fire Staff ID", 2081).getInt();
			iceStaffID = config.get(config.CATEGORY_ITEM, "Ice Staff ID", 2082).getInt();
			lightningStaffID = config.get(config.CATEGORY_ITEM, "Lightning Staff ID", 2083).getInt();
			windStaffID = config.get(config.CATEGORY_ITEM, "Wind Staff ID", 2084).getInt();
		config.save();
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		proxy.init();
		// items
			earthStaff = new ItemEarthStaff(earthStaffID).setUnlocalizedName("earthStaff");
			fireStaff = new ItemFireStaff(fireStaffID).setUnlocalizedName("fireStaff");
			iceStaff = new ItemIceStaff(iceStaffID).setUnlocalizedName("iceStaff");
			lightningStaff = new ItemLightningStaff(lightningStaffID).setUnlocalizedName("lightningStaff");
			windStaff = new ItemWindStaff(windStaffID).setUnlocalizedName("windStaff");
					
		gameRegisters();
		languageRegisters();
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public void gameRegisters() {
		
	}
	
	public void languageRegisters() {
		// items
			LanguageRegistry.addName(earthStaff, "Staff of Earth");
			LanguageRegistry.addName(fireStaff, "Staff of Fire");
			LanguageRegistry.addName(iceStaff, "Staff of Ice");
			LanguageRegistry.addName(lightningStaff, "Staff of Lightning");
			LanguageRegistry.addName(windStaff, "Staff of Wind");
	}
}