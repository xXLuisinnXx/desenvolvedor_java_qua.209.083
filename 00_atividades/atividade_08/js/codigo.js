const form = document.querySelector('form');

const exibir = () => {
    let nome = document.querySelector('#nome').value;
    let data = document.querySelector('#data').value;
    let genero = document.querySelector('#genero').value;
    let email = document.querySelector('#email').value;
    let telefone = document.querySelector('#telefone').value;
    let peso = document.querySelector('#peso').value.replace(",",".");
    let altura = document.querySelector('#altura').value.replace(",",".");
    let imc = peso/(altura*altura);

    result = (imc <18.5) ? "Abaixo do peso":
    (imc < 25) ? "Peso normal":
    (imc < 30) ? "Acima do peso":
    (imc < 35) ? "Obesidade 1":
    (imc < 40) ? "Obesidade 2":
    "Obesidade 3";

    
    // saida de dados
    document.querySelector('#result').innerHTML = `Nome: ${nome} <br> Data: ${data}<br> Gênero:${genero}<br> Email: ${email}<br> Telefone: ${telefone}<br> Peso: ${peso}<br> Altura: ${altura} <br> IMC: ${imc.toFixed(2)} <br> Diagnóstico: ${result}`;


}

form.addEventListener('submit', function(event){
    event.preventDefault();
    exibir();
    

})