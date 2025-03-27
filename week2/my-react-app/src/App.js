import logo from './logo.svg';
import './App.css';

function Greeting(props){
  return <h1>Xin chào, {props.name}</h1>
}

function App() {
  return <Greeting name = "Viet Long"/>;
}

export default App;
