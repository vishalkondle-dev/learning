import { useState } from "react";
import "./App.css";
import UseEffect from "./hooks/UseEffect";

function App() {
  const [show, setShow] = useState(true);
  return (
    <div className="App">
      <button onClick={() => setShow((oldState) => !oldState)}>
        Show / Hide
      </button>
      {show ? <UseEffect show={show} /> : <></>}
    </div>
  );
}

export default App;
