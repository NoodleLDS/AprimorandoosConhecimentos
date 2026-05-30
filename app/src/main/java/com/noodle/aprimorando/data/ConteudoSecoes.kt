package com.noodle.aprimorando.data

/**
 * Fonte central de conteúdo do app.
 *
 * Cada seção do menu lateral carrega seu texto a partir daqui, em vez de ter
 * uma tela duplicada por seção. Na concepção original do projeto, este conteúdo
 * seria alimentado dinamicamente por uma API integrada aos sistemas oficiais da
 * UFTM — integração que não avançou por falta de liberação de acesso na época.
 * Os textos abaixo são descritivos e atemporais; dados específicos (datas,
 * normas vigentes) devem sempre ser conferidos nos canais oficiais.
 */
object ConteudoSecoes {

    data class Secao(val titulo: String, val corpo: String)

    private const val NOTA_API =
        "\n\nNa versão planejada do app, esta seção seria atualizada " +
        "automaticamente a partir dos dados oficiais da UFTM."

    val mapa: Map<String, Secao> = mapOf(
        "conheca_uftm" to Secao(
            "Conheça a UFTM",
            "A Universidade Federal do Triângulo Mineiro (UFTM) é uma instituição " +
            "pública federal sediada em Uberaba, Minas Gerais, com atuação no " +
            "ensino, na pesquisa e na extensão. Esta seção reúne uma visão geral " +
            "da universidade para orientar estudantes ingressantes." + NOTA_API
        ),
        "regulamento_de_graduacao" to Secao(
            "Regulamento de Graduação",
            "O Regulamento de Graduação reúne as normas que regem a vida acadêmica " +
            "dos estudantes: matrícula, frequência, avaliação, aproveitamento de " +
            "estudos, trancamento e demais procedimentos. O documento oficial e " +
            "atualizado deve ser consultado junto à Pró-Reitoria de Ensino." + NOTA_API
        ),
        "direitos_e_deveres" to Secao(
            "Direitos e Deveres do Discente",
            "Esta seção resume os principais direitos e deveres do estudante na " +
            "universidade — desde o acesso a programas de apoio e assistência " +
            "estudantil até as responsabilidades acadêmicas e de convivência " +
            "previstas no regimento institucional." + NOTA_API
        ),
        "pro_reitorias" to Secao(
            "Pró-Reitorias",
            "As Pró-Reitorias são os órgãos responsáveis por coordenar as grandes " +
            "áreas da universidade, como Ensino, Pesquisa, Extensão, Assuntos " +
            "Estudantis e Planejamento. Cada uma concentra serviços e informações " +
            "essenciais para o dia a dia acadêmico." + NOTA_API
        ),
        "institutos_uftm" to Secao(
            "Institutos UFTM",
            "A universidade organiza seus cursos e departamentos em institutos, que " +
            "agrupam áreas de conhecimento afins. Esta seção apresenta os institutos " +
            "e ajuda o estudante a localizar o seu curso dentro da estrutura da UFTM." + NOTA_API
        ),
        "diretorios_academicos" to Secao(
            "Diretórios Acadêmicos",
            "Os Diretórios Acadêmicos (DAs) são as entidades de representação dos " +
            "estudantes de cada curso. Eles organizam atividades, defendem os " +
            "interesses dos discentes e fazem a ponte entre os alunos e a " +
            "administração da universidade." + NOTA_API
        ),
        "ligas" to Secao(
            "Ligas Acadêmicas",
            "As Ligas Acadêmicas são grupos de estudo e prática, geralmente ligados " +
            "a um tema específico, que promovem atividades de ensino, pesquisa e " +
            "extensão complementares à grade do curso. São uma porta de entrada " +
            "importante para quem quer se aprofundar em uma área." + NOTA_API
        ),
        "iniciacao_cientifica" to Secao(
            "Iniciação Científica",
            "A Iniciação Científica permite que o estudante de graduação participe de " +
            "projetos de pesquisa sob orientação de um docente, muitas vezes com " +
            "bolsa (como nos programas PIBIC/PIBITI). É um primeiro contato " +
            "estruturado com o método científico e a vida acadêmica." + NOTA_API
        ),
        "coordenacoes" to Secao(
            "Coordenações de Curso",
            "A Coordenação é a referência administrativa e acadêmica de cada curso: " +
            "trata de matrícula em disciplinas, orientações sobre a grade, " +
            "aproveitamentos e encaminhamentos. Esta seção ajuda o estudante a " +
            "saber a quem recorrer." + NOTA_API
        ),
        "mural_de_informacoes" to Secao(
            "Mural de Informações",
            "Espaço destinado a avisos, comunicados e oportunidades de interesse dos " +
            "estudantes — editais, eventos, prazos e novidades da universidade." + NOTA_API
        ),
        "calendario_academico" to Secao(
            "Calendário Acadêmico",
            "O Calendário Acadêmico define as datas que estruturam o semestre: início " +
            "e fim das aulas, períodos de matrícula, provas, recessos e prazos " +
            "administrativos. A versão oficial e vigente é publicada pela " +
            "universidade a cada período letivo." + NOTA_API
        )
    )
}
