public class TurnOnLights implements Command{
    private Lights lights;
    public TurnOnLights(Lights lights)
    {
        this.lights=lights;
    }
    @Override
    public void execute(){
        this.lights.TurnOn();
    }
}
