import React, {useEffect, useState } from 'react'
import { useParams} from 'react-router'
import { Button, Card, Image } from 'semantic-ui-react'
import ProductService from '../services/productService'

export default function ProductDetail() {

    //desctructor
    let { name } = useParams()

    
    const [product, setProduct] = useState({})
    //hooks
    useEffect(() =>{
    //services -> productservice
        let productService = new ProductService()
        //if success then(...) false catch(...)
        // setProducts send to products
        //axios data.(localhost)data
        productService.getByProductName(name).then(result => setProduct(result.data.data))
    }, [])  //[] stage change usage 

 

    return (
        <div>
            <Card.Group>
                <Card fluid>
                    <Card.Content>
                        <Image
                            floated='right'
                            size='mini'
                            src='https://react.semantic-ui.com/images/avatar/large/steve.jpg'
                        />
                        <Card.Header>{product.productName}</Card.Header>
                        <Card.Meta>Friends of Elliot</Card.Meta>
                        <Card.Description>
                            Steve wants to add you to the group <strong>best friends</strong>
                        </Card.Description>
                    </Card.Content>
                    <Card.Content extra>
                        <div className='ui two buttons'>
                            <Button basic color='green'>
                                Approve
                    </Button>
                            <Button basic color='red'>
                                Decline
                    </Button>
                        </div>
                    </Card.Content>
                </Card>
                
            </Card.Group>

        </div>
    )
}
