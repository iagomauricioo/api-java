var forms = document.querySelector("#forms");
var button = document.querySelector("#submit-button");
var inputNome = document.querySelector("#input-username");
var inputPassw = document.querySelector("#input-password");
var inputEmail = document.querySelector("#input-email");
var inputTelefone = document.querySelector("#input-tel");
function cadastrar() {
    if (!inputNome.value || !inputEmail.value || !inputPassw.value || !inputTelefone.value) {
        alert("Por favor, preencha todos os campos obrigatórios.");
        return;
    }
    fetch("http://localhost:8080/usuarios", {
        headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        method: "POST",
        body: JSON.stringify({
            id: null,
            name: inputNome.value,
            email: inputEmail.value,
            senha: inputPassw.value,
            telefone: inputTelefone.value
        })
    })
        .then(function (res) { console.log(res); })
        .catch(function (res) { console.log(res); });
}
function limpar() {
    inputNome.value = "";
    inputPassw.value = "";
    inputEmail.value = "";
    inputTelefone.value = "";
}
forms.addEventListener('submit', function (ev) {
    ev.preventDefault();
    cadastrar();
    limpar();
});
