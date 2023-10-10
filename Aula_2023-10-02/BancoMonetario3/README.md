# Exercício prático - Orientação a objetos

### Leia o texto abaixo e implemente um algoritmo em Java utilizando os conceitos da Orientação a objetos:

<p>
Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero. Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo).
</p>

<p>
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.
</p>

<p>
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação.
</p>

#### Adicional 1:
<p>
Com base no exercício anterior, permita que o usuário crie várias contas bancárias e armazene em um objeto ArrayList, podendo ser Conta Poupança ou Conta Corrente. Permita que o usuário faça transferências de uma conta para outra. Lembre-se, se a conta for Poupança, não permita que seja feita transferência, caso seja Corrente, antes de transferir, verifique se a conta tem saldo positivo.
</p>

#### Adicional 2:
<p>
<b>Com base nos exercícios anteriores, simule um caixa de banco através de menu com operações bancárias conforme o exemplo a seguir:</b>

Seja bem-vindo(a) ao Mybank!

<br>1 - Nova conta
<br>2 - Saldo
<br>3 - Extrato
<br>4 - Transferência
<br>5 - Depósito
<br>Digite:

<br>-------------------------------------------
<br>Criar nova conta

<br>nº conta:
<br>Nome:
<br>idade:
<br>E-mail:
<br>Tipo de conta (1 - Poupança, 2 - Corrente):

<br>Conta criada com sucesso!

<br>-------------------------------------------
</p>