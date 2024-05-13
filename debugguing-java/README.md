<h1>Debugging Java</h1>
<p>Curso que apresenta conceitos introdutórios sobre como podemos trabalhar com debugging na linguagem Java. 

<ol>
    <li>Visão Geral</li>
    <li>Pilha de Execução de um programa Java</li>
</ol>

<h2>Visão Geral</h2>

<p>Erros de programação são denominados bugs e o processo de encontrar e corrigir bugs é chamado de depuração ou debugging.</p>
<p>De forma geral, a depuração é uma tarefa difícil e trabalhosa, e a dificuldade varia de acordo com o ambiente de desenvolvimento, o que inclui a linguagem de programação e as ferramentas disponíveis, como depuradores.</p>

<p>Existem duas grandes categorias que englobam a natureza do erro:</p>
<ul>
    <li><h3>Erros de Sintaxe:</h3>É um erro nas regras estabelecidas da linguagem:
        <ol>
            <li>Parênteses, chaves, colchetes que abrem mas não fecham.</li>
            <li>Duas instruções sem um ponto-e-vírgula entre elas;</li>
            <li>Uma palavra-chave sendo usada numa posição inesperada.</li>        
        </ol>
    </li>
    <li><h3>Erros de Semântica:</h3>  É um erro na "lógica do código", em sua semântica, o código está sintaticamente correto, porém não faz o que se esperava dele.
        <ol>
            <li>Tentar dividir um número por uma String ou por zero.</li>
            <li>Atribuir um valor incoerente a um tipo de dado.</li>
            <li>Tentar fechar um arquivo que não foi aberto.</li>
        </ol>
    </li>
</ul>

<h2>Depuração/Debugging</h2>
<p>Linguagens de alto nível tornam a depuração mais fácil, pois fornecem mais ferramentas para identificar erros, como o tratamento de exceções. </p>
<p>Os depuradores funcionam assumindo o controle do tempo de execução de um programa e permitindo que você o observe e controle. Para fazer isso, ele mostra a pilha do programa e permite que você a atravesse em qualquer direção. Quando você está em um depurador, obtém uma imagem mais completa de um quadro de pilha do que quando olha os rastreamentos de pilha em uma mensagem de log.</p>

<h2>Pilha de Execução de um Programa Java/Stack Trace</h2>
<p><h3>Pilha de Execução:</h3> Toda invocação de método é empilhada em uma estrutura de dados que isola a área de memória de cada um. Quando um método termina (retorna), ele volta para o método que o invocou.</p>
<p><h3>Stack Trace:</h3> É a matriz onde encontramos a pilha de excecução da exceção. Em outras palavras, podemos dizer que o rastreamento da pilha busca (rastreio) para a próxima linha onde a exceção pode surgir.</p>