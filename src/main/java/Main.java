import zero.ui.Label;
import zero.App;

public class Main extends App {
    @Override public void settings() { padding(20); }

    public void setup() {
        var greeting = new Label("Say hi to the new Galaxy Note \nGeorge Harris SR: hi");
        show(greeting);
    }
    public static void main(String[] args) { launch(args); }
}
