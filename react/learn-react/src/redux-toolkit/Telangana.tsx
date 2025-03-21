import React from "react";
import { useAppDispatch, useAppSelector } from "./hooks";
import Hyderabad from "./Hyderabad";
import { increment } from "./slices/counter";

const Telangana = () => {
  const count = useAppSelector((state) => state.counter);
  const dispatch = useAppDispatch();
  return (
    <div className="border">
      <h1>Telangana</h1>
      <h2>Counter: {count}</h2>
      <button onClick={() => dispatch(increment())}>TG++</button>
      <Hyderabad />
    </div>
  );
};

export default Telangana;
