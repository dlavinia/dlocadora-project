<template>
 <div>
  <Menu/>
  <GetCarros/>
 </div>
</template>

<script>
import Menu from '@/components/Menu.vue'
import GetCarros from '@/components/GetCarros.vue'

export default {
    name: 'GetCarrosView',
    components:{
        Menu,
        GetCarros

    }
}
</script>

<style>

</style>