// all state in 
import {combineReducers} from "redux";
import cartReducer from "./reducers/cartReducer";

const rootReducer = combineReducers ({
    cart : cartReducer,
    // user : userReducer
})

export default rootReducer;