package caseofgames.quantumsystem.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static caseofgames.quantumsystem.QuantumSystem.*;

public class BlockSiliconOre extends Block implements IBlockItemProvider
{
	public static final String id = "blocksiliconore";
	
	private BlockItem blockItem;
	
	public BlockSiliconOre()
	{
		super(Properties.create(Material.IRON)
				.setRequiresTool()
				.hardnessAndResistance(5, 6)
				.sound(SoundType.STONE));
		
		setRegistryName(MODID, id);
		
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
