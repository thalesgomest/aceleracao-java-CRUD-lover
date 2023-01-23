# Exercício: CRUD lover

### Métodos HTTP Desenvolvidos: Delete e Put

Implementar o listar, deletar e atualizar do exercício [Modela Ai](https://github.com/thalesgomest/aceleracao-java-modela-ai), também adicionando as devidas validações através da biblioteca `Validate I/O`.

-   [x] Execute a aplicação e faça um post na rota na rota `http://localhost:8080/api/car` com o seguinte corpo:

```JSON
{
	"modelo": "Fiat Argo 1.3",
	"fabricante": "Fiat",
	"dataFabricacao": "10/02/2006",
	"valor": 10.000,
	"anoModelo": 2023
}
```

-   [x] As informações serão salvas no banco de dados instanciado na memória enquanto a aplicação estiver rodando. Para obter os dados armazenados faça um GET para a seguinte rota `http://localhost:8080/api/car`, obtendo:

```JSON
{
    	"id": 1,
	"modelo": "Fiat Argo 1.3",
	"fabricante": "Fiat",
	"dataFabricacao": "10/02/2006",
	"valor": 10.000,
	"anoModelo": 2023
}
```

-   [x] Execute a aplicação e faça um put na rota `http://localhost:8080/api/car/{id}` com o seguinte corpo:

```JSON
{
	"modelo": "Fiat Argo 1.3",
	"fabricante": "Fiat",
	"dataFabricacao": "10/02/2006",
	"valor": 10.000,
	"anoModelo": 2023
}
```

-   [x] Execute a aplicação e faça um delete na rota `http://localhost:8080/api/car/{id}`
