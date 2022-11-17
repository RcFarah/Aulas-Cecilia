#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "portuguese");

    int numero_anterior = 1;
    int result_Fibo = 0;
    int contador = 0;
    int tamanho_sequencia;

    printf("Digite a quantidade que deseja ver de números da Sequência de Fibonacci: ");
    scanf("%d", &tamanho_sequencia);

    while (contador != tamanho_sequencia){
        printf("%d -> ", result_Fibo);
        result_Fibo = result_Fibo + numero_anterior;
        numero_anterior = result_Fibo - numero_anterior;
        contador++;
    }
    
    printf("FIM");
}