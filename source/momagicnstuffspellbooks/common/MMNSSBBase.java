package momagicnstuffspellbooks.common;

import momagicnstuffspellbooks.item.ItemEarthBook;
import momagicnstuffspellbooks.item.ItemFireBook;
import momagicnstuffspellbooks.item.ItemIceBook;
import momagicnstuffspellbooks.item.ItemLightningBook;
import momagicnstuffspellbooks.item.ItemWindBook;
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

@Mod(modid = "mmnssb", name = "Mo' Magic'n'stuff", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MMNSSBBase {	
	@SidedProxy(clientSide = "momagicnstuffspellbooks.common.ClientProxyMMNSSB",
			serverSide = "momagicnstuffspellbooks.common.CommonProxyMMNSSB")
	public static ClientProxyMMNSSB proxy = new ClientProxyMMNSSB();
	
	// items
		public static Item earthBook;
		public static Item fireBook;
		public static Item iceBook;
		public static Item lightningBook;
		public static Item windBook;
	// item id's
		int earthBookID;
		int fireBookID;
		int iceBookID;
		int lightningBookID;
		int windBookID;
		
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		// items
			earthBookID = config.get(config.CATEGORY_ITEM, "Earth Book ID", 2090).getInt();
			fireBookID = config.get(config.CATEGORY_ITEM, "Fire Book ID", 2091).getInt();
			iceBookID = config.get(config.CATEGORY_ITEM, "Ice Book ID", 2092).getInt();
			lightningBookID = config.get(config.CATEGORY_ITEM, "Lightning Book ID", 2093).getInt();
			windBookID = config.get(config.CATEGORY_ITEM, "Wind Book ID", 2094).getInt();
		config.save();
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		proxy.init();
		// items
			earthBook = new ItemEarthBook(earthBookID).setUnlocalizedName("earthBook");
			fireBook = new ItemFireBook(fireBookID).setUnlocalizedName("fireBook");
			iceBook = new ItemIceBook(iceBookID).setUnlocalizedName("iceBook");
			lightningBook = new ItemLightningBook(lightningBookID).setUnlocalizedName("lightningBook");
			windBook = new ItemWindBook(windBookID).setUnlocalizedName("windBook");
					
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
			LanguageRegistry.addName(earthBook, "Book of Earth");
			LanguageRegistry.addName(fireBook, "Book of Fire");
			LanguageRegistry.addName(iceBook, "Book of Ice");
			LanguageRegistry.addName(lightningBook, "Book of Lightning");
			LanguageRegistry.addName(windBook, "Book of Wind");
	}
}