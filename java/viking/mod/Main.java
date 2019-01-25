package viking.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import viking.mod.proxy.CommonProxy;
import viking.mod.tabs.ModBlocks;
import viking.mod.tabs.ModCombat;
import viking.mod.tabs.ModDecoration;
import viking.mod.tabs.ModFood;
import viking.mod.tabs.ModItems;
import viking.mod.tabs.ModRedstone;
import viking.mod.tabs.ModTools;
import viking.mod.tabs.ModTransport;
import viking.mod.util.Reference;
import viking.mod.util.handlers.RegistryHandler;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{	
	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	public static final CreativeTabs modblocks = new ModBlocks("modblocks");
	public static final CreativeTabs moddecoration = new ModDecoration("moddecoration");
	public static final CreativeTabs modredstone = new ModRedstone("modredstone");
	public static final CreativeTabs modtransport = new ModTransport("modtransport");
	public static final CreativeTabs moditems = new ModItems("moditems");
	public static final CreativeTabs modfood = new ModFood("modfood");
	public static final CreativeTabs modtools = new ModTools("modtools");
	public static final CreativeTabs modcombat = new ModCombat("modcombat");

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {RegistryHandler.preInitRegistries();}
	@EventHandler
	public static void init(FMLInitializationEvent event) {RegistryHandler.initRegistries();}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {RegistryHandler.postInitRegistries();}
}
