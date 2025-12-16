const form = document.querySelector("form");
const telefoneMask = document.querySelector("#telefone");
const cepMask = document.querySelector("#cep");
const pesquisaCep = document.querySelector("#cep");

const vassoura = () => {
    document.querySelector("#estado").value = ("");
    document.querySelector("#cidade").value = ("");
    document.querySelector("#bairro").value = ("");
    document.querySelector("#logradouro").value = ("");
    document.querySelector("#estado").value = ("");
    document.querySelector("#complemento").value = ("");
    document.querySelector("#complemento").value = ("");
}

const meuCallback = (conteudo) => {
    if (!("erro" in conteudo)) {
        document.querySelector("#estado").value = (conteudo.uf);
        document.querySelector("#cidade").value = (conteudo.localidade);
        document.querySelector("#bairro").value = (conteudo.bairro);
        document.querySelector("#logradouro").value = (conteudo.logradouro);
        document.querySelector("#complemento").value = (conteudo.complemento);
    } else {
        vassoura();
        alert("CEP NÃO ENCONTRADO!");
    }
}


// TODO:1º ARRUMAR
// TODO: 2º FUNÇÕES DE MÁSCARA DE ENTRADA E FUNÇÃO PESQUISACEP
const exibirDados = () => {
    let nome = document.querySelector("#nome").value;
    let email = document.querySelector("#email").value;
    lenascimento = document.querySelector("#nascimento").value;
    let telefone = document.querySelector("#telefone").value;
    let cpf = document.querySelector("#cpf").value;
    let cep = document.querySelector("#cep").value;
    let estado = document.querySelector("#estado").value;
    let cidade = document.querySelector("#cidade").value;
    let bairro = document.querySelector("#bairro").value;
    let logradouro = document.querySelector("#logradouro").value;
    let complemento = document.querySelector("#complemento").value;
    let numero = document.querySelector("#numero").value;

    document.querySelector("#nomeResult").innerHTML = `<b>Nome:`;
    document.querySelector("#emailResult").innerHTML = `<b>E-mail:</b> $(email)`;
    document.querySelector("#nascimentoResult").innerHTML = `<b>Nascimento:</b> $(nascimento)`;
    document.querySelector("#telefoneResult").innerHTML = `<b>telefone<b>`;
    document.querySelector("#")
}

form.addEventListener('submit', function(event){
    event.preventDefault("");
})