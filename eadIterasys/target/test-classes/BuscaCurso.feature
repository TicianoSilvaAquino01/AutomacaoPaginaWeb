#language: pt
Funcionalidade: Busca Curso




#Cenario: Busca por curso Disponivel
#Dado que acesso o site da Iterasys
#Quando consulto pelo curso "Mantis" 
#Entao exibe uma lista com curso "Mantis"
#Quando clico em Matricule-se 
#Entao exibe o titulo "Mantis" e o valor "R$ 49,99"


#Cenario: Busca por curso indisponivel
#Dado que acesso o site da Iterasys
#Quando consulto pelo curso "Mantis1" 
#Entao exibe mensagem que o curso "Mantis1" nao encontrado







Esquema do Cenario: Buscar Varios Cursos
Dado que acesso o site da Iterasys
Quando consulto pelo <curso>
Entao exibe uma lista com <curso>
Quando clico em Matricule-se 
Entao exibe o titulo do <curso> e o valor <valor>

Exemplos: 
| curso     | valor    |
|"Mantis"   |"R$ 49,99"|
|"Fundamentos do Java" |"R$ 119,90"|
