public class Main {
    public static void main(String[] args) {
        Lights lights=new Lights(); //executor
        RemoteController remote=new RemoteController(); //controller
        Command c1=new TurnOnLights(lights);
        Command c2=new TurnOffLights(lights);
        remote.setCommand(c1);
        remote.pressButton(); //invoking command
        remote.setCommand(c2);
        remote.pressButton();
    }
}