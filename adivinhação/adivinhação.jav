var segredo = 1; //parseInt(Math.random() * 1001);
var nome = prompt("Digite seu nome:");
var dificuldade = prompt(
  "Muito bem " +
    nome +
    " agora escolha o número da dificuldade que deseja jogar: 1-Fácil: quantas tentativas quiser; 2-Médio: 10 tentativas; 3-Difícil: 5 tentativas"
);
if ((dificuldade = 1)) {
  while (chute != segredo) {
    var chute = prompt("Digite um número entre 0 e 1000:");
    if (chute == segredo) {
      alert("Parabéns, você acertou!!");
    } else if (chute > segredo) {
      alert("O número é menor do que esse!!");
    } else if (chute < segredo) {
      alert("O número é maior do que esse!!");
    }
  }
} else if ((difuculdade = 2)) {
  var quantidade = 10;
  while (chute != segredo) {
    var chute = prompt("Digite um número entre 0 e 1000:");
    if (chute == segredo) {
      alert("Parabéns, você acertou!!");
    } else if (chute > segredo) {
      alert("O número é menor do que esse!! Restam" + quantidade + "chances");
    } else if (chute < segredo) {
      alert("O número é maior do que esse!! Restam" + quantidade + "chances");
    }
    var quantidade = quantidade - 1;
    if ((quantidade = 0)) {
      system.exit(0);
    }
  }
}
