package viking.mod.tabs;

import viking.mod.init.BlockInit;
import viking.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModBlocks extends CreativeTabs{

	public ModBlocks(String label) {
		super("modblocks");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(BlockInit.SPIRE_STONE);
	}

}