package caseofgames.quantumsystem.block;

import net.minecraft.item.BlockItem;

public interface IBlockItemProvider
{
	BlockItem createBlockItem();
	BlockItem getBlockItem();
}
