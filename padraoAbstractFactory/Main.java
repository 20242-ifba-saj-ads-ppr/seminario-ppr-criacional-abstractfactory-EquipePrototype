package padraoAbstractFactory;

public class Main {
    public static void main(String[] args) {

        FabricaCarros fabricaEsportiva = new FabricaCarrosEsportivos();
        Motor motorEsportivo = fabricaEsportiva.criarMotor();
        Rodas rodasEsportivas = fabricaEsportiva.criarRodas();
        Direcao direcaoEsportiva = fabricaEsportiva.criarDirecao();

        motorEsportivo.ligar();
        rodasEsportivas.rodar();
        direcaoEsportiva.virar();

        FabricaCarros fabricaLuxo = new FabricaCarrosLuxo();
        Motor motorLuxo = fabricaLuxo.criarMotor();
        Rodas rodasLuxuosas = fabricaLuxo.criarRodas();
        Direcao direcaoLuxuosa = fabricaLuxo.criarDirecao();

        motorLuxo.ligar();
        rodasLuxuosas.rodar();
        direcaoLuxuosa.virar();

        FabricaCarros fabricaUrbana = new FabricaCarrosUrbanos();
        Motor motorUrbano = fabricaUrbana.criarMotor();
        Rodas rodasUrbanas = fabricaUrbana.criarRodas();
        Direcao direcaoUrbana = fabricaUrbana.criarDirecao();

        motorUrbano.ligar();
        rodasUrbanas.rodar();
        direcaoUrbana.virar();
    }
}
