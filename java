a11 090920
classe é abstrata e objeto é concreto
classe tem atributos e objeto tem valores
o estado de uma classe são os atributos
o comportamento de uma classe são os metodos
Objetos representam instâncias individuais de uma classe
Objetos são criados a partir de classes
Que operador utilizamos para instanciar uma classe? new
o comportamento vai fazer alguma coisa em relação ao estado
(classe objetos, estado=sabe, comportamento=faz)

a02-300920
CONSTRUTORES
construtor default não precisa passar parametro nenhum
construtor são metodos especiais que utilizamos para criar objetos
construtores não precisam ter um retorno
a partir do construtor conseguimos parametrizar a construção de objetos
construtor sempre tem o mesmo nome da classe (construtor de uma classe, que instancia a classe criando uma obj)
a palavra this é usada para referenciar os elementos da classe
quando não definimos nenhum construtor ele coloca um construtor default, uma classe que não definimos explicitamente um construtor 
podemos ter mais de um construtor se eles tiverem TIPO de parametros diferentes e se tiverem o mesmo tipo devem ter numero de parametros diferentes (override)
uma classe pode ser construida de formas diferentes? sim (construtores)
pode variar o numero de para
(construtores and override)

a03 081020
caracterizar e responsabilidades de uma classe
antropomorfismo é a capacidade de aplicar conceitos caracteristicas do ser humano em objetos
importante para poo
conceitos e comportamentos de uma classe em ser humano
classe homem
homem sabe seu nome a data nascimento (sabe=estado=atirbutos)
o homem fala, anda, pula, pensa (faz=comportamento=metodos)

o cachorro sabe seu nome, seu dono, local da casinha 
o cachorro late, anda, protege a casa 

homem e cachorro, identificar as ações e responsabilidades
o que uma classe sabe ou faz chamamos de responsabilidade
o que um obj sabe? constituir um conhecimento que ele mantem, se refere aos atributos ou estado da classe
o que obj faz? é ação que ele faz ao seu comportamento
classe homem e cachorro funciona muito bem
e uma coisa inanimada?
um obj ponto grafico, quais são as responsabilidades de um ponto grafico
um ponto grafico sabe? sab a cor a posicao 
um ponto grafico faz? ele move, compara se a outro ponto, ele devolve a sua posição

atraves das responsabilidades de uma classe conseguimos definir o estado e comportamento de uma classe 
e isso eu encontro quando eu pergunto as responsabilidades dessa classe
estado = atributos
comportamento = metodos
quando eu pergunto o que obj sabe = são os atributos da classe (sabe=estado=atirbutos)
quando eu pergunto o que obj faz = comportamento, seus metodos (faz=comportamento=metodos)
classe carro sabe = potencia do motor
classe carro faz = acelara, freia 
conceito de responsabilidade é importante pra entender classe e obj
responsabilidades tem dois tipos, sabe e o tipo faz
sabe = identificar o estado e atributos
faz = comportamento de uma classe, metodos de uma classe

(logica das responsabilidades)
como desenvolver a logica das responsabilidades
responsabilidades sabe = sabe o numero da conta, sabe o valor do saldo
responsabilidades tipo faz = credita o valor do saldo, debita o valor do saldo, é possivel retirar determinado valor
tipo faz = preciso saber que ações ela faz
definição do nome da responsabilidade
tipo sabe = variavel de instancia, atributos = numero da conta (devolver o valor)
metodos acessores getters and setters (inserir valor)
responsabilidade tipo faz = é possivel retirar o valor volta verdadeiro atraves do metodo
normalmente a responsabilidade do tipo faz
uma maneira de definir é atraves das acoes
sabe = variavel de instancia = atributo numero da conta
obj.atributo_numero_da_conta = sabe
obj.inserir_valor = faz 
responsabilidade do tipo faz é um pergunta? ele sempre pode voltar true ou false
classe banco 
responsabilidades tipo sabe = contas ativas e inativas (atributos) (lista)
responsabilidades tipo faz = registra uma conta nova, apresenta os numeros das contas ativas, obtem o saldo total do banco
registra uma conta nova - inserir na lista de contas ativas
aprensenta o numero de contas ativas - lista de contas correntes obj, crio uma lista vazia de contas ativas (devolvo uma lista)
obtem o saldo total do banco - passo pela lista de objetos acumulando e voltando uma lista
(responsabilidades da classe e objetos, tipo sabe=atributos=estado faz=metodos=comportamento)

aprendendo a aprender 
modo focado e entrar no modo difuso
