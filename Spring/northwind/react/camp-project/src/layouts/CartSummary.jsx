import React from 'react'
import { NavLink } from 'react-router-dom'
import {Dropdown, DropdownDivider} from 'semantic-ui-react'

export default function CartSummary() {
    return (
        <div>
           <Dropdown item text='Cart'>
                            <Dropdown.Menu>
                                <Dropdown.Item>Phone</Dropdown.Item>
                                <Dropdown.Item>Computer</Dropdown.Item>
                                <Dropdown.Item>Shoes</Dropdown.Item>
                                <DropdownDivider></DropdownDivider>
                                {/* when click go cart usage root : semantic usage navlink */}
                                <Dropdown.Item as = {NavLink} to = "/cart">Go Cart</Dropdown.Item>
                            </Dropdown.Menu>
            </Dropdown>
        </div>
    )
}
