package eu.decentsoftware.holograms.nms.paper_v26_1;

import eu.decentsoftware.holograms.nms.api.renderer.NmsSmallHeadHologramRenderer;

class SmallHeadHologramRenderer extends HeadHologramRenderer implements NmsSmallHeadHologramRenderer {

    SmallHeadHologramRenderer(EntityIdGenerator entityIdGenerator) {
        super(entityIdGenerator, true);
    }

}
