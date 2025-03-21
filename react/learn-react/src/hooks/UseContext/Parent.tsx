import React from "react";
import Child from "./Child";

const Parent = ({ theme, color }: { theme: string; color: string }) => {
  return (
    <div
      style={{
        background: theme,
        border: `1px solid ${color}`,
        padding: "40px",
      }}
    >
      <h1 style={{ color }}>Parent</h1>
      <Child theme={theme} />
    </div>
  );
};

export default Parent;
