<template>
  <div class="home">
    <Menu />
    <div class="bg">
      <div class="container">
        <div class="cadastro-container">
          <div class="content">
            <section>
              <img src="@/assets/logo.svg" />
            </section>

            <div id="home-btn">
              <div class="container">
                <h2>Escolha uma de nossas ofertas!</h2>
                <button class="btn btn-dark" style="margin: 20px">
                 <router-link to="/carros">Procurar um carro para alugar</router-link>
                  </button> 
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src


import Menu from "@/components/Menu.vue";
export default {
  name: "Home",
  components: {
    Menu
  }
};
</script>
<style scoped>

@import '../styles/global.css';
*{
	margin: 0px;
	padding: 0px;
}

#home{
background-image: linear-gradient(#fff700, #ffa200);
height: 100vh;
}
#home-right{
	align-items: center;
	width: 50%;
	height: 400px;
	padding: 30px;
	float: right;
	padding-top: 100px;


}
#form-home{
	width: 65%;
	padding: 50px;
	background: orange;
	border-top-right-radius: 20px;
	border-bottom-left-radius: 20px;
	box-shadow: 5px 10px;
}

#home-left{
	display: flex;
	flex-direction: column;
	align-items: center;
	width: 50%;
	height: 400px;
	padding: 50px;
	float: left;

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
</style>