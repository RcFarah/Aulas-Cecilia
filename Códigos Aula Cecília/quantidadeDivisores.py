# 1) Implemente uma função que retorna quantos divisores um dado número tem. Por exemplo, se o número recebido pela
# função for 10, os divisores são: 1, 2, 5 e 10. Nesse caso a função deve retornar 4.

# Declarando as variáveis
numero = int(input('Digite o número dos quantos divisores ele tem: '))
divisor = numero
divisao = 0
divisores = []

# Definindo a condição de parada
while divisor > 0:

    # Vendo o resto da divisão
    divisao = numero % divisor

    # Verificando se o número é divisível
    if divisao == 0:
        print('{} é divisivel por {}'.format(numero, divisor))
        divisores.append(divisor)
        divisor -= 1
    else:
        divisor -= 1

# Mostrando o resultado
print('\nO número {} tem {} divisor(es)'.format(numero, len(divisores)))
