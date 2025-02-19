package padraoAbstractFactory;

public interface FabricaCarros {
    Motor criarMotor();
    Rodas criarRodas();
    Direcao criarDirecao();
}
