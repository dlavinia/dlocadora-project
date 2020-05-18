import { http } from "./config"

export default {
    salvar:(aluguel) => {
        return http.post('algueis/{idCarro}/{idCliente}', aluguel)
    }

}