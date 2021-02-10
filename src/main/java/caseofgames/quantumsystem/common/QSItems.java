package caseofgames.quantumsystem.common;

import java.util.ArrayList;

import net.minecraft.item.Item;

import caseofgames.quantumsystem.item.ItemIngotSilicon;

public class QSItems
{
	public static ArrayList<Item> modItems = new ArrayList<>();
	
	public static ItemIngotSilicon ingotsilicon = new ItemIngotSilicon();
	
	public static void init()
	{
		modItems.add(ingotsilicon);
		
		// The initial size of ArrayList is 10. This reduces it to 1 to optimize the foreach loop
		modItems.trimToSize();
	}
}
