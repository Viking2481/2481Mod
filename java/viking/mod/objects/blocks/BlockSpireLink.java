package viking.mod.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockSpireLink extends BlockBase
{
	
	public BlockSpireLink(String name)
	{
		super(name, Material.IRON);
	}
}
