# FreeLancer Simulator Game

Um jogo de simulação em **Java**, inspirado no estilo do **Capitalism Simulator**, onde o jogador assume o papel de um freelancer buscando gerenciar trabalhos, recursos e crescimento financeiro.

## 🎮 Sobre o projeto

O objetivo principal deste projeto não foi só criar um jogo, mas usar o desenvolvimento como pretexto para **aprender integração de banco de dados com JDBC**. A ideia de simulação (gerenciar dinheiro, progresso e decisões) se encaixou bem como caso de uso prático para persistência de dados.

## 🛠️ Tecnologias
- **Java**
- **JDBC** (Java Database Connectivity) para integração com banco de dados
- Banco de dados relacional (incluso como `base.db` no repositório)

## 📚 Aprendizado

Este projeto foi focado em entender, na prática, como uma aplicação Java se conecta e interage com um banco de dados: leitura, escrita, atualização de dados e como estruturar esse fluxo dentro da lógica de um jogo. Serviu como base para consolidar conceitos de persistência de dados que vão muito além de jogos.

## 🚀 Como rodar

1. Clone o repositório:
```bash
git clone https://github.com/fahgundin/FreeLancerSimulatorGame.git
```
2. Abra o projeto em uma IDE Java (Eclipse, IntelliJ, NetBeans, etc.)
3. Execute os arquivos compilados dentro da pasta `bin`, ou compile o projeto novamente a partir do código-fonte
4. Certifique-se de que o arquivo `base.db` está no mesmo diretório esperado pela aplicação para que a conexão via JDBC funcione corretamente
