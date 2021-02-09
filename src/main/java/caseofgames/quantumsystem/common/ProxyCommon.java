package caseofgames.quantumsystem.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.IForgeRegistry;

import static caseofgames.quantumsystem.common.QSBlocks.*;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ProxyCommon
{
	@SubscribeEvent
	public static void onBlockRegistry(final RegistryEvent.Register<Block> event)
	{
		IForgeRegistry<Block> reg = event.getRegistry();
		reg.register(blocksilicon);
	}
	
	@SubscribeEvent
	public static void onItemRegistration(final RegistryEvent.Register<Item> event)
	{
		IForgeRegistry<Item> reg = event.getRegistry();
		reg.register(blocksilicon.getBlockItem());
	}
	
	@SubscribeEvent
	public static void onCommonSetup(FMLCommonSetupEvent event)
	{
		// Unused. Might come back in the future
	}
}
