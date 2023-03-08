import { useRef } from "react";
import{Link} from "react-router-dom";

function Home()
{
    let name=useRef();
    let price=useRef();
    let itemnum=useRef();
    let model=useRef();
    let category=useRef();
    let description=useRef();
    let link=useRef();

    // private String productname;
	// private double productprice;
	// private int ItemNumber;
	// private String modelnumber;
	// private String productcategory;
	// private String productdescription;
	// private String productlink;
    let handleSubmit=(e)=>
    {
        e.preventDefault();
        let newAssigenment={
            productname:name.current.value,
            productprice:price.current.value,
            itemNumber:itemnum.current.value,
            modelnumber:model.current.value,
            productcategory:category.current.value,
            productdescription:description.current.value,
            productlink:link.current.value,
        }
        console.log(newAssigenment);

        fetch("http://localhost:8080/addDetails",
                                                 {
                                                    method:"POST",
                                                    headers:{"Content-Type":"application/json"},
                                                    body:JSON.stringify(newAssigenment)
                                                 })

                            .then(()=>{
                                alert("Details Submitted")
                                name.current.value="";
                                price.current.value="";
                                itemnum.current.value="";
                                model.current.value="";
                                category.current.value="";
                                description.current.value="";
                                link.current.value="";
                            })
    }
    return(
        <div>
            <h1>Add Details</h1>
            <hr />
            <form onSubmit={handleSubmit}>
                <h2>productname</h2>
                <input type="text" placeholder="Product name" ref={name} />
                <br />
                <h2>productprice</h2>
                <input type="text" placeholder="product price" ref={price} />
                <br />
                <h2> itemnumber</h2>
                <input type="number" placeholder="item number" ref={itemnum} />
                <br />
                <h2>modelnumber</h2>
                <input type="text" placeholder="Model number" ref={model} />
                <br />
                <h2>productcategory</h2>
                <input type="text" placeholder="product category" ref={category} />
                <br />
                <h2>productdescription</h2>
                <input type="text" placeholder="product description" ref={description} />
                <br />
                <h2>productlink</h2>
                <input type="text" placeholder="product link" ref={link} />
                <br />
                <br />
                <input type="submit" />

            </form>
            <Link to="/displayAll">View Top 10 Datas</Link>

        </div>
    )
}


export default Home