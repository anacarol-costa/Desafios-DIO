
/**********************************************************************************************
 *3/3 - Quantidade de Números Positivos
 *
******************************** Desafio
*
*   Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada, devendo desconsiderar os valores nulos. Em seguida, apresente a quantidade de     * valores positivos digitados.
*
******************************** Entrada
*   Você receberá seis valores, negativos e/ou positivos.
*
******************************** Saída
*   Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos" ao final.
**********************************************************************************************/

import java.io.IOException;
import java.util.Scanner;

public class quantidadeDeNumerosPositivos {

  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);

    int positivos = 0;

    for (int i = 0; i < 6; i++) {

      double x = leitor.nextDouble();

      if (x > 0)
        positivos++;
    }
    System.out.println(positivos + " valores positivos");

  }
}
