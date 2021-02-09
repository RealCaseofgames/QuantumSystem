package caseofgames.quantumsystem.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import caseofgames.quantumsystem.QuantumSystem;

public class BlockSilicon extends Block implements IBlockItemProvider
{
	private static final String id = "blocksilicon";
	
	private BlockItem blockItem;
	
	public BlockSilicon()
	{
		super(Properties.create(Material.IRON)
				.setRequiresTool()
				.hardnessAndResistance(5, 6)
				.sound(SoundType.METAL));
		
		setRegistryName(QuantumSystem.MODID, id);
		
		blockItem = createBlockItem();
	}

	@Override
	public BlockItem createBlockItem()
	{
		Item.Properties blockItemProps = new Item.Properties().group(ItemGroup.BUILDING_BLOCKS);
		return (BlockItem) new BlockItem(this, blockItemProps).setRegistryName(getRegistryName());
	}
	
	@Override
	public BlockItem getBlockItem()
	{
		return blockItem;
	}
	
	@Override
	public BlockRenderType getRenderType(BlockState state)
	{
		return BlockRenderType.MODEL;
	}
}
