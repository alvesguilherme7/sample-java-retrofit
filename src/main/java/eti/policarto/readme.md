# Teste Com Retrofit em Java | API ViCep

Para entender o funcionameno do retrofit, fiz este simples teste em java.
Ele consome a API do ViaCep. 

O site oficial do retrofit � https://square.github.io/retrofit/.
E o do viacep � https://viacep.com.br/.

O retrofit � um framework que facilita a organiza��o e a comunica��o com APIs e traz ela para o mundo orientado a objetos. 
Al�m disso � poss�vel "plugar" conversores e outros plugins para fazerem outros papeis na comunica��o com a API.
Um exemplo f�cil � o Gson para converter objetos em JSON. 

Este projeto � um exemplo disso. 

 Em api/services � configurado o retrofit para criar a base da comnica��o e ligar o objeto com a interface.
 A interface representa os endpoints da API, bem como seus par�metros e outros. 
 
 Em api/interfaces est�o as interfaces necess�rias para comunica��o. Representa o endpoint que ser� chamado. 
 
 Em api/pojo est� o objeto que ser� convertido apartir do JSON que vir da API
 
 Em app/Main est� uma simples classe para executar a busca na API.
 