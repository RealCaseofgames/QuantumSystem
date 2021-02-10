package caseofgames.quantumsystem.common;

import java.util.ArrayList;

import net.minecraft.block.Block;

import caseofgames.quantumsystem.block.BlockSilicon;

// Did I ever tell you that deferred registers are impossible to work with.
public class QSBlocks
{
	public static ArrayList<Block> modBlocks = new ArrayList<>();
	
	public static BlockSilicon blocksilicon = new BlockSilicon();
	
	public static void init()
	{
		modBlocks.add(blocksilicon);
		
		// The initial size of ArrayList is 10. This reduces it to 1 to optimize the foreach loop
		modBlocks.trimToSize();
	}
}
