package me.kaloyankys.foodmodplus.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockBase extends BlockItem {
	public BlockBase(Block block) {
		super(block, new Item.Properties().group(ItemGroup.FOOD));
	}
}
