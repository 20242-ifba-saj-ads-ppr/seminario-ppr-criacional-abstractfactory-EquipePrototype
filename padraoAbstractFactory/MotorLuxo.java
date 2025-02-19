package padraoAbstractFactory;

public class MotorLuxo implements Motor {
    @Override
    public void ligar() {
        System.out.println("Motor de luxo ligado");
    }
}

