import React from 'react'
import CartSummary from './CartSummary'
import { Button, Dropdown, Menu } from 'semantic-ui-react'
import { Container, Header } from 'semantic-ui-react'

export default function Navi() {
    return (
        <div>
            {/* <CartSummary /> */}
            <Menu inverted fixed="top" >

                <Container>

                    <Menu.Item
                        name='home'

                    />
                    <Menu.Item
                        name='messages'

                    />

                    <Menu.Menu position='right'>
                        
                        {/* CartSummary file import */}
                        <CartSummary/>

                        <Menu.Item>
                            <Button primary>Sign Up</Button>
                        </Menu.Item>
                </Menu.Menu>
                </Container>
            </Menu>
        </div>
    )
}
