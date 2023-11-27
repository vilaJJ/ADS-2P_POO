# TADS 2º período - Programação Orientada a Objetos - Lista 7 sobre Polimorfismo e Herança.

<p>INSTITUTO FEDERAL DO TOCANTINS - CAMPUS ARAGUAÍNA</p>
<p>Estudante: Juan Felipe Alves Flores</p>
<p>Professor: Paulo Ricardo Pontes</p>
<p>Curso: Técnico em Análise e Desenvolvimento de Sistemas (2° Período)</p>
<p>Disciplina: Programação Orientada à Objetos</p>

<hr></hr>

### Questões

#### Questão 1:
<p>
Crie uma classe abstrata chamada Veiculo com um método abstrato acelerar(). Em seguida, crie duas classes que estendem Veiculo: Carro e Moto. Implemente o método acelerar() em cada classe para imprimir uma mensagem indicando a aceleração específica do veículo. Crie uma classe chamada Corrida que tenha um método que recebe um objeto Veiculo e chama o método acelerar(). Demonstre o polimorfismo passando instâncias de Carro e Moto para esse método.
</p>

#### Questão 2:
<p>
Considere as seguintes classes:

```java
class Animal {
    void fazerSom() {
        System.out.println("Som do animal");
    }
}
```

```java
class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Latido do cachorro");
    }
}
```

```java
class Gato extends Animal {
    void fazerSom() {
        System.out.println("Miado do gato");
    }
}
```

Crie uma aplicação Java que demonstre o polimorfismo. Instancie um array de Animal que contenha objetos das classes Animal, Cachorro e Gato. Itere sobre o array e chame o método fazerSom() para cada objeto. O que acontece e por quê?
</p>

#### Questão 3:
<p>
Crie uma classe abstrata FiguraGeometrica com um método abstrato calcularArea(). Em seguida, crie subclasses concretas, como Circulo, Retangulo e Triangulo, que herdam de FiguraGeometrica e implementam o método calcularArea() de acordo com a fórmula correta para cada forma.
</p>

#### Questão 4:
<p>
Implemente uma hierarquia de classes para representar um jogo de cartas. Crie uma classe base Carta e subclasses como CartaNormal e CartaEspecial, que herdam de Carta. Cada subclasse deve ter atributos específicos, como valor e efeito.
</p>

#### Questão 5:
<p>
Crie uma classe Produto com campos como nome, preço e código. Em seguida, crie uma subclasse chamada ProdutoPerecivel que herda de Produto e inclui um campo adicional para a data de validade.
</p>

#### Questão 6:
<p>
Implemente uma classe ContaBancaria com campos como numeroConta e saldo. Em seguida, crie subclasses, como ContaCorrente e ContaPoupanca, que herdam de ContaBancaria e incluem métodos específicos, como sacar e depositar.
</p>

#### Questão 7:
<p>
Crie uma classe Veiculo com campos como marca, modelo e ano. Em seguida, crie uma subclasse chamada CarroEletrico que herda de Veiculo e inclui um campo adicional para a capacidade da bateria e métodos para carregar a bateria.
</p>

<hr></hr>

<p>Data: 13 de novembro de 2023, segunda-feira (2023-11-13).</p>