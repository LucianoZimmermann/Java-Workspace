
package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import entities.Pessoa;

public class Program {

    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Leonardo", "Jaraguá do Sul"),
                new Pessoa("Luiz", "Florianópolis"),
                new Pessoa("Rafael", "Jaraguá do Sul"),
                new Pessoa("Yuri", "Guaramirim"),
                new Pessoa("Matheus", "Jaraguá do Sul"));

        String cidadeFiltrada = "Jaraguá do Sul";
        List<Pessoa> pessoasNaCidade = pessoas.stream()
                .filter(pessoa -> pessoa.getCidade().equals(cidadeFiltrada))
                .collect(Collectors.toList());

        System.out.println("Pessoas em " + cidadeFiltrada + ":");
        pessoasNaCidade.forEach(pessoa -> System.out.println(pessoa.getNome()));
    }
}    


