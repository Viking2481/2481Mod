package viking.mod.tabs;

import viking.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModFood extends CreativeTabs{

	public ModFood(String label) {
		super("modfood");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.APPLE);
	}

}