import React from 'react'
import { Menu, Image, Dropdown } from 'semantic-ui-react'



export default function SignedIn(props) {
    return (
        <div>
            <Menu.Item>
                <Image avatar spaced = "right " src = "https://res.cloudinary.com/dp3iwc0ug/image/upload/v1623237331/mbkhqjm199gl6y1tgqja.png"/>

                <Dropdown pointing = "top left" text = "Kubilay Sevim">
                    <Dropdown.Menu>
                        <Dropdown.Item text = "Information" icon = "info"/>
                        <Dropdown.Item text = "Exit" icon = "sign-out" onClick={props.signOut}/>
                    </Dropdown.Menu>
                </Dropdown>

            </Menu.Item>
        </div>
    )
}
