const form = document.querySelector('form');
const cpfMask = document.querySelector('#cpf');
const telefoneMask = document.querySelector('#telefone');
const cepMask = document.querySelector('#cep');

const exibir = () => {
    // declaração de variaveis
    let nome = document.querySelector('#nome').value;
    let email = document.querySelector('#email').value;
    let nascimento = document.querySelector('#nascimento').value;
    let cpf = document.querySelector('#cpf').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;
    let endereco = document.querySelector('#endereço').value;

    //saida de dados
    document.querySelector('#nomeResult').innerHTML = `<br><b>Nome:</b> ${nome}<br>`;
    document.querySelector('#emailResult').innerHTML = `<b>Email:</b> ${email} <br>`;
    document.querySelector('#nascimentolResult').innerHTML = `<b>Data de nascimento:</b> ${nascimento} <br>`;
    document.querySelector('#cpfResult').innerHTML = `<b>CPF:</b> ${cpf} <br>`;
    document.querySelector('#telefoneResult').innerHTML = `<b>Telefone:</b> ${telefone}<br>`;
    document.querySelector('#cepResult').innerHTML = `<b>CEP:</b> ${cep}<br>`;
    document.querySelector('#endereçoResult').innerHTML = `<b>Endereço:</b> ${endereco}<br>`;

    // limpa os dados do formulario
    form.reset();
}

cpfMask.addEventListener('input', function() {
    this.value = this.value.replace(/\D/g, '')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d{1,2})$/, '$1-$2');
});

telefoneMask.addEventListener('input', function() {
    this.value = this.value.replace(/\D/g, '')
    .replace(/(\d{2})(\d)/, '($1) $2')
    .replace(/(\d{4,5})(\d)/, '$1-$2')
    .replace(/(-\d{4})\d+?$/, '$1');
});

cepMask.addEventListener('input', function(){
    this.value = this.value.replace(/\D/g, '')
    .replace(/(\d{5})(\d)/, '$1-$2')
    .replace(/(-\d{3})\d+?$/, '$1');
});

form.addEventListener('submit', function (event) {
    event.preventDefault();
    exibir();
})