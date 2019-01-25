package viking.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModTransport extends CreativeTabs{

	public ModTransport(String label) {
		super("modtransport");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.BOAT);
	}

}