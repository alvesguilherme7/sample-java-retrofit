# Teste Com Retrofit em Java | API ViCep

Para entender o funcionameno do retrofit, fiz este simples teste em java.
Ele consome a API do ViaCep. 

O site oficial do retrofit é https://square.github.io/retrofit/.
E o do viacep é https://viacep.com.br/.

O retrofit é um framework que facilita a organização e a comunicação com APIs e traz ela para o mundo orientado a objetos. 
Além disso é possível "plugar" conversores e outros plugins para fazerem outros papeis na comunicação com a API.
Um exemplo fácil é o Gson para converter objetos em JSON. 

Este projeto é um exemplo disso. 

 Em api/services é configurado o retrofit para criar a base da comnicação e ligar o objeto com a interface.
 A interface representa os endpoints da API, bem como seus parâmetros e outros. 
 
 Em api/interfaces estão as interfaces necessárias para comunicação. Representa o endpoint que será chamado. 
 
 Em api/pojo está o objeto que será convertido apartir do JSON que vir da API
 
 Em app/Main está uma simples classe para executar a busca na API.
 