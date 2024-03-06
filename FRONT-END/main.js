const formulario = document.querySelector(".formulario");
const Inome = document.querySelector('#nome')
const Iemail = document.querySelector("#email");
const Itelefone = document.querySelector("#telefone");

function cadastrar(){
    fetch ("http://localhost:8080/contact",//endereço de acesso à API, fecth = busque esse endpoint
        {
            headers:{
                'Accept': 'application/json', //aceite a aplicação json
                'Content-Type': 'application/json'//tipo de conteúdo será json
            },
            method:'POST',//nesse método de cadastrar ele irá usar o método POST, publique
            body: JSON.stringify({//converta o valor desses dados do input para formato de JSON
                nome:  Inome.value,
                email: Iemail.value,
                telefone: Itelefone.value
            })
        })
        .then(function(res){console.log(res)})
        .catch(function(res){console.log(res)})
}

function clearInputs(){
    Inome.value = '';
    Iemail.value = '';
    Itelefone.value = '';
}

formulario.addEventListener('submit', function(evento){
    evento.preventDefault();
    cadastrar();
    clearInputs();
})