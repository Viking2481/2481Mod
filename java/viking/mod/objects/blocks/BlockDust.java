package viking.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.Sound;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import viking.mod.Main;
import viking.mod.init.BlockInit;
import viking.mod.init.ItemInit;
import viking.mod.util.interfaces.IHasModel;

public class BlockDust extends BlockBase
{

	public BlockDust(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.SAND);
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("spade", 0);
	}
	
}
