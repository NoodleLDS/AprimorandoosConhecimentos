# Aprimorando — Guia do Estudante da UFTM

Aplicativo Android nativo, em Kotlin, criado como **projeto de extensão universitária**. O objetivo era reunir num só lugar as informações que ajudam o estudante a se orientar na Universidade Federal do Triângulo Mineiro (UFTM): estrutura da instituição, regulamento de graduação, direitos e deveres do discente, ligas acadêmicas, iniciação científica, calendário acadêmico e mais.

## A ideia original (e por que ela mudou)

O plano não era um app de conteúdo estático. A proposta era integrá-lo a uma **API alimentada pelos sistemas oficiais da UFTM**, de modo que regulamentos, calendário e avisos ficassem sempre atualizados sem intervenção manual. Essa integração dependia de liberação de acesso por parte da área de TI da universidade, que não se concretizou na época. Sem o acesso aos dados, o escopo foi reduzido a um guia informativo navegável — que é o que este repositório contém.

É um projeto antigo, dos meus primeiros contatos com desenvolvimento mobile. Recentemente revisei a base para deixá-la coerente e apresentável (ver "Refatoração" abaixo), mantendo a honestidade sobre o que ele é: um protótipo de extensão, não um produto finalizado.

## Funcionalidades

- Navegação por menu lateral (Navigation Drawer) entre as seções
- Tela inicial apresentando o projeto e seu objetivo
- 11 seções informativas (UFTM, regulamento, direitos e deveres, pró-reitorias, institutos, diretórios acadêmicos, ligas, iniciação científica, coordenações, mural, calendário)

## Arquitetura

- **Linguagem**: Kotlin
- **Navegação**: Android Navigation Component (grafo único + Drawer)
- **UI**: View Binding, ConstraintLayout, Material Components
- **Padrão**: uma única tela genérica reutilizável (`SecaoFragment`) que carrega o conteúdo de cada seção a partir de uma fonte central (`data/ConteudoSecoes.kt`), em vez de uma tela duplicada por seção

## Refatoração (revisão recente)

A versão original foi gerada a partir do template "Navigation Drawer" do Android Studio e tinha pontas soltas típicas de um primeiro projeto. Nesta revisão:

- As nove telas que apontavam para o mesmo fragment (e portanto exibiam conteúdo idêntico) foram unificadas em um único `SecaoFragment` parametrizado
- Corrigido o item "Regulamento de Graduação", que tinha id divergente entre menu e grafo e não navegava
- Removidos fragments órfãos, código morto e comentários de depuração
- Conteúdo de cada seção centralizado em uma única fonte de dados

## Como rodar

1. Abra o projeto no **Android Studio**
2. Aguarde o **Gradle Sync** baixar as dependências
3. Rode em um emulador ou dispositivo (minSdk 21)

## Status

Protótipo / projeto de aprendizado. A integração com dados oficiais da UFTM permanece como o passo que daria sentido pleno ao app, mas depende de acesso institucional.

## Autor

**Lucas Daniel** — [GitHub](https://github.com/NoodleLDS)
