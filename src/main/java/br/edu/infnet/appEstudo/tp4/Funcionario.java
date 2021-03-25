package br.edu.infnet.appEstudo.tp4;

public abstract class Funcionario {
   private int id;
   private String nome;
   private String email;
   protected float salario;
   private int idade;

    public Funcionario() {
        this.salario = 999;
        this.idade = 99;
    }

    public Funcionario(String nome, String email) {
        this();
        this.nome = nome;
        this.email = email;
    }

    public Funcionario(String nome, String email, float salario, int idade) {
        this(nome, email);
        this.salario = salario;
        this.idade = idade;
    }
    
    public void impressao(){
        System.out.println("Funcionário cadastrado com sucesso com os dados: " + this + ":" + this.calcularSalario());
    }
    
    public abstract float calcularSalario();
    
   @Override
    public String toString(){
        return "ID: " + id + ", Nome: " + nome + ", Email: " + email + ", Idade: " + idade + ", Salário: " + salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
