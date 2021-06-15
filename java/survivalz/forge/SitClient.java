package survivalz.forge;

import net.minecraft.client.renderer.culling.ClippingHelper;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import survivalz.forge.init.ModEntityType;
import survivalz.forge.init.entities.SitEntity;

@EventBusSubscriber(bus=Bus.MOD, value=Dist.CLIENT)
public class SitClient{

    private static class EmptyRenderer extends EntityRenderer<SitEntity>
    {
        protected EmptyRenderer(EntityRendererManager renderManager)
        {
            super(renderManager);
        }

        @Override
        public boolean shouldRender(SitEntity entity, ClippingHelper camera, double camX, double camY, double camZ)
        {
            return false;
        }

        @Override
        public ResourceLocation getTextureLocation(SitEntity p_110775_1_) {
            return null;
        }

    }
}