<p align="center">
  <img src="https://github.com/hildocosta/hildocosta-Curso-Java--Nelio-Alves/blob/main/logo.png" width="300">
</p>

<h1 align="center">💡 Explorando Sobreposição em Java</h1>

<p>🚀 Este repositório é dedicado à exploração do conceito de sobreposição na programação orientada a objetos (POO) em Java. Aqui, você encontrará uma variedade de recursos para aprofundar seu entendimento e praticar sua implementação.</p>

<p>🎓 Sou estudante de Engenharia de Computação no 3º semestre e estou em busca de aprimorar minhas habilidades em Java, especialmente em sobreposição. Este repositório serve como um complemento ao meu aprendizado, oferecendo exercícios desafiadores e projetos práticos para aplicar os conceitos aprendidos.</p>

<p>🔥 O objetivo principal é fornecer um ambiente onde eu possa não apenas aprender os conceitos teóricos, mas também colocá-los em prática de maneira significativa, construindo soluções eficazes e elegantes por meio da sobreposição.</p>

<h2 align="center">🔒 Licença</h2>

<p>⚖️ Este projeto está licenciado sob a <a href="LICENSE">Licença MIT</a>.</p>

<h2 align="center">📧 Contato</h2>

<h3>🔗 Redes Sociais e Contato</h3>

<ul>
  <li>📌 GitHub: <a href="https://github.com/hildocosta">hildocosta</a></li>
  <li>💼 LinkedIn: <a href="https://www.linkedin.com/in/hildo-costa-b83812231/">Hildo Costa</a></li>
  <li>✉️ Email: hildo.costa@pm.pr.gov.br</li>
</ul>

<p>Agora que você está preparado e animado, vamos começar!</p>

<h2 align="center">🚀 Vamos Começar</h2>

<h3>🧩 Sobreposição</h3>
<p>Sobreposição é um princípio da POO onde uma classe filha fornece uma implementação específica de um método definido em sua classe pai, substituindo a implementação original. A palavra-chave "super" é usada para acessar o método da classe pai dentro da classe filha. A anotação "@Override" em Java indica explicitamente que um método está sendo sobrescrito.</p>

<p>Além disso, é a implementação de um método de uma superclasse na subclasse. É fortemente recomendável usar a anotação @Override em um método sobrescrito, pois facilita a leitura e compreensão do código.</p>


Este readme deve fornecer uma boa introdução ao conceito de sobreposição em Java, além de explicar a palavra-chave "super" e a anotação "@Override".

<h3>Projeto UML:</h3>

 <p align="center">
  <img src="https://github.com/hildocosta/Sobreposi-o---Palavra-Super-e-Anota-o-Override/blob/main/sobreposi%C3%A7%C3%A3o.png">
</p>

<h3>Exemplo:</h3>

```
Suponha que a operação de saque possui uma taxa no valor de 5.0.

Entretanto, se a conta for do tipo poupança, esta taxa não deve ser cobrada.

Como resolver isso?

Resposta:

Sobrescrevendo o método withdraw na subclasse SavingsAccount.
```

<h3>Exemplo do Programa:</h3>

 <p align="center">
  <img src="https://github.com/hildocosta/Sobreposi-o---Palavra-Super-e-Anota-o-Override/blob/main/sobrescrever.png">
</p>

<h3>🧩 Palavra Super </h3>

<p> É possível chamar a implementação da superclasse usando a palavra super.</p>

<h3>Exemplo:</h3>
<p> Suponha que, na classe BusinnessAccount, a regra para saque seja realizar o saque normalmente da superclasse, e descontar mais 2.0 </p>

 <p align="center">
  <img src="https://github.com/hildocosta/Sobreposi-o---Palavra-Super-e-Anota-o-Override/blob/main/classe_businnes.png">
</p>
