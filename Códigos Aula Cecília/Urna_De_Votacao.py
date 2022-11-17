voto_Antonio = 0
voto_Jose = 0
voto_Maria = 0
numero_Votantes = 0
voto_Branco = 0
voto_Nulo = 0
voto_Encerra = 0

print('VOTE CONSCIENTE!\n')

while voto_Encerra == 0:

    voto = int(input('Número do candidato: '))

    if voto == 1:
        voto_Antonio += 1
        numero_Votantes += 1

    elif voto == 2:
        voto_Jose += 1
        numero_Votantes += 1

    elif voto == 3:
        voto_Maria += 1
        numero_Votantes += 1

    elif voto > 0 and voto != [1, 2, 3, 4]:
        voto_Nulo += 1
        numero_Votantes += 1

    elif voto == 4:
        voto_Branco += 1
        numero_Votantes += 1

    elif voto == 0:
        voto_Encerra += 1


print('TOTAL DE VOTOS: {}\n'
      'VOTOS ANTONIO: {}\n'
      'VOTOS JOSÉ: {}\n'
      'VOTOS MARIA: {}\n'
      'VOTOS NULO: {}\n'
      'VOTOS BRANCO: {}\n\n'.format(numero_Votantes, voto_Antonio, voto_Jose, voto_Maria, voto_Nulo, voto_Branco))

if voto_Antonio > voto_Jose and voto_Antonio > voto_Maria:
    print('VENCEDOR: Antônio')

elif voto_Maria > voto_Jose and voto_Maria > voto_Antonio:
    print('VENCEDOR: Maria')

elif voto_Jose > voto_Maria and voto_Jose > voto_Antonio:
    print('VENCEDOR: José')

elif voto_Jose == voto_Maria or voto_Jose == voto_Antonio or voto_Maria == voto_Antonio or voto_Maria == voto_Antonio \
        == voto_Jose:
    print('VOTAÇÃO EM SEGUNDO TURNO!')
