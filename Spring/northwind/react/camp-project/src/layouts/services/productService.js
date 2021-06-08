import axios from 'axios';

export default class ProductService {

    getProducts() {

        //get producs from backend host
        return axios.get("http://localhost:8080/api/products/getall")
        //return axios.get("")
    }
}
