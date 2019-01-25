package viking.mod.tabs;

import viking.mod.init.BlockInit;
import viking.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ModDecoration extends CreativeTabs{

	public ModDecoration(String label) 
	{
		super("moddecoration");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Blocks.LEAVES);
	}

}