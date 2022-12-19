# Arquitetura de Microsserviços Java

Trabalho apresentado na disciplina de Arquitetura de Microsserviços Java, do curso de Pós-Graduação MIT em Engenharia de Software com Java, realizado no instituto INFNET.

## Objetivo

A aplicação tem por objetivo realizar a emissão de empenhos oriundos de um Processo Licitatório na qual o fornecedor foi vencedor.

O Empenho é a etapa em que o governo reserva o dinheiro que será pago quando o bem for entregue ou o serviço for concluído. Isso ajuda o governo a organizar os gastos pelas diferentes áreas do governo, evitando que se gaste mais do que foi planejado.

## Principais rotas:

http://localhost:8761/eureka/apps

http://localhost:8080/produto

http://localhost:8080/fornecedor

http://localhost:8080/processolicitatorio

http://localhost:8080/empenho

{
    "fornecedorId": 1,
    "processoLicitatorioId": 2,
    "listaProdutos": [
    {
        "id": 1
    },
    {
        "id": 2
    },
    {
        "id": 3
    }
]
}

## swagger

Fornecedor: http://localhost:8282/swagger-ui/index.html

Processo Licitatorio: http://localhost:8989/swagger-ui/index.html

Produto: http://localhost:8383/swagger-ui/index.html

Empenho: http://localhost:8181/swagger-ui/index.html

## Inserção de Dados Padrão

Para inserir os dados padrão nos bancos de dados, execute os scripts abaixo:

https://github.com/lucianokeunecke/MicroServico/blob/main/fornecedor/src/main/resources/arquivos/fornecedor.sql

https://github.com/lucianokeunecke/MicroServico/blob/main/processolicitatorio/src/main/resources/arquivos/ProcessoLicitatorio.sql

https://github.com/lucianokeunecke/MicroServico/blob/main/produto/src/main/resources/arquivos/produto.sql
