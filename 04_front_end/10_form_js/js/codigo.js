// declaração de variaveis
const form = document.querySelector("form");

form.addEventListener('submit',function(event) {
    // desativar o submit
    event.preventDefault();


    // declaração de variaveis locais
     let texto = document.querySelector('#texto').value;

     //exibi o texto em forma de dialogo
     alert(texto);
});