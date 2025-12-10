const form = document.querySelector('form');

const calcular = () => {
    let nome = document.querySelector('#nome').value;
    let data = document.querySelector('#data').value;
    let genero = document.querySelector('#genero').value;
    let email = document.querySelector('#email').value;
    let telefone = document.querySelector('#telefone').value;
    let peso = document.querySelector('#peso').value;
    let altura = document.querySelector('#altura').value;
    let result = 0;

    // calculo 
    result = peso/(altura*altura);
    document.querySelector('#result').innerHTML = result;
    
    
    const imc = (result <18.5) ? "Abaixo do peso":
    (result < 25) ? "peso normal":
    (result < 30) ? "acima do peso":
    (result < 35) ? "obesidade 1":
    (result < 40) ? "obesidade 2":
    "obesidade 3";

    // saida de dados
    document.querySelector('#result').innerHTML = `${nome} <br>${data}<br> ${genero}<br> ${email}<br> ${telefone}<br> ${peso}<br> ${altura}<br ${result}<br> ${imc}.`;
}

form.addEventListener('submit', function(event){
    event.preventDefault();
    calcular();

})