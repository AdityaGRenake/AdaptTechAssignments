import { BrowserRouter, Routes, Route  } from 'react-router-dom'
import './App.css';
import DisplayAll from './components/DisplayAll';
import Home from './components/Home';


function App() {
  return (
    <BrowserRouter>
    
    <div className="App">
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path='/displayAll' element={<DisplayAll/>}/>
        
      </Routes>
      
      
     
    </div>
    </BrowserRouter>
  );
}


export default App;
