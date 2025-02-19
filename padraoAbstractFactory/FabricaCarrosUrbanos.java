package padraoAbstractFactory;

public class FabricaCarrosUrbanos implements FabricaCarros {
    @Override
    public Motor criarMotor() {
        return new MotorUrbano();
    }

    @Override
    public Rodas criarRodas() {
        return new RodasUrbanas();
    }

    @Override
    public Direcao criarDirecao() {
        return new DirecaoUrbana();
    }
}