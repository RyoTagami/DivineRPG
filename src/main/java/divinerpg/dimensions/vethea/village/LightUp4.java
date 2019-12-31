/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package divinerpg.dimensions.vethea.village;
import java.util.Random;

import divinerpg.dimensions.vethea.VetheaWorldGenerator;
import divinerpg.objects.entities.entity.vethea.EntityTheHunger;
import divinerpg.registry.ModBlocks;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class LightUp4 extends VetheaWorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public LightUp4() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		EntityLiving entity = new EntityTheHunger(world);
		entity.setLocationAndAngles(i-1.0F, j +1.0F, k-1.0F, 0.0F, 0.0F);
		world.spawnEntity(entity);
		
		setBlock(world, i + 0, j + 0, k + 0, ModBlocks.darkEverstone);
		setBlock(world, i + 0, j + 0, k + 2, ModBlocks.darkEverstone);
		setBlock(world, i + 0, j + 1, k + 0, ModBlocks.firelight);
		setBlock(world, i + 0, j + 1, k + 2, ModBlocks.firelight);
		setBlock(world, i + 0, j + 2, k + 0, ModBlocks.darkEverstone);
		setBlock(world, i + 0, j + 2, k + 1, ModBlocks.darkEverstone);
		setBlock(world, i + 0, j + 2, k + 2, ModBlocks.darkEverstone);
		setBlock(world, i + 0, j + 3, k + 0, ModBlocks.firelight);
		setBlock(world, i + 0, j + 3, k + 2, ModBlocks.firelight);
		setBlock(world, i + 0, j + 4, k + 0, ModBlocks.darkEverstone);
		setBlock(world, i + 0, j + 4, k + 1, ModBlocks.darkEverstone);
		setBlock(world, i + 0, j + 4, k + 2, ModBlocks.darkEverstone);
		setBlock(world, i + 0, j + 5, k + 0, ModBlocks.firelight);
		setBlock(world, i + 0, j + 5, k + 2, ModBlocks.firelight);
		setBlock(world, i + 0, j + 6, k + 0, ModBlocks.firelight);
		setBlock(world, i + 0, j + 6, k + 2, ModBlocks.firelight);
		setBlock(world, i + 1, j + 2, k + 0, ModBlocks.darkEverstone);
		setBlock(world, i + 1, j + 2, k + 2, ModBlocks.darkEverstone);
		setBlock(world, i + 1, j + 4, k + 0, ModBlocks.darkEverstone);
		setBlock(world, i + 1, j + 4, k + 2, ModBlocks.darkEverstone);
		setBlock(world, i + 2, j + 0, k + 0, ModBlocks.darkEverstone);
		setBlock(world, i + 2, j + 0, k + 2, ModBlocks.darkEverstone);
		setBlock(world, i + 2, j + 1, k + 0, ModBlocks.firelight);
		setBlock(world, i + 2, j + 1, k + 2, ModBlocks.firelight);
		setBlock(world, i + 2, j + 2, k + 0, ModBlocks.darkEverstone);
		setBlock(world, i + 2, j + 2, k + 1, ModBlocks.darkEverstone);
		setBlock(world, i + 2, j + 2, k + 2, ModBlocks.darkEverstone);
		setBlock(world, i + 2, j + 3, k + 0, ModBlocks.firelight);
		setBlock(world, i + 2, j + 3, k + 2, ModBlocks.firelight);
		setBlock(world, i + 2, j + 4, k + 0, ModBlocks.darkEverstone);
		setBlock(world, i + 2, j + 4, k + 1, ModBlocks.darkEverstone);
		setBlock(world, i + 2, j + 4, k + 2, ModBlocks.darkEverstone);
		setBlock(world, i + 2, j + 5, k + 0, ModBlocks.firelight);
		setBlock(world, i + 2, j + 5, k + 2, ModBlocks.firelight);
		setBlock(world, i + 2, j + 6, k + 0, ModBlocks.firelight);
		setBlock(world, i + 2, j + 6, k + 2, ModBlocks.firelight);

		return true;
	}
}