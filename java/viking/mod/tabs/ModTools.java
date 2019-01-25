package viking.mod.tabs;

import viking.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTools extends CreativeTabs{

	public ModTools(String label) {
		super("modtools");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.SP_AXE);
	}

}