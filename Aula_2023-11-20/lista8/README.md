# TADS 2º período - Programação Orientada a Objetos - Lista 8 sobre Polimorfismo e Herança.

<p>INSTITUTO FEDERAL DO TOCANTINS - CAMPUS ARAGUAÍNA</p>
<p>Estudante: Juan Felipe Alves Flores</p>
<p>Professor: Paulo Ricardo Pontes</p>
<p>Curso: Técnico em Análise e Desenvolvimento de Sistemas (2° Período)</p>
<p>Disciplina: Programação Orientada à Objetos</p>

<hr></hr>

### Questões

#### Questão 1:
<p>
Criar a classe Pessoa com as seguintes características:

* Atributos: idade e dia, mês e ano de nascimento, nome da pessoa;
* Métodos:
    - _calculaIdade()_, que recebe a data atual em dias, mês e anos e calcula e armazena no atributo idade a idade atual da pessoa;
    - _informaIdade()_, que retorna o valor da idade;
    - _informaNome()_, que retorna o nome da pessoa;
    - _ajustaDataDeNascimento()_, que recebe dia, mês e ano de nascimento como parâmetros e preenche nos atributos correspondentes do objeto.
* Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em 14/03/1879) e o outro representando Isaac Newton (nascido em 04/01/1643);
* Fazer uma classe principal que instancie os objetos, inicialize e mostre quais seriam as idades de Einstein e Newton caso estivessem vivos.
</p>

#### Questão 2:
<p>
Fazer um programa com as seguintes características:

* Uma classe chamada Universidade que terá como atributo um nome e terá um método para informar o seu nome;
* Relacionar a classe Pessoa para com a classe Universidade. Cada pessoa poderá ser associada a uma Universidade.
* A classe Pessoa, por sua vez, terá um método que dirá seu nome e em que universidade trabalha.
*  Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em 14/03/1879) e o outro representando Isaac Newton (nascido em 04/01/1643).
* Criar dois objetos de Universidade, associando um para Einstein e outro para Newton:
    - Einstein trabalhou como professor de física em Princeton (Nova Jersey - Estados Unidos da América).
    - Newton trabalhou como professor de matemática em Cambridge (Inglaterra).
</p>

#### Questão 3:
<p>
Fazer um programa para:

* Criar uma classe Departamento que permita relacionar um objeto (Departamento) à classe Universidade por composição (Universidade “contém” Departamento).
* Adaptar a classe Pessoa para que ela possua uma referência ao departamento que trabalha, ou seja, ela deve possuir uma associação com a classe Departamento, permitindo que cada objeto Pessoa tenha a referência de um objeto Departamento.
</p>

<hr></hr>

<p>Data: 20 de novembro de 2023, segunda-feira (2023-11-20).</p>