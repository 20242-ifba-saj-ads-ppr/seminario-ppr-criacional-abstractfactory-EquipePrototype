package padraoAbstractFactory;

public class FabricaCarrosEsportivos implements FabricaCarros {
    @Override
    public Motor criarMotor() {
        return new MotorEsportivo();
    }

    @Override
    public Rodas criarRodas() {
        return new RodasEsportivas();
    }

    @Override
    public Direcao criarDirecao() {
        return new DirecaoEsportiva();
    }
}
