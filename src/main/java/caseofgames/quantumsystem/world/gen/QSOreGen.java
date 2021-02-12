package caseofgames.quantumsystem.world.gen;

import static caseofgames.quantumsystem.QuantumSystem.*;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

import caseofgames.quantumsystem.common.QSBlocks;

@EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class QSOreGen
{
	public static void generateOres(final BiomeLoadingEvent event)
	{
		switch (event.getCategory())
		{
		case NETHER:
			break;
		case THEEND:
			break;
		default:
			generateOre(event.getGeneration(),
					FillerBlockType.BASE_STONE_OVERWORLD,
					QSBlocks.blocksiliconore.getDefaultState(),
					12,
					11,
					32,
					6);
			break;
		}
	}
	
	private static void generateOre(BiomeGenerationSettingsBuilder settings, 
			RuleTest fillerType, 
			BlockState state, 
			int veinSize, 
			int minHeight, 
			int maxHeight, 
			int amountPerChunk)
	{
		settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
				Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
				.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
				.square().func_242731_b(amountPerChunk));
	}
}
