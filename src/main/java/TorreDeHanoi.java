public class TorreDeHanoi {
    private static int numDiscos;

    public TorreDeHanoi(int numDiscos){
        this.numDiscos = numDiscos;
    }

    public void setNumDiscos(int numDiscos){
        this.numDiscos = numDiscos;
    }

    public static int calcularMovimentos() {
        if (numDiscos < 1) {
            throw new IllegalArgumentException("O número de discos deve ser de no mínimo 1.");
        }
        int numMovimentos = (int) (Math.pow(2, numDiscos) - 1);
        System.out.println("O número de movimentos necessário é: " + numMovimentos);
        return (numMovimentos);
    }
}