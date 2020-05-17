import { http } from "./config"

export default {
    listar:() => {
        return http.get('carros')
    },

    salvar:(carro) => {
        return http.post('carros', carro)
    },

    listarbyId:(id) => {
        return http.get('carros', id)
    },
}