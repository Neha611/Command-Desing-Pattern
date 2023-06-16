public class RemoteController {
    Command command;
    public RemoteController()
    {

    }
    public void setCommand(Command command)
    {
        this.command = command;
    }
    public void pressButton()
    {
        this.command.execute();
    }
}
