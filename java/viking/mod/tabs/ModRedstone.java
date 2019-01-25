package viking.mod.tabs;

import viking.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRedstone extends CreativeTabs{

	public ModRedstone(String label) 
	{
		super("modredstone");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.REDSTONE);
	}

}