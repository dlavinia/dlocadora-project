<template>
<div>
    <Menu/>
    <FormCarro/>
</div>
</template>
<script>
import Menu from "@/components/Menu.vue";
import FormCarro from "@/components/FormCarro.vue";
export default {
    name: 'FormCadastroCarro',
    components: {
      Menu,
      FormCarro

    }
}
</script>