<template>
  <div class="bg">
    <div class="container">
      <nav aria-label="breadcrumb">
        <ol class="breadcrumb" style="padding-left: 0px; background: transparent;">
          <li class="breadcrumb-item" aria-current="page">
            <router-link to="/" style="color:#000">Home</router-link>
          </li>
          <li class="breadcrumb-item active" aria-current="page">Alugar carro</li>
        </ol>
      </nav>
      <div class="cadastro-container">
        <div class="content">
          <section>
            <img src="../assets/logo.png" />
          </section>

          <form @submit.prevent="salvar" >
            <h1>Cadastro do cliente</h1>
            <div class="row">
              <div class="col-6">
                <label for="nome">Nome:</label>
                <input
                  type="text"
                  name="nome"
                  id="nome"
                  placeholder="Nome"
                  v-model="cliente.nome"
                  class="form-control"
                  required
                />
              </div>
              <div class="col-6">
                <label for="cpf">CPF:</label>
                <input
                  type="text"
                  name="cpf"
                  id="cpf"
                  placeholder="xxx.xxx.xxx-xx"
                  v-model="cliente.cpf"
                  class="form-control"
                  required
                />
              </div>
            </div>
            <div class="row" style="margin-top: 8px">
              <div class="col-6">
                <label for="email">Email:</label>
                <input
                  type="text"
                  name="email"
                  id="email"
                  placeholder="joaosilva@exemplo.com"
                  v-model="cliente.email"
                  class="form-control"
                  required
                />
              </div>
              <div class="col-6">
                <label for="endereco">Endereço:</label>
                <input
                  type="text"
                  name="endereco"
                  id="endereco"
                  placeholder="Cidade"
                  v-model="cliente.endereco"
                  class="form-control"
                  required
                />
              </div>
            </div>

            <button type="submit" class="btn btn-dark button">Cadastrar</button>

            <button class="btn btn-outline-dark button" >
              <router-link to="/carros" style="color:#000">Cancelar</router-link>
            </button>
          </form>

          <!-- <div v-show="!cliente.idCliente == ''" > 
          <button class="btn btn-dark button"></button>-->
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import Cliente from "@/services/Cliente";
export default {
  name: "FormCliente",

  data() {
    return {
      cliente: {
        idCliente: "",
        nome: "",
        cpf: "",
        email: "",
        endereco: ""
      }
    };
  },

  methods: {
    salvar() {
      Cliente.salvar(this.cliente).then(resposta => {
        alert("Cadastrado com sucesso!");
        this.cliente = {};
        this.cliente = resposta;
      });
    }
  }
};
</script>

<style>
</style>