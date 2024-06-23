Explicação do código:
Classe ConversorDeRadianosParaGraus:

Esta classe possui um método converter que recebe um valor em radianos e retorna o valor convertido para graus usando Math.toDegrees.
Método main:

No método main, uma instância da classe ConversorDeRadianosParaGraus é criada.
Um valor em radianos (neste exemplo, 1.0) é convertido para graus e o resultado é exibido no console.
Como funciona a conversão:
O método Math.toDegrees da biblioteca padrão de Java converte um ângulo medido em radianos para um ângulo equivalente medido em graus. A fórmula utilizada internamente é:

graus
=
radianos
×
(
180
�
)
graus=radianos×( 
π
180
​
 )

Execução do programa: ManipulacaoDeSubstrings
Ao executar o programa, você verá a seguinte saída no console (se o valor de entrada for 1.0 radiano):

Explicação do código:
Importação da classe Scanner:

Utilizada para ler a entrada do usuário a partir do console.
Classe CalculadoraDePotencia:

Possui um método calcularPotencia que recebe dois parâmetros (base e expoente) e retorna o resultado da potência usando Math.pow.
Método main:

Cria uma instância de Scanner para ler os valores de entrada do usuário.
Solicita ao usuário que insira a base e o expoente.
Cria uma instância da classe CalculadoraDePotencia.
Calcula a potência usando o método calcularPotencia.
Exibe o resultado da operação no console.
Fecha o objeto Scanner para liberar os recursos associados.
Como funciona a potência:
O método Math.pow eleva a base à potência do expoente. A fórmula é:

resultado
=
base
expoente
resultado=base 
expoente

Explicação do código:
Importação da classe Scanner:

Utilizada para ler a entrada do usuário a partir do console.
Classe ManipulacaoDeSubstrings:

Possui um método obterSubstringSemUltimoCaractere que recebe uma string de entrada (input) e retorna a substring sem o último caractere.
Método obterSubstringSemUltimoCaractere:

Verifica se a string de entrada é nula ou tem comprimento menor ou igual a 1. Se sim, retorna uma string vazia.
Caso contrário, utiliza o método substring da classe String para retornar a substring que começa no índice 0 e termina no comprimento da string menos 1.
Método main:

Cria uma instância de Scanner para ler a string de entrada do usuário.
Solicita ao usuário que insira uma string.
Cria uma instância da classe ManipulacaoDeSubstrings.
Obtém a substring sem o último caractere usando o método obterSubstringSemUltimoCaractere.
Exibe o resultado da operação no console.
Fecha o objeto Scanner para liberar os recursos associados.
Execução do programa:
Ao executar o programa, o usuário será solicitado a inserir uma string. Após a entrada, o programa calculará e exibirá a substring sem o último caractere.
Explicação do código:
Importação da classe Scanner:

Utilizada para ler a entrada do usuário a partir do console.
Classe DetectorDeConteudoImproprio:

Possui um método verificarConteudo que recebe uma frase e verifica se ela contém as palavras "sexo" ou "sexual".
Método verificarConteudo:

Converte a frase para minúsculas para fazer uma comparação case-insensitive.
Usa o método contains da classe String para verificar se a frase contém as palavras "sexo" ou "sexual".
Retorna "conteúdo impróprio" se uma das palavras for encontrada e "conteúdo liberado" caso contrário.
Método main:

Cria uma instância de Scanner para ler a frase de entrada do usuário.
Solicita ao usuário que insira uma frase.
Cria uma instância da classe DetectorDeConteudoImproprio.
Verifica o conteúdo da frase usando o método verificarConteudo.
Exibe o resultado da verificação no console.
Fecha o objeto Scanner para liberar os recursos associados.
Execução do programa:
Ao executar o programa, o usuário será solicitado a inserir uma frase. O programa verificará se a frase contém as palavras "sexo" ou "sexual" e exibirá a mensagem apropriada.

Explicação do código: INVERSOR DE FRASES
Importação da classe Scanner:

Utilizada para ler a entrada do usuário a partir do console.
Classe InversorDeFrases:

Possui um método inverterFrase que recebe uma frase, remove os espaços em branco e inverte a frase.
Método inverterFrase:

Usa o método replaceAll da classe String para remover todos os espaços em branco da frase. A expressão regular \\s corresponde a qualquer espaço em branco.
Cria uma instância de StringBuilder com a frase sem espaços em branco para facilitar a manipulação da string.
Usa o método reverse do StringBuilder para inverter a frase.
Retorna a frase invertida como uma String.
Método main:

Cria uma instância de Scanner para ler a frase de entrada do usuário.
Solicita ao usuário que insira uma frase.
Cria uma instância da classe InversorDeFrases.
Obtém a frase invertida e sem espaços usando o método inverterFrase.
Exibe o resultado da operação no console.
Fecha o objeto Scanner para liberar os recursos associados.
Execução do programa:
Ao executar o programa, o usuário será solicitado a inserir uma frase. O programa removerá os espaços em branco, inverterá a frase, e exibirá o resultado
