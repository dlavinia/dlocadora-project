<template>
    <div>
        <Menu/>
        <FormAluguel/>
    </div>
   
</template>

<script>
import Menu from "@/components/Menu.vue";
import FormAluguel from "@/components/FormAluguel.vue";
export default {
    name:'FormAluguelView',
    components:{
        Menu,
        FormAluguel
    }
}
</script>

<style>

</style>