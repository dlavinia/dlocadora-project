<template>
  <div>
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

        <div class="get-carros">
          <h1>CONFIRA NOSSAS OFERTAS!</h1>
          <ul>
            <li v-for = "carro of carros" :key="carro.id">
              <div class="row">
                <div class="col-6">
                  <strong>MARCA:</strong>
                  <p>{{ carro.marca }}</p>
                </div>
                <div class="col-6">
                  <strong>MODELO:</strong>
                  <p>{{ carro.modelo }}</p>
                </div>
              </div>
              <div class="row">
                <div class="col-6">
                  <strong>PLACA:</strong>
                  <p>{{ carro.placa }}</p>
                </div>
                <div class="col-6">
                  <strong>VALOR DA DIARIA:</strong>
                  <p>{{ carro.valorDiaria }}</p>
                </div>
              </div>
              
           <button class="btn btn-dark" >
            
             <router-link :to="{ name: 'alugar1', params: { id: carro.idCarro }}">ALUGAR </router-link>
            </button>
       
           
            </li>
          </ul>
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
        idCarro: "",
        marca: "",
        modelo: "",
        placa: "",
        valorDiaria: "",
        alugado: ""
      },
      carros: []
    };
  },

  mounted() {
    this.listar();
  },
  methods: {
    listar() {
      Carro.listar().then(resposta => {
        this.carros = resposta.data;
      });
    },

  }
};
</script>

<style>
h1{
    margin: 30px;
}
.get-carros ul{
    display: grid;
    grid-template-columns: repeat(2, 1fr);
    grid-gap: 24px;
    list-style: none;
}

.get-carros ul li{
    background: #FFF;
    padding: 24px;
    border-radius: 8px;
    position: relative;
}


.get-carros ul li strong{
    display: block;
    margin-bottom: 16px;
    color: #41414d;
}

.get-carros ul li p + strong {
    margin-top: 32px;
}

.get-carros ul li p{
    color: #737380;
    line-height: 21px;
    font-size: 16px;
}
</style>