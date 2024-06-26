package com.gbrazdev.fine.start;

import com.gbrazdev.fine.service.ConsumeDate;

import java.util.Scanner;

public class Start {

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";
    private Scanner leitura = new Scanner(System.in);
    private ConsumeDate consumo = new ConsumeDate();

    public void exibeMenu() {
        var menu = """
                *** OPÇÕES ***
                Carro
                Moto
                Caminhão
                            
                Digite uma das opções para consulta:
                            
                """;

        System.out.println(menu);
        var opcao = leitura.nextLine();
        String endereco;

        if (opcao.toLowerCase().contains("carr")) {
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }

        var json = consumo.obterDados(endereco);

        System.out.println(json);
    }
}
