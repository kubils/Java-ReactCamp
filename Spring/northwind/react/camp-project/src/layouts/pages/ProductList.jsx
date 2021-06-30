import React, {useEffect, useState} from 'react'
import { Link } from 'react-router-dom'
import { Icon, Menu, Table, Button} from 'semantic-ui-react'
import ProductService from '../services/productService'
import { useDispatch } from 'react-redux'
import {addToCart} from '../../store/actions/cartActions'
import {toast} from 'react-toastify'

export default function ProductList() {

    //dispatch action, function name call
    const dispatch = useDispatch()
    const handleAddToCart = (product) => {
        dispatch(addToCart(product));
        toast.success(`${product.productName}`)
    }
    //hooks
    //destructer  ;
    //useState returns objects and function 
    //hook setP to products
    const [products, setProducts] = useState([])
    //products.map((p) => (...
    //when products changed page render again

    //hooks
    useEffect(() =>{
        //services -> productservice
        let productService = new ProductService()
        //if success then(...) false catch(...)
        // setProducts send to products
        //axios data.(localhost)data
        productService.getProducts().then(result => setProducts(result.data.data))
    }, [])  //[] stage change usage 



    return (
        <div>
            <Table celled>
                <Table.Header>
                    <Table.Row>
                        <Table.HeaderCell>Product Name</Table.HeaderCell>
                        <Table.HeaderCell>Unit Price</Table.HeaderCell>
                        <Table.HeaderCell>In Stock</Table.HeaderCell>
                        <Table.HeaderCell>Info</Table.HeaderCell>
                        <Table.HeaderCell>Category</Table.HeaderCell>
                        <Table.HeaderCell></Table.HeaderCell>
                    </Table.Row>
                </Table.Header>

                <Table.Body>
                    {
                       products.map((p) => (
                        //unique
                        //connection with data  : swagger data
                        <Table.Row key={p.id}>
                            <Table.Cell><Link to = {`/products/${p.productName}`}>{p.productName}</Link></Table.Cell>
                            <Table.Cell>{p.unitPrice}</Table.Cell>
                            <Table.Cell>{p.unitsInStock}</Table.Cell>
                            <Table.Cell>{p.quantityPerUnit}</Table.Cell>
                            <Table.Cell>{p.category.categoryName}</Table.Cell>
                            {/* to avoid render all item to cart onclick(()=>functname(p) ) */}
                            <Table.Cell><Button onClick={() => handleAddToCart(p)}>Add To Cart</Button></Table.Cell>
                        </Table.Row>
                       ))
                    }

                    
                </Table.Body> 

                <Table.Footer>
                    <Table.Row>
                        <Table.HeaderCell colSpan='3'>
                            <Menu floated='right' pagination>
                                <Menu.Item as='a' icon>
                                    <Icon name='chevron left' />
                                </Menu.Item>
                                <Menu.Item as='a'>1</Menu.Item>
                                <Menu.Item as='a'>2</Menu.Item>
                                <Menu.Item as='a'>3</Menu.Item>
                                <Menu.Item as='a'>4</Menu.Item>
                                <Menu.Item as='a' icon>
                                    <Icon name='chevron right' />
                                </Menu.Item>
                            </Menu>
                        </Table.HeaderCell>
                    </Table.Row>
                </Table.Footer>
            </Table>
        </div>
    )
}
