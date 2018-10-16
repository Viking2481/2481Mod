package viking.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import viking.mod.objects.blocks.BlockBase;
import viking.mod.util.interfaces.IHasModel;

public class BlockInit
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SA_BLOCK = new BlockBase("sa_block", Material.IRON);
}
