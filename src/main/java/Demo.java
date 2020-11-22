import entity.Player;
import gui.UI;
import java.util.ArrayList;
import java.util.List;

public class Demo {
  public static void main(String[] args) {
    Player player = new Player();
    List<String> playlist = new ArrayList<>();
    playlist.add("Rihanna");
    playlist.add("Adele");
    playlist.add("Alan Walker");
    player.setPlaylist(playlist);
    UI ui = new UI(player);
    ui.init();
  }
}
