package marumasa.autoattack;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("autoattack")
public class Autoattack {
    public Autoattack(){
        MinecraftForge.EVENT_BUS.register((new Events()));
    }
}
