<template>
  <div class="bg">
    <div class="container">
      <nav aria-label="breadcrumb">
        <ol class="breadcrumb" style="padding-left: 0px; background: transparent;">
          <li class="breadcrumb-item" aria-current="page">
            <router-link to="/" style="color:#000">Home</router-link>
          </li>
          <li class="breadcrumb-item active" aria-current="page">Cadastrar Carro</li>
        </ol>
      </nav>

      <div class="cadastro-container">
        <div class="content">
          <section>
            <img src="@/assets/logo.png" />
          </section>

          <form class="needs-validation" @submit.prevent="salvar" novalidate>
            <h1>Cadastro de carros</h1>
            <div class="row">
              <div class="col-6">
                <label for="marca">Marca:</label>
                <input
                  type="text"
                  name="marca"
                  id="marca"
                  placeholder="Marca"
                  class="form-control"
                  v-model="carro.marca"
                  required
                />
              </div>
              <div class="col-6">
                <label for="modelo">Modelo:</label>
                <input
                  type="text"
                  name="modelo"
                  id="modelo"
                  placeholder="Modelo"
                  class="form-control"
                  v-model="carro.modelo"
                  required
                />
              </div>
            </div>
            <div class="row" style="margin-top: 8px">
              <div class="col-6">
                <label for="placa">Placa:</label>
                <input
                  type="text"
                  name="placa"
                  id="placa"
                  placeholder="Placa"
                  class="form-control"
                  v-model="carro.placa"
                  required
                />
              </div>
              <div class="col-6">
                <label for="diaria">Valor da diaria:</label>
                <input
                  type="text"
                  name="diaria"
                  id="diaria"
                  placeholder="R$ 00,00"
                  class="form-control"
                  v-model="carro.valorDiaria"
                  required
                />
              </div>
            </div>
           <router-link to="/"> <button class="btn btn-outline-dark button">Cancelar</button> </router-link>
            <button type="submit" class="btn btn-dark button">Cadastrar</button>
          </form>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import Carro from "@/services/Carro";
export default {
  name: "FormCarro",

  data() {
    return {
      carro: {
        id: "",
        marca: "",
        modelo: "",
        placa: "",
        valorDiaria: "",
        isAlugado:""
      },
      carros: []
    };
  },

  methods: {
    salvar() {
      Carro.salvar(this.carro).then(resposta => {
        this.carro = {};
        alert("Cadastrado com sucesso!");
        this.carro = resposta;
      });
    },
   
}
}
</script>
<style scoped>

@import '../styles/global.css';
*{
  margin: 0;
  padding: 0;
}
button{
  padding: 8px;
}
.container {
    width: 100%;
    padding-right: 15px;
    padding-left: 15px;
    margin-right: auto;
    margin-left: auto;
}
.cadastro-container .content form{
    width: 100%;
    max-width: 450px;
}
.cadastro-container .content form input{
 margin: 8px;
}
</style>