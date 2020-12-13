package me.hsgamer.bettergui.legacysimplebutton;

import me.hsgamer.bettergui.api.addon.BetterGUIAddon;
import me.hsgamer.bettergui.builder.ButtonBuilder;

public final class Main extends BetterGUIAddon {

    @Override
    public void onEnable() {
        ButtonBuilder.INSTANCE.register(SimpleButton::new, "simple");
    }
}
