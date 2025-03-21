import React from "react";
import Telangana from "./Telangana";
import { useAppDispatch, useAppSelector } from "./hooks";
import { reset } from "./slices/counter";

const India = () => {
  const count = useAppSelector((state) => state.counter);
  const dispatch = useAppDispatch();
  return (
    <div className="border">
      <h1>India</h1>
      <h2>Counter: {count}</h2>
      <button onClick={() => dispatch(reset())}>Ind 0</button>
      <Telangana />
    </div>
  );
};

export default India;
