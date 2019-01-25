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

public class BlockSpace extends BlockBase
{

	public BlockSpace(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.SLIME);
		setHardness(2000000000.0F);
		setResistance(1000000000.0F);
		setHarvestLevel("pickaxe, axe, spade, sword, hoe", 1000000000);
		setLightLevel(12.5F);
	}
	
}
