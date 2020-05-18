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
            <table class="table table-borderless tabela" v-for="carro of carros" :key="carro.id">
              <thead>
                <tr>
                  <h2>Dados do veículo</h2>
                </tr>
              </thead>

              <tbody>
                <tr>
                  <th scope="row">Marca:</th>
                  <td>{{ carro.marca }}</td>
                </tr>
                <tr>
                  <th scope="row">Modelo:</th>
                  <td>{{ carro.modelo }}</td>
                </tr>
                <tr>
                  <th scope="row">Placa:</th>
                  <td>{{ carro.placa }}</td>
                </tr>
                <tr>
                  <th scope="row">Valor da diaria:</th>
                  <td>{{ carro.valorDiaria }}</td>
                </tr>
              </tbody>
            </table>
          </section>

          <div
            class="linha-vetical"
            style="height: 30vh; border-left: 2px solid rgba(0, 0, 0, 0.4);"
          ></div>

          <form @submit.prevent="salvar">
            <h1>Efetuar aluguel</h1>
            <div class="row">
              <div class="col-6">
                <label for="inicio">Data de inicio:</label>
                <input
                  type="date"
                  v-model="aluguel.dt_inicio"
                  name="inicio"
                  id="inicio"
                  class="form-control"
                  required
                />
              </div>
              <div class="col-6">
                <label for="entrega">Data de entrega::</label>
                <input
                  type="date"
                  name="entrega"
                  v-model="aluguel.dt_fim"
                  sid="entrega"
                  class="form-control"
                  required
                />
              </div>
            </div>
            <div class="row" style="width: 40%;">
              
              
            </div>

            <button type="submit" class="btn btn-dark button">Finalizar</button>
            <a class="btn btn-outline-dark button">Cancelar</a>
          </form>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import Carro from "@/services/Carro";
import Aluguel from "@/services/Aluguel";
export default {
  name: "FormAluguel",

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
      aluguel: {
        carro: {},
        cliente: {},
        dt_inicio: "",
        dt_fim: "",
        idAluguel: ""
      },
      carros: {}
    };
  },

  mounted() {
    this.listar();
  },
  methods: {
    listar() {
      var idCarro = this.$route.params.idCarro;
      Carro.listarbyId(idCarro).then(resposta => {
        this.carros = resposta.data;
      });
    },
    salvar() {
      Aluguel.salvar(this.aluguel).then(resposta => {
        this.aluguel = {};
        this.aluguel = resposta;
        alert("Alugado com sucesso!");
      });
    }
  }
};
/**  ## CODIGO PRA CALCULAR O VALO TOTAL DO ALUGUEL ##
 * nao tá dando pra executar, mas no sublime tava funcionando kk 
function calcular_taxa() {
  var valor = document.getElementById("valor");
  var date1 = new Date(document.getElementById("inicio").value);
  var date2 = new Date(document.getElementById("entrega").value);

  var timeDiff = Math.abs(date2.getTime() - date1.getTime());
  var diffDays = Math.ceil(timeDiff / (1000 * 3600 * 24));

  var valorfinal = diffDays * 100;

  valor.innerHTML = valorfinal;
  
}*/
</script>

<style>
</style>