import React, { useState } from 'react'
import CartSummary from './CartSummary'
import {Menu } from 'semantic-ui-react'
import { Container } from 'semantic-ui-react'
import SignedIn from './SignedIn'
import SignedOut from './SignedOut'
import { Link, useHistory } from 'react-router-dom'
import { useSelector } from 'react-redux'

export default function Navi(props) {

    const { cartItems } = useSelector(state => state.cart)

    //destructor 
    const [isAuthenticated, setIsAuthenticated] = useState(true) // isAuthenticates ? true : false signedin or signedout 
    const history = useHistory()

    function handleSignOut(params) {
        setIsAuthenticated(false)
        //after exit return home page
        history.push("/")
    }

    function handleSignIn(params) {
        setIsAuthenticated(true)
    }


    return (
        <div>
            {/* <CartSummary /> */}
            <Menu inverted fixed="top" >

                <Container>
                    
                    <Menu.Item
                        name='home' 
                        as={ Link } to = '/'    
                    />
                    <Menu.Item
                        name='messages'

                    />

                    <Menu.Menu position='right'>
                        
                        {/* CartSummary file import */}
                        {cartItems.length>0&& <CartSummary/>}
                        
                         {/* props :  signOut = {handleSignOut} */}
                        {isAuthenticated? <SignedIn signOut = {handleSignOut}/> : <SignedOut signIn= {handleSignIn}/>}  
                        
            
                </Menu.Menu>
                </Container>
            </Menu>
        </div>
    )
}
