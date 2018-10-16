package viking.mod;

import viking.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs
{
	public ModTab(String label) { super("modtab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.SA_GEM);}
}