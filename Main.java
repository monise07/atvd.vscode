class Pessoa {
//*Nayra Monise Silva sá */
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome +
                " e tenho " + idade + " anos.");
    }
}


class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }
}

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }
}

class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        }
    }

    public double media() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprovado() {
        return media() >= 7;
    }
}

class Funcionario {
    private String nome;
    private double salarioMensal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal >= 1412.00) {
            this.salarioMensal = salarioMensal;
        }
    }

    public double salarioAnual() {
        return salarioMensal * 12;
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            salarioMensal += salarioMensal * percentual / 100;
        }
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas >= 1) {
            this.numeroPaginas = numeroPaginas;
        }
    }

    public void resumo() {
        System.out.println("Livro: " + titulo +
                ", por " + autor +
                ", com " + numeroPaginas + " páginas.");
    }
}

public class Main {
    public static void main(String[] args) {

        //// PARTE 1 - 
        System.out.println("= PARTE 1 - Pessoa ");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nayra");
        pessoa.setIdade(18);
        pessoa.apresentar();

        System.out.println("\n=// PARTE 1 - Conta bancaria");
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta("12345-6");
        conta.depositar(1000);
        conta.sacar(300);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        // // PARTE 2 - 
        System.out.println("\n=  PARTE 2 - Produto");
        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(4000);
        produto.setQuantidade(5);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor total em estoque: R$ "
                + produto.calcularValorTotal());

        System.out.println("\n= PARTE 2 - aluno");
        Aluno aluno = new Aluno();
        aluno.setNome("Grazi");
        aluno.setNota1(8.5);
        aluno.setNota2(7.0);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Média: " + aluno.media());
        System.out.println("Aprovado? " + aluno.aprovado());

        // // PARTE 3 - 
        System.out.println("\n= PARTE 3 -  Funcionário");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Carlos");
        funcionario.setSalarioMensal(3000);

        System.out.println("Salário mensal: R$ "
                + funcionario.getSalarioMensal());
        System.out.println("Salário anual: R$ "
                + funcionario.salarioAnual());

        funcionario.aumentarSalario(10);

        System.out.println("Novo salário: R$ "
                + funcionario.getSalarioMensal());

                
        System.out.println("\n= PARTE 3 -  Livro");
        Livro livro = new Livro();
        livro.setTitulo("A hora da estrela");
        livro.setAutor("Clarice Lispector");
        livro.setNumeroPaginas(88);

        livro.resumo();
    }
}