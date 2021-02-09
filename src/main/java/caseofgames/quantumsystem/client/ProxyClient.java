package caseofgames.quantumsystem.client;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static caseofgames.quantumsystem.common.QSBlocks.*;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ProxyClient
{
	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(blocksilicon, RenderType.getSolid());
	}
}
