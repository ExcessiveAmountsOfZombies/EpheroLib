package com.epherical.epherolib.client.widgets;

import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.resources.ResourceLocation;

public class PatreonButton extends ImageButton {
    private static final WidgetSprites TEXTURES = new WidgetSprites(
            ResourceLocation.fromNamespaceAndPath("epherolib", "textures/gui/links/pat_logo.png"),
            ResourceLocation.fromNamespaceAndPath("epherolib", "textures/gui/links/pat_logo_highlight.png"));

    public PatreonButton(int x, int y, OnPress onPress) {
        super(x, y, 17, 18, TEXTURES, onPress);
    }
}
