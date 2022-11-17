numero_anterior = 1
result_Fibo = 0
contador = 0

tamanho_sequencia = int(input('Digite a quantidade que deseja ver de números da Sequência de Fibonacci: '))

while contador != tamanho_sequencia:
    print('{}'.format(result_Fibo), end=' → ')
    result_Fibo = result_Fibo + numero_anterior
    numero_anterior = result_Fibo - numero_anterior
    contador += 1

print('FIM')
