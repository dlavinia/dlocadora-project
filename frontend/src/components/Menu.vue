<template>
  <header>
    <nav class="navbar navbar-light" style="background-color: #fff700;">
        <span class="navbar-brand mb-0 h1">
            <router-link to="/">
            <img src="@/assets/logo-navbar.svg" />
        </router-link>
      </span>
      <button class="nav-item btn btn-dark">
        <router-link to="/cadastrarcarro">Cadastrar carro</router-link>
      </button>
    </nav>
  </header>
</template>

<script>
export default {
  name: "Menu"
};
</script>

<style>
*{
  margin: 0;
  padding: 0;
}
a {
  color: #fff;
  text-decoration: none;
}
a:hover {
  color: #fff;
  text-decoration: none;
}
</style>