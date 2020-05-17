<template>
<div>
  <Menu/>
  <FormCliente/>
</div>
</template>

<script>
import FormCliente from "@/components/FormCliente.vue";
import Menu from "@/components/Menu.vue";
export default {
    name:'FormClienteView',
    components: {
        Menu,
        FormCliente
    }

};
</script>

<style>
</style>