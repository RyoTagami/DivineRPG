package divinerpg.objects.entities.assets.render.vethea;

import javax.annotation.Nullable;

import divinerpg.objects.entities.assets.model.vethea.ModelHelio;
import divinerpg.objects.entities.entity.vethea.EntityHelio;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderHelio extends RenderLiving<EntityHelio> {
	
	public static final IRenderFactory FACTORY = new Factory();
	ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/helio.png");
	private final ModelHelio modelEntity;
    
	public RenderHelio(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelHelio(), 1F);
        modelEntity = (ModelHelio) super.mainModel;

    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityHelio entity) {
        return texture;
    }

	 public static class Factory implements IRenderFactory<EntityHelio> {

	        @Override
	        public Render<? super EntityHelio> createRenderFor(RenderManager manager) {
	            return new RenderHelio(manager, new ModelHelio(), 1F);
	        }
	    }

	}