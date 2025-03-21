import React, { useRef } from "react";

const UseRef = () => {
  const inputRef = useRef<HTMLInputElement>(null);
  return (
    <div>
      <h1>UseRef</h1>
      <input ref={inputRef} type="text" />
      <button onClick={() => inputRef.current?.focus()}>Focus</button>
    </div>
  );
};

export default UseRef;
