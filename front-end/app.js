const forms = document.querySelector("#forms");
const button = document.querySelector("#submit-button");
const inputNome = document.querySelector("#input-username");
const inputPassw = document.querySelector("#input-password");
const inputEmail = document.querySelector("#input-email");
const inputTelefone = document.querySelector("#input-tel");
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
