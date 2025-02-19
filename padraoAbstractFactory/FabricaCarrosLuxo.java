package padraoAbstractFactory;

public class FabricaCarrosLuxo implements FabricaCarros {
    @Override
    public Motor criarMotor() {
        return new MotorLuxo();
    }

    @Override
    public Rodas criarRodas() {
        return new RodasLuxuosas();
    }

    @Override
    public Direcao criarDirecao() {
        return new DirecaoLuxuosa();
    }
}