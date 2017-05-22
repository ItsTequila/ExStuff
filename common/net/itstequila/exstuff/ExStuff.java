package net.itstequila.exstuff;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExStuff.MOD_ID, name = ExStuff.MOD_NAME, version = ExStuff.VERSION, dependencies = ExStuff.DEPENDENCIES)
public class ExStuff {

	public static final String MOD_ID = "exstuff";
	public static final String MOD_NAME = "ItsTequila's ExStuff Mod";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[13.20.0.2304,)";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
	
	//variables
	public static Random random = new Random ();
	
	@Instance(MOD_ID)
	public static ExStuff instance;
	
	@SidedProxy(clientSide = "net.itstequila.exstuff.ClientProxy", serverSide = "net.itstequila.exstuff.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		proxy.postInit(event);
	}
}
