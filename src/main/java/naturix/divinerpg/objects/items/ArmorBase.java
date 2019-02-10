package naturix.divinerpg.objects.items;

import naturix.divinerpg.DivineRPG;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

public class ArmorBase extends net.minecraft.item.ItemArmor {

	private String name;

	public ArmorBase(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return null;
	}

	public void registerItemModel() {
		DivineRPG.proxy.registerItemRenderer(this, 0, name);
	}

}