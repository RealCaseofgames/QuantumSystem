package caseofgames.quantumsystem.common;

import static caseofgames.quantumsystem.common.QSBlocks.*;
import static caseofgames.quantumsystem.common.QSItems.*;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.IForgeRegistry;

import caseofgames.quantumsystem.block.IBlockItemProvider;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ProxyCommon
{
	@SubscribeEvent
	public static void onBlockRegistry(final RegistryEvent.Register<Block> event)
	{
		IForgeRegistry<Block> reg = event.getRegistry();
		
		for (Block block : modBlocks)
		{
			reg.register(block);
		}
	}
	
	@SubscribeEvent
	public static void onItemRegistration(final RegistryEvent.Register<Item> event)
	{
		// Register ItemBlocks first (Shut up! They're ItemBlocks, not BlockItems)
		IForgeRegistry<Item> reg = event.getRegistry();
		for (Block block : modBlocks)
		{
			if (block instanceof IBlockItemProvider)
			{
				reg.register(((IBlockItemProvider) block).getBlockItem());
			}
		}
		
		// Now register actual items
		for (Item item : modItems)
		{
			reg.register(item);
		}
	}
	
	@SubscribeEvent
	public static void onCommonSetup(FMLCommonSetupEvent event)
	{
		// Unused. Might come back in the future
	}
}
