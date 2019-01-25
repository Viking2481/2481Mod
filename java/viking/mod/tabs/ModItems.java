package viking.mod.tabs;

import viking.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModItems extends CreativeTabs{

	public ModItems(String label) {
		super("moditems");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.SA_GEM);
	}

}