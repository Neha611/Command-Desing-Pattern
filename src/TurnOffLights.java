public class TurnOffLights implements Command{
    private Lights lights;
    public TurnOffLights(Lights lights)
    {
        this.lights=lights;
    }
    @Override
    public void execute(){
        this.lights.TurnOff();
    }
}
