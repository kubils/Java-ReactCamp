import React from 'react'
import { NavLink } from 'react-router-dom'
import { Dropdown, Label, DropdownDivider } from 'semantic-ui-react'
import { useSelector } from 'react-redux'

export default function CartSummary() {

    const { cartItems } = useSelector(state => state.cart)

    return (
        <div>
            <Dropdown item text='Cart'>
                <Dropdown.Menu>

                    {
                        cartItems.map((cartItem) => (
                            <Dropdown.Item key = {cartItem.product.id}>
                                
                                {cartItem.product.productName}
                                
                                <Label>
                                    {cartItem.quantity}
                                </Label>

                            </Dropdown.Item>


                        ))
                    }
                    {/* <Dropdown.Item>Phone</Dropdown.Item>
                                <Dropdown.Item>Computer</Dropdown.Item>
                                <Dropdown.Item>Shoes</Dropdown.Item> */}
                    <DropdownDivider></DropdownDivider>
                    {/* when click go cart usage root : semantic usage navlink */}
                    <Dropdown.Item as={NavLink} to="/cart">Go Cart</Dropdown.Item>
                </Dropdown.Menu>
            </Dropdown>
        </div>
    )
}
