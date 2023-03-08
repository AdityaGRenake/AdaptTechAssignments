import { useEffect, useState } from "react"
import { Link } from "react-router-dom";
const DisplayAll=()=>{

    const[displayall,setDisplayall]=useState(null);

    useEffect(()=>{
        setTimeout(()=>{
            fetch("http://localhost:8080/displayall")
            .then((res)=>{return res.json()})
            .then((data)=>{
                console.log(data.slice(0,10));
                setDisplayall(data.slice(0,10));
            })
        } , 3000)
    },[])

    return(
        <div>
            <h1>Top 10 Items</h1>
            <hr />
            {!displayall&& <h1>Loading....</h1> }

            { displayall &&

            <table border="2px">
                <thead>
                    <tr>
                        <th>Slno</th>
                        <th>name</th>
                        <th>price</th>
                        <th>item</th>
                        <th>model</th>
                        <th>category</th>
                        <th>description</th>
                        <th>link</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        displayall.map((dispaly,i)=>{
                            return(
                                <tr>
                                <td>{i+1}</td>
                                <td>{dispaly.productname}</td>
                                <td>{dispaly.productprice}</td>
                                <td>{dispaly.itemNumber}</td>
                                <td>{dispaly.modelnumber}</td>
                                <td>{dispaly.productcategory}</td>
                                <td>{dispaly.productdescription}</td>
                                <td>{dispaly.productlink}</td>
                            </tr>
                            )
                        })
                    }
                </tbody>
            </table>

            }
             <Link to="/">Go Back To Main Page</Link><br></br>
        </div>
    )
}

export default DisplayAll