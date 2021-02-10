package caseofgames.quantumsystem.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static caseofgames.quantumsystem.QuantumSystem.*;

public class ItemIngotSilicon extends Item
{
	public ItemIngotSilicon()
	{
		super(new Item.Properties().group(ItemGroup.MISC));
		
		setRegistryName(MODID, "ingotsilicon");
	}
}
