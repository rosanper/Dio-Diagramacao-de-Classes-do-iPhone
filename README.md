# Dio-Diagramacao-de-Classes-do-iPhone
Esse repositório tem como objetivo mostrar a resolução do desafio de projeto "Orientação a Objetos e UML: Diagramação de Classes do iPhone" do curso da DIO


## Enunciado do desafio

Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial, Aparelho Telefônico e Navegador na Internet. 
Em seguida crie as classes e interfaces no formato de arquivos .java.

- Comportamentos esperados:

  - Repodutor Musicial: tocar, pausar, selecionarMusica

  - Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz

  - Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

## Resolução

A resolução desse problema foi feita levando o seguinte pensamento: Como o IPhone possui comportamentos do Reprodutor Musicial, Aparelho Telefônico e Navegador na Internet, e o java não possui heranças múltiplas,
a melhor forma seria entender esses três últimos como interfaces no qual a classe iPhone pode implementar. Dessa forma assumimos uma classe IPhone e três interfaces, sendo elas ReprodutorMusicial, AparelhoTelefonico e NavegadorNaInternet. 
Essa resolução pode ser vista do diagrama 1 de UML.

Ainda sobre a diagramação e resolução do problema, podemos explorar e aumentar ainda mais as relações. A partir do vídeo podemos perceber que o iphone também possui outros tipos de comportamento, como: tirar foto, filmar, ver calendário, ativar ddespertador, entre outros. 
Diante disso, podemos criar novos tipos de relacionamento a partir de outras interfaces como pode ser visto no diagrama UML 2.

Outra forma de resolução é pensando em heranças, no qual podemos ter uma classe "Celular", que vai ter uma classe filha "Smartphone", que por sua vez vai ter uma classe filha 'IPhone". 
Dessa forma, o IPhone vai herdar atributos e comportamento das outras classes, além de possuir comportamentos específicos dele, criando assim novas relaçoes entre classes e interfaces.

Portanto, na análise desse problema podemos ter uma série de abordagens diferentes. Na medida em que generalizamos e especificamos classes e comportamentos, a resolução se torna maior e mais complexa. 
Porém, como o objetivo desse desafio é voltado mais para a análise do problema, a resolução em código se limita ao primeiro diagrama UML e não se preocupa com suas funcionalidades. 


## Diagrama UML

Os diagramas podem ser vistos na pasta "diagramas-UML"
