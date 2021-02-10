package caseofgames.quantumsystem;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import caseofgames.quantumsystem.client.ProxyClient;
import caseofgames.quantumsystem.common.ProxyCommon;
import caseofgames.quantumsystem.common.QSBlocks;
import caseofgames.quantumsystem.common.QSItems;
import caseofgames.quantumsystem.util.ForgeLoggerTweaker;

@Mod(QuantumSystem.MODID)
public class QuantumSystem
{
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "quantumsystem";

	public static IEventBus MOD_EVENT_BUS;

	public QuantumSystem()
	{
		final boolean HIDE_CONSOLE_EXTRA = true;
		if (HIDE_CONSOLE_EXTRA)
		{
			ForgeLoggerTweaker.setMinimumLevel(Level.WARN);
			ForgeLoggerTweaker.applyLoggerFilter();
		}
		
		MOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();

		MinecraftForge.EVENT_BUS.register(this);
		
		QSBlocks.init();
		QSItems.init();
		
		registerCommonEvents();
		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> registerClientOnlyEvents());
	}
	
	public static void registerCommonEvents()
	{
		MOD_EVENT_BUS.register(ProxyCommon.class);
	}
	
	public static void registerClientOnlyEvents()
	{
		MOD_EVENT_BUS.register(ProxyClient.class);
	}
}
