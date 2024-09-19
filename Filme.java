package teste;

public class Filme {
    // Atributo encapsulado para o saldo da conta
    private double saldo;
    private int contadorConsultas; // Para contar o número de consultas

    // Construtor da classe, inicializa o saldo com 0
    public Filme() {
        this.saldo = 0.0;
        this.contadorConsultas = 0;
    }

    // Método para realizar depósito
    public void deposito(double valor) {
        // Verifica se o valor é positivo
        if (valor > 0) {
            double taxa = valor * 0.01; // Calcula a taxa de 1%
            saldo += (valor - taxa); // Adiciona o valor após a taxa
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    // Método para realizar saque
    public void saque(double valor) {
        // Verifica se o valor é positivo e se há saldo suficiente
        if (valor > 0 && valor <= saldo) {
            double taxa = valor * 0.005; // Calcula a taxa de 0,5%
            saldo -= (valor + taxa); // Subtrai o valor do saque e a taxa
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    // Método para consultar o saldo
    public double consultaSaldo() {
        contadorConsultas++; // Incrementa o contador de consultas

        // Verifica se a taxa deve ser aplicada a cada 5 consultas
        if (contadorConsultas % 5 == 0) {
            saldo -= 0.10; // Aplica a taxa de 0,10 centavos
        }

        return saldo; // Retorna o saldo atual
    }

    // Método para obter o saldo (caso necessário)
    public double getSaldo() {
        return saldo;
    }
}

