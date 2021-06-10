import React from 'react'
import { Button, Menu } from 'semantic-ui-react'


//props object dectruction : {}
export default function SignedOut({signIn}) { 
    return (
        <div>

            <Menu.Item>
                <Button primary onClick={signIn}>Sign In</Button>
                <Button primary style = {{marginLeft:'0.5em'}}>Sign Out</Button>
            </Menu.Item>
           
        </div>
    )
}
