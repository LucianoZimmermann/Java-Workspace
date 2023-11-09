
package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> resultado = numeros.stream()
                                        .filter(numero -> numero % 2 == 0)
                                        .map(numero -> numero * 2)
                                        .collect(Collectors.toList());
        System.out.println(resultado);
    }
}

