import React, { useState } from "react";

const UseState = () => {
  const [count, setCount] = useState(0);
  return (
    <div>
      <h1>UseState</h1>
      <button onClick={() => setCount((oldState) => oldState - 1)}>
        Decrement
      </button>
      {count}
      <button onClick={() => setCount((oldState) => oldState + 1)}>
        Increment
      </button>
    </div>
  );
};

export default UseState;
