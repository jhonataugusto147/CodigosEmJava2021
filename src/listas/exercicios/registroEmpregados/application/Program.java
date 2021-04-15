package listas.exercicios.registroEmpregados.application;

import listas.exercicios.registroEmpregados.entities.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

public class Program {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Employee> employee = new ArrayList<>();

        System.out.println("Digite quantas vezes voce quer que registre os funcionarios");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++ ){
            scanner.nextLine();
            System.out.println("Empregado#"+(i+1)+":");

            System.out.print("Id : ");
            Integer id = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Nome :");
            String nome = scanner.nextLine();

            System.out.println("Salario : ");
            Double salario = scanner.nextDouble();

            employee.add(new Employee(id,nome,salario));
        }

        System.out.println("Digite a id do empregado que você quer que o salário seja incrementado : ");
        Integer resposta = scanner.nextInt();
        Employee resultado = employee.stream().filter(x -> x.getId().equals(resposta)).findFirst().orElse(null);
        resultado.toString();

        System.out.println("digite a porcentagem : ");
        double porcentagem = scanner.nextDouble();
        resultado.increaseSalary(porcentagem);

        System.out.println("Lista de empregados: ");
        for(int i = 0 ; i < n ; i++){
            System.out.println(employee.toString());
        }

        scanner.close();
    }
}
