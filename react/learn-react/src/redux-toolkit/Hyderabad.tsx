import React from "react";
import { useAppDispatch, useAppSelector } from "./hooks";
import { decrement } from "./slices/counter";

const Hyderabad = () => {
  const count = useAppSelector((state) => state.counter);
  const dispatch = useAppDispatch();
  return (
    <div className="border">
      <h1>Hyderabad</h1>
      <h2>Counter: {count}</h2>
      <button onClick={() => dispatch(decrement())}>Hyd--</button>
    </div>
  );
};

export default Hyderabad;
