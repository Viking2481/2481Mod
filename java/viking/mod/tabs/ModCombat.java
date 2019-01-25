package viking.mod.tabs;

import viking.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModCombat extends CreativeTabs{

	public ModCombat(String label) {
		super("modcombat");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.P_SWORD);
	}

}