# pamcary

End Point

GET http://localhost:8000/v1/alunos/
GET http://localhost:8000/v1/alunos/{ID}
POST http://localhost:8000/v1/alunos/
{ 
   "nome":"abraao",
	"idade":38
	
}
PUT http://localhost:8000/v1/alunos/{ID}
{ 
   "nome":"abraao",
	"idade":38
	
}


Rodar aplicação.

mvn spring-boot:run
